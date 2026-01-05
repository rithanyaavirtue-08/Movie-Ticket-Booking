public class Viewer implements ViewerInterface {
    private int numberOfSeats;
    private String screenType;
    private int quantity;
    private String wantsSnacks;
    private ScreenInterface[] Si=new ScreenInterface[2];

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWantsSnacks() {
        return wantsSnacks;
    }

    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }

    public ScreenInterface[] getSi() {
        return Si;
    }

    public void setSi(ScreenInterface[] si) {
        Si = si;
    }
}
