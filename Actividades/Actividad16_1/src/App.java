import ElectronicDevices.Devices.*;
import ElectronicDevices.Connectivity.Ethernet;
import ElectronicDevices.Connectivity.Wifi;

public class App {
    public static void main(String[] args) throws Exception {
        
        Mobile mob = new Mobile(Mobile.VENDOR.SAMSUNG, Mobile.OS.ANDROID, 10, false, 4000, 56, Wifi._5GHZ);
        Tablet tab = new Tablet(Tablet.VENDOR.APPLE, Tablet.OS.IOS, 12, true, 8000, 87, Wifi._6);
        Laptop lap = new Laptop(Laptop.VENDOR.DELL, Laptop.OS.WINDOWS, 16, false, 10000, 95, Wifi._2_4GHZ, Ethernet._1000_MBPS);
        SmartTV tv = new SmartTV(SmartTV.VENDOR.SONY, SmartTV.OS.ROKU, 65, true, Wifi._5GHZ, Ethernet._100_MBPS);
        mob.setOS(Mobile.OS.ANDROIDTV);

        System.out.println(mob.getOS());
    }
}
