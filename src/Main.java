public class Main{
    public static void main(String[] args){

        /**
         * Create the entities which is User,premium,regular
         * Create one abstract class to store common variables and common methods.
         * Create classes (RegularTicket and PremiumTicket) by extending the abstract class.
         * Implement the abstract methods
         * If unique methods keep in the classes
         * Create a User class to store user details and ticket preference.
         * Initialize user objects using constructors
         * In the main method, check the ticket type using if-else conditions.
         * After implementing the constructor,the values called inside the parameter,which is perameterised constructor.
         * Display ticket details such as ticket ID and price.
         *

          */
        /**
         * Version 2
         * in this we are creating the vise vera actions
         * after all displaying the duplicates and adding abstract
         * Create the appropriate regular,premium object and assign it to the user.
         * user--regular,premium and vise versa premium--user,regular--premium
         *
         */

        User user1=new User("Regular Ticket",3);
        User user2=new User("Premium Ticket",4);


        if(user1.getTicketType().equals("Regular Ticket"));{
            RegularTicket regular=new RegularTicket("Movies123",100);
            System.out.println("====User1====");
            regular.setPrice(100);
            regular.Booking(user1.getSeats());
            regular.includeSnacks();
            regular.getUser();
            user1.getRegularTicket();



        }
        if(user2.getTicketType().equals("Premium Ticket")){
            PremiumTicket premium=new PremiumTicket("Movies743",200);
            System.out.println("====User 2====");
            premium.setPrice(299);
            premium.Booking(user2.getSeats());
            premium.ReclinerSeat();
            premium.getUser();
            user2.getPremiumTicket();
        }

    }

}

