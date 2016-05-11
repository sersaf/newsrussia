package wps.newsrussia.entities;

import java.sql.Date;

public class AudioWps {
    private int idRadioWps;
    private Date audioDate;
    private String audioType;
    private int idStorage;

    public int getIdRadioWps() {
        return idRadioWps;
    }

    public void setIdRadioWps(int idRadioWps) {
        this.idRadioWps = idRadioWps;
    }

    public Date getAudioDate() {
        return audioDate;
    }

    public void setAudioDate(Date audioDate) {
        this.audioDate = audioDate;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public int getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(int idStorage) {
        this.idStorage = idStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AudioWps audioWps = (AudioWps) o;

        if (idRadioWps != audioWps.idRadioWps) return false;
        if (idStorage != audioWps.idStorage) return false;
        if (audioDate != null ? !audioDate.equals(audioWps.audioDate) : audioWps.audioDate != null) return false;
        if (audioType != null ? !audioType.equals(audioWps.audioType) : audioWps.audioType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRadioWps;
        result = 31 * result + (audioDate != null ? audioDate.hashCode() : 0);
        result = 31 * result + (audioType != null ? audioType.hashCode() : 0);
        result = 31 * result + idStorage;
        return result;
    }
}
