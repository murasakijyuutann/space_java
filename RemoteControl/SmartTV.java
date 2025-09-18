package RemoteControl;

import java.util.ArrayList;
import java.util.List;

public class SmartTV implements Remote, WebSearchable {

    private boolean isOn = false;
    private int volume = 50;
    private int channel = 1;
    private String inputSource = "TV";
    private List<String> bookmarks = new ArrayList<>();

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Smart TV is now ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Smart TV is now OFF");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Smart TV Volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Smart TV Volume: " + volume);
        }
    }

    @Override
    public void mute() {
        if (isOn) {
            volume = MIN_VOLUME;
            System.out.println("Smart TV is muted");
        }
    }

    @Override
    public void channelUp() {
        if (isOn) {
            channel++;
            System.out.println("Smart TV Channel: " + channel);
        }
    }

    @Override
    public void channelDown() {
        if (isOn && channel > 1) {
            channel--;
            System.out.println("Smart TV Channel: " + channel);
        }
    }

    @Override
    public void setChannel(int channel) {
        if (isOn && channel > 0) {
            this.channel = channel;
            System.out.println("Smart TV Channel set to: " + channel);
        }
    }

    @Override
    public void changeInput(String inputSource) {
        if (isOn) {
            this.inputSource = inputSource;
            System.out.println("Smart TV Input Source changed to: " + inputSource);
        }
    }

    @Override
    public void searchWeb(String query) {
        if (isOn) {
            System.out.println("Searching the web for: " + query);
            System.out.println("Displaying search results for: " + query);
        }
    }

    @Override
    public void openURL(String url) {
        if (isOn) {
            System.out.println("Opening URL: " + url);
        }
    }

    @Override
    public void bookmarkPage(String url) {
        if (isOn) {
            bookmarks.add(url);
            System.out.println("Bookmarked page: " + url);
        }
    }

    @Override
    public void viewBookmarks() {
        if (isOn) {
            System.out.println("Bookmarked Pages:");
            for (String bookmark : bookmarks) {
                System.out.println("- " + bookmark);
            }
        }
    }
}
