package PC.Components;

public class USB {
    private USB_Version version = USB_Version.NA;

    public enum USB_Version {
        NA, USB_2_0, USB_3_0, USB_3_1, USB_3_2
    }

    public void setVersion(USB_Version version) {
        this.version = version;
    }

    public USB_Version getVersion() {
        return version;
    }
}
