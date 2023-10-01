package Launcher.ipml.DesignPattern;

import DesignPattern.Bridge.Device;
import DesignPattern.Bridge.IOS;
import DesignPattern.Bridge.Ipad;
import DesignPattern.Bridge.IpadOS;
import DesignPattern.Bridge.Iphone;
import DesignPattern.Bridge.OperatingSystem;
import Launcher.Launcher;

public class BridgeLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
       OperatingSystem ios = new IOS();
       OperatingSystem IpadOS = new IpadOS();

       Device iphone12 = new Iphone(ios);
       Device ipadAir = new Ipad(IpadOS);

        iphone12.run();
        ipadAir.run();
       
        
    }
    
}
