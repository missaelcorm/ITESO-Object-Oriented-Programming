package ElectronicDevices.Connectivity;

public interface Ethernet {
    int ETHERNET_Type = 3;

    int NA = 0;
    int _100_MBPS = 1;
    int _1000_MBPS = 2;

    void setVelocity(int velocityType);

    int getVelocity();

    boolean isConnected(int connectivityType);

    void connect(int connectivityType);
    void disconnect(int connectivityType);
}
