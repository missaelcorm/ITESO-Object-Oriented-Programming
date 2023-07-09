import PC.Components.*;
import PC.Components.USB.USB_Version;

public class App {
    public static void main(String[] args) throws Exception {
        //Association instances
        CPU cpu = new CPU();
        cpu.setCores(16);
        cpu.setModel(CPU.CPU_Model.INTEL_I7);
        cpu.setSpeed(4.5);

        Storage storage = new Storage();
        storage.setCapacity(2048);
        storage.setType(Storage.Storage_Type.SSD);

        Memory memories[] = new Memory[4];
        for(int i=0; i<memories.length; i++){
            memories[i] = new Memory();
            memories[i].setCapacity(16);
            memories[i].setType(Memory.Memory_Type.DDR5);
        }

        Motherboard motherboard = new Motherboard();
        //Agregation
        motherboard.setSocket(Motherboard.Motherboard_Socket.INTEL);
        motherboard.setBrand(Motherboard.Motherboard_Brand.ASUS);
        motherboard.setMem_supported(Motherboard.Memory_Supported.DDR5);
        motherboard.setModel("ABCDE v3");
        motherboard.setUsb(0, USB_Version.USB_3_2);
        motherboard.setUsb(1, USB_Version.USB_3_2);
        motherboard.setUsb(2, USB_Version.USB_3_2);
        motherboard.setUsb(3, USB_Version.USB_3_2);
        motherboard.setUsb(4, USB_Version.USB_2_0);
        motherboard.setUsb(5, USB_Version.USB_2_0);
        //Association
        motherboard.setCpu(cpu);
        motherboard.setStorage(storage);
        motherboard.setMemories(memories);
    }
}
