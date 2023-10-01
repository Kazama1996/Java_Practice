package DesignPattern.Bridge;

public class IOS extends OperatingSystem {


    @Override
    void run() {
        System.out.println("iOS is running on the device.");
    }

    String getName() {
        return "iOS";
    }

    
}
