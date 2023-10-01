package DesignPattern.Bridge;

public class Ipad extends Device {

    public Ipad(OperatingSystem os) {
        super(os);
    }

    @Override
    public void run() {
        System.out.println("iPad is running " + os.getName());
    }

    
    
}
