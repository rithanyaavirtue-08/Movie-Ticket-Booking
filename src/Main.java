import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ViewerInterface viewer1 = new Viewer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Screen Type(GOLD/SILVER):");
        String screenType1 = sc.nextLine();
        viewer1.setScreenType(screenType1);
        System.out.println("Enter Number of Seats:");
        BigInteger seats1 = new BigInteger(sc.nextLine());
        viewer1.setNumberOfSeats(seats1.intValue());
        System.out.println("Do you want Snacks:");
        String snacks = sc.nextLine();
        viewer1.setWantsSnacks(snacks);

        if (snacks.equals("yes"))
        {
            System.out.println("Enter snack quantity: ");
            BigInteger quantity1 = new BigInteger(sc.nextLine());
            viewer1.setQuantity(quantity1.intValue());
        }

        ViewerInterface viewer2 = new Viewer();
        System.out.println("Enter the Screen Type(GOLD/SILVER):");
        String screenType2 = sc.nextLine();
        viewer2.setScreenType(screenType2);
        System.out.println("Enter Number of Seats:");
        BigInteger seats2 = new BigInteger(sc.nextLine());
        viewer2.setNumberOfSeats(seats2.intValue());
        System.out.println("Do you want Snacks:");
        String snacks2 = sc.nextLine();
        viewer2.setWantsSnacks(snacks);

        if (snacks2.equals("yes"))
        {
            System.out.println("Enter snack quantity:");
            BigInteger quantity2 = new BigInteger(sc.nextLine());
            viewer2.setQuantity(quantity2.intValue());
        }

        int viewer1Bill = 0;
        int viewer2Bill = 0;
        //two methods of implementing an array

        if (viewer1.getScreenType().equals("GOLD")) {
            System.out.println("=======Viewer 1:GOLD======");
            int[][] goldScreen = new int[6][5];
            goldScreen[0] = new int[]{1, 2, 3, 4, 5};//i denotes row and j denotes element
            for (int i = 0; i < goldScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++) {
                    if (i == 0 && j == 0) {//only in starting space
                        System.out.print(" ");

                    }
                    System.out.print(goldScreen[i][j]);//print in same line
                    System.out.print(" ");
                }

                System.out.println();//cursor moving next line
            }
            for (int i = 0; i < viewer1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadBooked = false;
                while (!isValidSeat || !isAlreadBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        //trying to change it as input so useing explicit
                        //to get the string value and change to int
                        BigInteger seats = new BigInteger(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats.intValue() - 1;//getting value in int then calculating
                        if (goldScreen[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        goldScreen[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;
                        isAlreadBooked = true;//saying it is correct
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }


            ScreenInterface gold = new GoldScreen("P64", 500, 150, 100);
            ScreenInterface[] arr = viewer1.getSi();
            arr[0] = gold;
            gold.setViewer(viewer1);
            gold.TicketPrice();
            gold.SnackPrice();
            gold.generateBill();
            gold.Discount();
            System.out.println("======BOOKING SUMMARY=====");
            System.out.println(arr[0].getBookingId());
            System.out.println(arr[0].getTicketPrice());
            System.out.println(arr[0].getSnackPrice());
            System.out.println(arr[0].getTotalBill());
            viewer1Bill = gold.getTotalBill();
        }

        else {
            System.out.println("=======Viewer 1:SILVER======");
            int[][] silverScreen = new int[6][5];
            silverScreen[0] = new int[]{1, 2, 3, 4, 5};//i denotes row and j denotes element
            for (int i = 0; i < silverScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++) {
                    if (i == 0 && j == 0) {//only in starting space
                        System.out.print(" ");

                    }
                    System.out.print(silverScreen[i][j]);//print in same line
                    System.out.print(" ");
                }

                System.out.println();//cursor moving next line
            }
            for (int i = 0; i < viewer1.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBooked = false;
                while (!isValidSeat || !isAlreadyBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        //trying to change it as input so useing explicit
                        //to get the string value and change to int
                        BigInteger seats = new BigInteger(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats.intValue() - 1;//getting value in int then calculating
                        if (silverScreen[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadyBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        silverScreen[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;//saying it is correct
                        isAlreadyBooked = true;
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }
            ScreenInterface silver = new SilverScreen("S11", 200, 80);
            silver.setViewer(viewer1);
            ScreenInterface[] arr = viewer1.getSi();
            arr[1] = silver;
            silver.TicketPrice();
            silver.SnackPrice();
            silver.generateBill();
            silver.Discount();
            System.out.println("======BOOKING SUMMARY=====");
            System.out.println(silver.getBookingId());
            System.out.println(silver.getTicketPrice());
            System.out.println(silver.getSnackPrice());
            System.out.println(silver.getTotalBill());
            viewer1Bill = silver.getTotalBill();

        }

        if (viewer2.getScreenType().equals("GOLD")) {
            System.out.println("=======Viewer 2:GOLD======");
            int[][] goldScreen = new int[6][5];
            goldScreen[0] = new int[]{1, 2, 3, 4, 5};//i denotes row and j denotes element
            for (int i = 0; i < goldScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++) {
                    if (i == 0 && j == 0) {//only in starting space
                        System.out.print(" ");

                    }
                    System.out.print(goldScreen[i][j]);//print in same line
                    System.out.print(" ");
                }

                System.out.println();//cursor moving next line
            }
            for (int i = 0; i < viewer2.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadBooked = false;
                while (!isValidSeat || !isAlreadBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        //trying to change it as input so useing explicit
                        //to get the string value and change to int
                        BigInteger seats = new BigInteger(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats.intValue() - 1;//getting value in int then calculating
                        if (goldScreen[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        goldScreen[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;
                        isAlreadBooked = true;//saying it is correct
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }


            ScreenInterface gold = new GoldScreen("S23", 500, 150, 100);
            ScreenInterface[] arr = viewer2.getSi();
            arr[0] = gold;
            gold.setViewer(viewer2);
            gold.TicketPrice();
            gold.SnackPrice();
            gold.generateBill();
            gold.Discount();
            System.out.println("======BOOKING SUMMARY=====");
            System.out.println(arr[0].getBookingId());
            System.out.println(arr[0].getTicketPrice());
            System.out.println(arr[0].getSnackPrice());
            System.out.println(arr[0].getTotalBill());
            viewer2Bill = gold.getTotalBill();
        }

        else {
            System.out.println("=======Viewer 2:SILVER======");
            int[][] silverScreen = new int[6][5];
            silverScreen[0] = new int[]{1, 2, 3, 4, 5};//i denotes row and j denotes element
            for (int i = 0; i < silverScreen.length; i++) {
                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++) {
                    if (i == 0 && j == 0) {//only in starting space
                        System.out.print(" ");

                    }
                    System.out.print(silverScreen[i][j]);//print in same line
                    System.out.print(" ");
                }

                System.out.println();//cursor moving next line
            }
            for (int i = 0; i < viewer2.getNumberOfSeats(); i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBooked = false;
                while (!isValidSeat || !isAlreadyBooked) {
                    try {
                        System.out.println("Enter the seats:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ch[0] - 65;
                        //trying to change it as input so useing explicit
                        //to get the string value and change to int
                        BigInteger seats = new BigInteger(String.valueOf(ch[1]));//to target the index value when 0 and ...
                        int finalSeats = seats.intValue() - 1;//getting value in int then calculating
                        if (silverScreen[finalRow + 1][finalSeats] == 1) {//no repeat booking for seat
                            isAlreadyBooked = true;
                            System.out.println("This seat is already Booked");
                        }
                        silverScreen[finalRow + 1][finalSeats] = 1;
                        isValidSeat = true;//saying it is correct
                        isAlreadyBooked = true;
                    } catch (Exception e) {
                        System.out.println("Invalid seat ,please enter valid seat");
                        isValidSeat = false;//saying it is wrong
                    }
                }
            }
            ScreenInterface silver = new SilverScreen("S11", 200, 80);
            silver.setViewer(viewer2);
            ScreenInterface[] arr = viewer2.getSi();
            arr[1] = silver;
            silver.TicketPrice();
            silver.SnackPrice();
            silver.generateBill();
            silver.Discount();
            System.out.println("======BOOKING SUMMARY=====");
            System.out.println(silver.getBookingId());
            System.out.println(silver.getTicketPrice());
            System.out.println(silver.getSnackPrice());
            System.out.println(silver.getTotalBill());
            viewer2Bill = silver.getTotalBill();

        }


        System.out.println("===== BILL COMPARISON =====");
        if (viewer1Bill > viewer2Bill) {
            System.out.println("Viewer 1 paid more!");
        }
        else if (viewer2Bill > viewer1Bill) {
            System.out.println("Viewer 2 paid more!");
        }
        else {
            System.out.println("Both paid same amount!");
        }
    }

}