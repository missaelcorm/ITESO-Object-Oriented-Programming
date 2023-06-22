package ElectronicDevices.Connectivity;

public interface LTE {

    int LTE_Type = 1;

    boolean isConnected(int connectivityType);

    void connect(int connectivityType);
    void disconnect(int connectivityType);
}
