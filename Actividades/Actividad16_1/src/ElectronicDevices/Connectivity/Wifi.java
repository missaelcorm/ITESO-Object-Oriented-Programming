package ElectronicDevices.Connectivity;

public interface Wifi {

    int WIFI_Type = 0;

    int NA = 0;
    int _2_4GHZ = 1;
    int _5GHZ = 2;
    int _6 = 3;

    void setInterfaceWifi(int type);

    boolean isConnected(int connectivityType);

    void connect(int connectivityType);
    void disconnect(int connectivityType);

}
