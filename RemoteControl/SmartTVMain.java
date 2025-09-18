package RemoteControl;

public class SmartTVMain {
    public static void main(String[] args) {
        // Create an instance of a Smart TV
        SmartTV mySmartTV = new SmartTV();

        // Simulate remote control operations
        mySmartTV.powerOn();
        mySmartTV.volumeUp();
        mySmartTV.volumeUp();
        mySmartTV.setChannel(5);
        mySmartTV.changeInput("HDMI1");
        mySmartTV.volumeDown();
        mySmartTV.mute();

        // Test Smart TV's web features
        mySmartTV.searchWeb("Hatsune Miku merchandise");
        mySmartTV.openURL("https://www.piapro.net/");
        mySmartTV.bookmarkPage("https://magicalmirai.com/");
        mySmartTV.viewBookmarks();

        mySmartTV.powerOff();
    }
}
