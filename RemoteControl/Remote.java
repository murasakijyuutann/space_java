package RemoteControl;

public interface Remote {

    // Constants
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;

    // Power control
    public void powerOn();
    public void powerOff();

    // Volume control
    public void volumeUp();
    public void volumeDown();
    public void mute();

    // Channel control (optional, depends on device)
    public void channelUp();
    public void channelDown();
    public void setChannel(int channel);

    // Input source (optional)
    public void changeInput(String inputSource);
}
