public interface ScreenInterface {
    public String getBookingId();
    public void setBookingId(String bookingId);
    public int getTicketPrice();
    public void setTicketPrice(int ticketPrice);
    public int getSnackPrice();
    public void setSnackPrice(int snackPrice);
    public int getTotalBill();
    public void setTotalBill(int totalPrice);
    public ViewerInterface getViewer();
    public void setViewer(ViewerInterface viewer);
    public int getConvenienceFee();
    public void setConvenienceFee(int convenienceFee);
    public void TicketPrice();
    public void SnackPrice();
    public void generateBill();
    public void Discount();
}
