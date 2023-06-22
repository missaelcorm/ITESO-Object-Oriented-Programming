package ElectronicDevices.Devices;

import ElectronicDevices.*;
import ElectronicDevices.Connectivity.*;

public class Laptop extends ElectronicDevice implements Battery, Wifi, Ethernet {

    protected int mah = 0;
    protected int percentage = 0;
    protected int wifiInterfaceType = Wifi.NA;
    protected boolean isWifiConnected = false;
    protected int ethernetVelocity = Ethernet.NA;
    protected boolean isEthernetConnected = false;
    protected boolean isBatteryConnected = false;

    public Laptop() {
        super();
    }

    public Laptop(VENDOR vendor, OS os, int screenInchesSize, boolean isOn, int mah, int percentage,
            int wifiInterfaceType, int ethernetVelocity) {
        super(vendor, os, screenInchesSize, isOn);
        setMAH(mah);
        setPercentge(percentage);
        setInterfaceWifi(wifiInterfaceType);
        setVelocity(ethernetVelocity);
    }

    @Override
    public void setMAH(int mAH) {
        if (mAH > 0)
            this.mah = mAH;
    }

    @Override
    public int getMAH() {
        return this.mah;
    }

    @Override
    public void setPercentge(int percentage) {
        if (percentage >= 0 && percentage <= 100)
            this.percentage = percentage;
    }

    @Override
    public int getPercentage() {
        return this.percentage;
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
            case Battery.BATTERY_TYPE: this.isBatteryConnected = true;
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
            case Battery.BATTERY_TYPE: this.isBatteryConnected = false;
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
