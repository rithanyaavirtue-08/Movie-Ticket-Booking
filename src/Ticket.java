public abstract class Ticket {
    private String ticketId;
    private int price;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void Booking(int seat){
        this.price=this.price*seat;
        System.out.println("Booking Successful");
        System.out.println("Price:"+getPrice());
    }
}
