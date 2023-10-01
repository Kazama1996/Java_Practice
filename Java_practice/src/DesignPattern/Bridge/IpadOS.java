package DesignPattern.Bridge;

public class IpadOS extends OperatingSystem {
    @Override
    void run() {
        System.out.println("iPadOS is running on the device.");
    }

    String getName() {
        return "iPadOS";
    }

   
}
