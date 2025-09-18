package RemoteControl;

public class TV implements Remote {

    private boolean power = false;
    private int volume = 20;
    private int channel = 1;
    private String inputSource = "TV";
    private boolean isMuted = false;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("[*] TV is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("[X] TV is now OFF.");
    }

    @Override
    public void volumeUp() {
        if (!power) return;
        if (volume < MAX_VOLUME) {
            volume++;
            System.out.println("[+] Volume: " + volume);
        } else {
            System.out.println("(!) Volume is already at MAX.");
        }
    }

    @Override
    public void volumeDown() {
        if (!power) return;
        if (volume > MIN_VOLUME) {
            volume--;
            System.out.println("[-] Volume: " + volume);
        } else {
            System.out.println("(!) Volume is already at MIN.");
        }
    }

    @Override
    public void mute() {
        if (!power) return;
        isMuted = !isMuted;
        System.out.println(isMuted ? "[=] Muted" : "[>] Unmuted");
    }

    @Override
    public void channelUp() {
        if (!power) return;
        channel++;
        System.out.println("[#] Channel: " + channel);
    }

    @Override
    public void channelDown() {
        if (!power) return;
        if (channel > 1) {
            channel--;
            System.out.println("[#] Channel: " + channel);
        } else {
            System.out.println("(!) Already at the lowest channel.");
        }
    }

    @Override
    public void setChannel(int newChannel) {
        if (!power) return;
        if (newChannel > 0) {
            channel = newChannel;
            System.out.println("[#] Channel set to: " + channel);
        } else {
            System.out.println("(!) Invalid channel number.");
        }
    }

    @Override
    public void changeInput(String inputSource) {
        if (!power) return;
        this.inputSource = inputSource;
        System.out.println("[~] Input source changed to: " + inputSource);
    }
}
