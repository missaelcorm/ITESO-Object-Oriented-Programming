package PC.Components;

public class Memory {
    
    private Memory_Type type = Memory_Type.NA;
    private int capacity = 0;

    public enum Memory_Type{
        NA, DDR3, DDR4, DDR5
    }

    public void setCapacity(int capacity) {
        if(capacity >= 8 && capacity <= 64)
            this.capacity = capacity;
    }

    public void setType(Memory_Type type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Memory_Type getType() {
        return type;
    }
}
