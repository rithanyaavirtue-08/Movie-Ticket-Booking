public class User {

    private String ticketType;//user
    private int seats;
    private RegularTicket regularTicket;//user
    private PremiumTicket premiumTicket;

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public RegularTicket getRegularTicket() {
        return regularTicket;
    }

    public void setRegularTicket(RegularTicket regularTicket) {
        this.regularTicket = regularTicket;
    }

    public PremiumTicket getPremiumTicket() {
        return premiumTicket;
    }

    public void setPremiumTicket(PremiumTicket premiumTicket) {
        this.premiumTicket = premiumTicket;
    }
    User(String ticketType,int seats){
        this.ticketType=ticketType;
        this.seats=seats;
    }
    User(RegularTicket regularTicket){
        this.regularTicket=regularTicket;
        regularTicket.setTicketId("Movie123");
        regularTicket.setPrice(100);

    }
    User(PremiumTicket premiumTicket){
       this.premiumTicket=premiumTicket;
       premiumTicket.setTicketId("Movie432");
       premiumTicket.setPrice(299);
    }
}
