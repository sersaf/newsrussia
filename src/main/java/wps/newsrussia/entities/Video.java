package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 10.04.16.
 */
public class Video {
    private long idVideoWps;
    private String videoName;
    private Date videoDate;
    private String videoType;
    private String videoDescription;
    private String videoAnnotation;
    private String videoPath;
    private int storageIdStorrage;
    private long genreId;

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

    public int getStorageIdStorrage() {
        return storageIdStorrage;
    }

    public void setStorageIdStorrage(int storageIdStorrage) {
        this.storageIdStorrage = storageIdStorrage;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        if (idVideoWps != video.idVideoWps) return false;
        if (storageIdStorrage != video.storageIdStorrage) return false;
        if (genreId != video.genreId) return false;
        if (videoName != null ? !videoName.equals(video.videoName) : video.videoName != null) return false;
        if (videoDate != null ? !videoDate.equals(video.videoDate) : video.videoDate != null) return false;
        if (videoType != null ? !videoType.equals(video.videoType) : video.videoType != null) return false;
        if (videoDescription != null ? !videoDescription.equals(video.videoDescription) : video.videoDescription != null)
            return false;
        if (videoAnnotation != null ? !videoAnnotation.equals(video.videoAnnotation) : video.videoAnnotation != null)
            return false;
        if (videoPath != null ? !videoPath.equals(video.videoPath) : video.videoPath != null) return false;

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
        result = 31 * result + storageIdStorrage;
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        return result;
    }
}
