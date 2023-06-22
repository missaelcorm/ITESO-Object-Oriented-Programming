package ElectronicDevices.Connectivity;

public interface _5G {
    int _5G_Type = 2;

    boolean isConnected(int connectivityType);

    void connect(int connectivityType);
    void disconnect(int connectivityType);
}
