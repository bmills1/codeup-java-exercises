package my_store;

public class Phone {

    private String number;
    private double screenSize;
    private String OS;

    public Phone(double sS, String OS) {
        this.screenSize = sS;
        this.OS = OS;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    private void assemble(){

    }

    public String getOS() {
        return this.OS;
    }
    public void makeCall(String aNumumber){
        System.out.println("Calling number... " + aNumumber);

    }
}
