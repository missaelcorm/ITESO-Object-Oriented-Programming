package ElectronicDevices.Devices;
import ElectronicDevices.Connectivity.*;
import ElectronicDevices.*;


public class SmartTV extends ElectronicDevice implements Wifi, Ethernet {
    protected boolean isHDMIConnected = false;
    protected int wifiInterfaceType = Wifi.NA;
    protected boolean isWifiConnected = false;
    protected int ethernetVelocity = Ethernet.NA;
    protected boolean isEthernetConnected = false;
    protected boolean isBatteryConnected = false;

    public static final int HDMI = 91;

    public SmartTV() {
        super();
    }

    public SmartTV(VENDOR vendor, OS os, int screenInchesSize, boolean isOn,
            int wifiInterfaceType, int ethernetVelocity) {
        super(vendor, os, screenInchesSize, isOn);
        setInterfaceWifi(wifiInterfaceType);
        setVelocity(ethernetVelocity);
    }

    @Override
    public void setInterfaceWifi(int type) {
        if(type >= Wifi.NA && type <= Wifi._6)
            this.wifiInterfaceType = type;
    }

    @Override
    public boolean isConnected(int connectivityType) {
        switch(connectivityType){
            case Wifi.WIFI_Type: return this.isWifiConnected;
            case Ethernet.ETHERNET_Type: return this.isEthernetConnected;
            case HDMI: return this.isHDMIConnected;
        }

        return false;
    }

    @Override
    public void connect(int connectivityType) {
        switch(connectivityType){
            case Wifi.WIFI_Type:  this.isWifiConnected = true; 
            break;
            case Ethernet.ETHERNET_Type: this.isEthernetConnected = true;
            break;
            case HDMI: this.isHDMIConnected = true;
            break;
        }
    }

    @Override
    public void disconnect(int connectivityType) {
        switch(connectivityType){
            case Wifi.WIFI_Type:  this.isWifiConnected = false; 
            break;
            case Ethernet.ETHERNET_Type: this.isEthernetConnected = false;
            break;
            case HDMI: this.isHDMIConnected = false;
            break;
        }
    }

    public void installApp(String appName){
        System.out.println(appName + " installed");
    }

    public void uninstallApp(String appName){
        System.out.println(appName + " uninstalled");
    }

    @Override
    public int getVelocity() {
        return this.ethernetVelocity;
    }

    @Override
    public void setVelocity(int velocityType) {
        if(velocityType >= Ethernet.NA && velocityType <= Ethernet._1000_MBPS)
            this.ethernetVelocity = velocityType;
    }
}
