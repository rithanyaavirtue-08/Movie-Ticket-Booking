public class RegularTicket extends Ticket {

    private User user;

    public void includeSnacks(){
        System.out.println("Snacks Available");
    }

    public RegularTicket(String ticketId,int price){
        this.getTicketId();
        this.getPrice();
    }

    public RegularTicket(User user){
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


