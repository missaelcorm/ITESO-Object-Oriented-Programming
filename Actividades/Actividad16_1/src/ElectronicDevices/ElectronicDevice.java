/**
 * ElectronicDevice
 */

package ElectronicDevices;

public abstract class ElectronicDevice {

    protected VENDOR vendor = VENDOR.NA;
    protected OS os = OS.NA;
    protected int screenInchesSize = 0;
    protected boolean isOn = false;

    public enum VENDOR {
        NA, APPLE, SAMSUNG, HP, DELL, HISENSE, SONY
    }

    public enum OS {
        NA, WINDOWS, LINUX, IOS, ANDROID, ANDROIDTV, ROKU, TIZEN, WEB_OS
    }

    public ElectronicDevice(){

    }

    public ElectronicDevice(VENDOR vendor, OS os, int screenInchesSize, boolean isOn){
        setVendor(vendor);
        setOS(os);
        setScreenInchesSize(screenInchesSize);
        if(isOn)
            turnOn();
    }

    public void setVendor(VENDOR vendor){
        if(vendor instanceof VENDOR)
            this.vendor = vendor;
    }

    public void setOS(OS os){
        if(os instanceof OS)
            this.os = os;
    }

    public void setScreenInchesSize(int size){
        if(size > 0)
            this.screenInchesSize = size;
    }

    public String getVendor(){
        return this.vendor.toString();
    }

    public String getOS(){
        return this.os.toString();
    }

    public int getScreenInchesSize(){
        return this.screenInchesSize;
    }

    public boolean deviceIsOn(){
        return this.isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public void installApp(String app){
        System.out.println(app + " was installed");
    }

    public void uninstallApp(String app){
        System.out.println(app + " was uninstalled");
    }
}