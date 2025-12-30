public class PremiumTicket extends Ticket {
    private User user;
    public void ReclinerSeat(){
        System.out.println("Recliner Seat Enabled");
    }

    public PremiumTicket(String ticketId,int price){
        this.getTicketId();
        this.getPrice();
    }

    public PremiumTicket(User user){
        this.user=user;
        user.getTicketType();
        user.getSeats();
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
