package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 11.05.16.
 */
public class VideoWps {
    private long idVideoWps;
    private String videoName;
    private Date videoDate;
    private String videoType;
    private String videoDescription;
    private String videoAnnotation;
    private String videoPath;
    private long genreIdGenre;
    private int storageIdStorage;

    public long getIdVideoWps() {
        return idVideoWps;
    }

    public void setIdVideoWps(long idVideoWps) {
        this.idVideoWps = idVideoWps;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Date getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(Date videoDate) {
        this.videoDate = videoDate;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public String getVideoAnnotation() {
        return videoAnnotation;
    }

    public void setVideoAnnotation(String videoAnnotation) {
        this.videoAnnotation = videoAnnotation;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public long getGenreIdGenre() {
        return genreIdGenre;
    }

    public void setGenreIdGenre(long genreIdGenre) {
        this.genreIdGenre = genreIdGenre;
    }

    public int getStorageIdStorage() {
        return storageIdStorage;
    }

    public void setStorageIdStorage(int storageIdStorage) {
        this.storageIdStorage = storageIdStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoWps videoWps = (VideoWps) o;

        if (idVideoWps != videoWps.idVideoWps) return false;
        if (genreIdGenre != videoWps.genreIdGenre) return false;
        if (storageIdStorage != videoWps.storageIdStorage) return false;
        if (videoName != null ? !videoName.equals(videoWps.videoName) : videoWps.videoName != null) return false;
        if (videoDate != null ? !videoDate.equals(videoWps.videoDate) : videoWps.videoDate != null) return false;
        if (videoType != null ? !videoType.equals(videoWps.videoType) : videoWps.videoType != null) return false;
        if (videoDescription != null ? !videoDescription.equals(videoWps.videoDescription) : videoWps.videoDescription != null)
            return false;
        if (videoAnnotation != null ? !videoAnnotation.equals(videoWps.videoAnnotation) : videoWps.videoAnnotation != null)
            return false;
        if (videoPath != null ? !videoPath.equals(videoWps.videoPath) : videoWps.videoPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idVideoWps ^ (idVideoWps >>> 32));
        result = 31 * result + (videoName != null ? videoName.hashCode() : 0);
        result = 31 * result + (videoDate != null ? videoDate.hashCode() : 0);
        result = 31 * result + (videoType != null ? videoType.hashCode() : 0);
        result = 31 * result + (videoDescription != null ? videoDescription.hashCode() : 0);
        result = 31 * result + (videoAnnotation != null ? videoAnnotation.hashCode() : 0);
        result = 31 * result + (videoPath != null ? videoPath.hashCode() : 0);
        result = 31 * result + (int) (genreIdGenre ^ (genreIdGenre >>> 32));
        result = 31 * result + storageIdStorage;
        return result;
    }
}
