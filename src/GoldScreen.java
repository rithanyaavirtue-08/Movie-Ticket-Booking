public class GoldScreen extends Screen implements GoldScreenInterface{
    GoldScreen(String bookingId,int ticketPrice,int snackPrice,int convenienceFee){
        setBookingId(bookingId);
        setTicketPrice(ticketPrice);
        setSnackPrice(snackPrice);
        setConvenienceFee(convenienceFee);
    }

}



