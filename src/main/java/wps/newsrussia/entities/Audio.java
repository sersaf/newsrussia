package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 10.04.16.
 */
public class Audio {
    private int idAudio;
    private Date audioDate;
    private String audioType;

    public int getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(int idAudio) {
        this.idAudio = idAudio;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audio audio = (Audio) o;

        if (idAudio != audio.idAudio) return false;
        if (audioDate != null ? !audioDate.equals(audio.audioDate) : audio.audioDate != null) return false;
        if (audioType != null ? !audioType.equals(audio.audioType) : audio.audioType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAudio;
        result = 31 * result + (audioDate != null ? audioDate.hashCode() : 0);
        result = 31 * result + (audioType != null ? audioType.hashCode() : 0);
        return result;
    }
}
