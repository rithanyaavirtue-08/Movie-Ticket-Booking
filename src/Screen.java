public abstract class Screen implements ScreenInterface {

    private String bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private int convenienceFee;
    private ViewerInterface viewer;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalPrice) {
        this.totalBill = totalPrice;
    }

    public ViewerInterface getViewer() {
        return viewer;
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }
    public int getConvenienceFee() {
        return convenienceFee;
    }

    public void setConvenienceFee(int convenienceFee) {
        this.convenienceFee = convenienceFee;
    }


    //method1
    public void TicketPrice() {
        ticketPrice = viewer.getNumberOfSeats() *getTicketPrice();
        System.out.println("Ticket Price:" + ticketPrice);
    }
    //method2
    public void SnackPrice() {
        if (this.viewer.getWantsSnacks().equals("yes")) {
            snackPrice=viewer.getQuantity()*getSnackPrice();
            System.out.println("The Snack Price:"+snackPrice);

        } else {
            System.out.println("Snack Price is 0");

        }
    }
    //method4
    public void generateBill(){
        totalBill=getTicketPrice()+getSnackPrice()+getConvenienceFee();
        System.out.println("Total Bill:"+totalBill);
    }
    public void Discount() {
        if (viewer.getNumberOfSeats() >= 4) {
            System.out.println("Apply 10% discount");
            int discount = totalBill * 10 / 100;//formula
            int finalBill = totalBill - discount;
            System.out.println("Discount Applied:" + discount);
            System.out.println("Final Bill:" + finalBill);
        } else {
            System.out.println("No Discount");
        }

    }}


