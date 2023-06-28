package PC.Components;

public class Storage {
    private Storage_Type type = Storage_Type.NA;
    private int capacity = 0;

    public enum Storage_Type {
        NA, HDD, SSD
    }

    public void setCapacity(int capacity) {
        if(capacity >= 480 && capacity <= 10000)
            this.capacity = capacity;
    }

    public void setType(Storage_Type type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Storage_Type getType() {
        return type;
    }
}
