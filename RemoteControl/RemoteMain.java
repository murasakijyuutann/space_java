package RemoteControl;

public class RemoteMain {
    public static void main(String[] args) {
        // Create an instance of a device that implements the Remote interface
        Remote myTV = new TV();

        // Simulate remote control operations
        myTV.powerOn();
        myTV.volumeUp();
        myTV.volumeUp();
        myTV.setChannel(5);
        myTV.changeInput("HDMI1");
        myTV.volumeDown();
        myTV.mute();
        myTV.powerOff();
    }
}
