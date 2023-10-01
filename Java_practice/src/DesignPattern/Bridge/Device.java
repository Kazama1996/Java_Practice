package DesignPattern.Bridge;


public abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    public abstract void run();

}
