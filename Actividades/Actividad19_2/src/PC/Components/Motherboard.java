package PC.Components;

public class Motherboard {

    private Motherboard_Brand brand = Motherboard_Brand.NA;
    private String model = "NA";
    private Motherboard_Socket socket = Motherboard_Socket.NA;
    private Memory_Supported mem_supported = Memory_Supported.NA;
    private CPU cpu = null;
    private Storage storage = null;
    private Memory[] memories = null;
    private USB[] usb = new USB[6];

    public enum Motherboard_Brand {
        NA, GIGABYTE, ASUS, ASROCK
    }

    public enum Motherboard_Socket {
        NA, INTEL, AMD
    }

    public enum Memory_Supported {
        NA, DDR3, DDR4, DDR5
    }

    public Motherboard(){
        for (int i = 0; i < usb.length; i++) {
            usb[i] = new USB();
        }
    }

    public void setBrand(Motherboard_Brand brand) {
        this.brand = brand;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setMem_supported(Memory_Supported mem_supported) {
        this.mem_supported = mem_supported;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSocket(Motherboard_Socket socket) {
        this.socket = socket;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setUsb(int i, USB.USB_Version version) {
        if (i >= 0 && i < this.usb.length)
            this.usb[i].setVersion(version);
        ;
    }

    public void setMemories(Memory[] memories) {
        this.memories = memories;
    }

    public Motherboard_Brand getBrand() {
        return brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Memory_Supported getMem_supported() {
        return mem_supported;
    }

    public String getModel() {
        return model;
    }

    public Motherboard_Socket getSocket() {
        return socket;
    }

    public Storage getStorage() {
        return storage;
    }

    public USB getUsb(int i) {
        if (i >= 0 && i < this.usb.length)
            return usb[i];

        return null;
    }

    public Memory[] getMemories() {
        return memories;
    }
}
