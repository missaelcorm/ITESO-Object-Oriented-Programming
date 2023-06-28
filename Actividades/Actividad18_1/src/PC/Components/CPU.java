/**
 * CPU
 */
package PC.Components;

public class CPU {

    private CPU_Model model = CPU_Model.NA;
    private int cores = 0;
    private double speed = 0;

    public enum CPU_Model {
        NA, INTEL_I3, INTEL_I5, INTEL_I7, INTEL_I9,
        AMD_RYZEN_3, AMD_RYZEN_5, AMD_RYZEN_7, AMD_RYZEN_9
    }

    public void setCores(int cores) {
        if(cores >= 4 && cores <= 24)
            this.cores = cores;
    }

    public void setModel(CPU_Model model) {
        this.model = model;
    }

    public void setSpeed(double speed) {
        if(speed >= 2 && speed <= 5.5)
            this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public CPU_Model getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

}