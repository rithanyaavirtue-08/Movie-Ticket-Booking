public interface ViewerInterface {
    public int getNumberOfSeats();
    public void setNumberOfSeats(int numberOfSeats);
    public String getScreenType();
    public void setScreenType(String screenType);
    public int getQuantity();
    public void setQuantity(int quantity);
    public String getWantsSnacks();
    public void setWantsSnacks(String wantsSnacks);
    public ScreenInterface[] getSi();
    public void setSi(ScreenInterface[] si);
}
