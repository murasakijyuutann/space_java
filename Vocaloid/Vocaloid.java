package Vocaloid;

import java.sql.Date;

public class Vocaloid {
    private String id;
    private String name;
    private String manufacturer;
    private Date debutDate;
    private String voiceProvider;

    public Vocaloid(String id, String name, String manufacturer, Date debutDate, String voiceProvider) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.debutDate = debutDate;
        this.voiceProvider = voiceProvider;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Date getDebutDate() {
        return debutDate;
    }

    public String getVoiceProvider() {
        return voiceProvider;
    }

    @Override
    public String toString() {
        return "Vocaloid{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", debutDate=" + debutDate +
                ", voiceProvider='" + voiceProvider + '\'' +
                '}';
    }
}