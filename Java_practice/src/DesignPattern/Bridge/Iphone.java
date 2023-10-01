package DesignPattern.Bridge;

public class Iphone extends Device {
    public Iphone(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("iPhone is running " + os.getName());
    }
    
}
