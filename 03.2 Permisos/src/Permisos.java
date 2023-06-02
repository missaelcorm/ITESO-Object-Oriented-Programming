/**
 * Permisos
 */
import javax.swing.JOptionPane;
public class Permisos {

    public static void main(String[] args) {
        int permisos = Integer.parseInt(JOptionPane.showInputDialog("Dame el nivel de permisos"), 8);

        int read = 0400;
        int write = 0200;
        int execute = 0100;

        int ownerW = permisos & (write>>0);
        int ownerR = permisos & (read>>0);
        int ownerE = permisos & (execute>>0);

        int groupW = permisos & (write>>3);
        int groupR = permisos & (read>>3);
        int groupE = permisos & (execute>>3);

        int anyW = permisos & (write>>6);
        int anyR = permisos & (read>>6);
        int anyE = permisos & (execute>>6);

        JOptionPane.showMessageDialog(null, "Owner Permissions: \n" +
                                                            "Read: " + (ownerR > 0 ) + "\n" +
                                                            "Write: " + (ownerW > 0 ) + "\n" +
                                                            "Execution: " + (ownerE > 0 ) + "\n\n" +
                                                            "Group Permissions: \n" +
                                                            "Read: " + (groupR > 0 ) + "\n" +
                                                            "Write: " + (groupW > 0 ) + "\n" +
                                                            "Execution: " + (groupE > 0 ) + "\n\n" +
                                                            "Anyone Permissions: \n" +
                                                            "Read: " + (anyR > 0 ) + "\n" +
                                                            "Write: " + (anyW > 0 ) + "\n" +
                                                            "Execution: " + (anyE > 0 ) + "\n\n" 
                                                            );

    }
}
