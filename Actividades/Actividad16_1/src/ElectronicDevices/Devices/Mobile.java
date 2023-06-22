package ElectronicDevices.Devices;

import ElectronicDevices.*;
import ElectronicDevices.Connectivity.*;

public class Mobile extends ElectronicDevice implements Battery, Wifi, LTE, _5G {

    protected int mah = 0;
    protected int percentage = 0;
    protected int wifiInterfaceType = Wifi.NA;
    protected boolean isWifiConnected = false;
    protected boolean isLTEConnected = false;
    protected boolean is_5GConnected = false;
    protected boolean isBatteryConnected = false;

    public Mobile() {
        super();
    }

    public Mobile(VENDOR vendor, OS os, int screenInchesSize, boolean isOn, int mah, int percentage,
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
            case LTE.LTE_Type: return this.isLTEConnected;
            case _5G._5G_Type:  return this.is_5GConnected;
        }

        return false;
    }

    @Override
    public void connect(int connectivityType) {
        switch(connectivityType){
            case Wifi.WIFI_Type:  this.isWifiConnected = true; 
            break;
            case LTE.LTE_Type:  this.isLTEConnected = true; 
            break;
            case _5G._5G_Type:   this.is_5GConnected = true; 
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
            case LTE.LTE_Type:  this.isLTEConnected = false; 
            break;
            case _5G._5G_Type:   this.is_5GConnected = false; 
            break;
            case Battery.BATTERY_TYPE: this.isBatteryConnected = true;
            break;
        }
    }

    public void call(String number){
        System.out.println("Calling to " + number);
    }

    public void installApp(String appName){
        System.out.println(appName + " installed");
    }

    public void uninstallApp(String appName){
        System.out.println(appName + " uninstalled");
    }

}
