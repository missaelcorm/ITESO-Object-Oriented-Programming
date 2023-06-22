package ElectronicDevices.Devices;

import ElectronicDevices.*;
import ElectronicDevices.Connectivity.*;

public class Tablet extends ElectronicDevice implements Battery, Wifi {

    protected int mah = 0;
    protected int percentage = 0;
    protected int wifiInterfaceType = Wifi.NA;
    protected boolean isWifiConnected = false;
    protected boolean isBatteryConnected = false;

    public Tablet() {
        super();
    }

    public Tablet(VENDOR vendor, OS os, int screenInchesSize, boolean isOn, int mah, int percentage,
            int interfaceType) {
        super(vendor, os, screenInchesSize, isOn);
        setMAH(mah);
        setPercentge(percentage);
        setInterfaceWifi(interfaceType);
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
        }

        return false;
    }

    @Override
    public void connect(int connectivityType) {
        switch(connectivityType){
            case Wifi.WIFI_Type:  this.isWifiConnected = true; 
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
            case Battery.BATTERY_TYPE: this.isBatteryConnected = true;
            break;
        }
    }

    public void installApp(String appName){
        System.out.println(appName + " installed");
    }

    public void uninstallApp(String appName){
        System.out.println(appName + " uninstalled");
    }
}
