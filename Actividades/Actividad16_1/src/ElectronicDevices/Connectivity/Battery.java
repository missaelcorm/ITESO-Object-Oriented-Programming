/**
 * InnerBattery
 */

package ElectronicDevices.Connectivity;

public interface Battery {

    int BATTERY_TYPE = 4;

    void setMAH(int mAH);
    int getMAH();
    void setPercentge(int percentage);
    int getPercentage();
    void connect(int connectivityType);
    void disconnect(int connectivityType);
}