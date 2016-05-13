package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 12.05.16.
 */
public class Audio {
    private long id;
    private String title;
    private Date date;
    private String type;
    private String path;
    private String description;
    private String annotation;
    private Genre genreId;
    private Storage storageId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public Storage getStorageId() {
        return storageId;
    }

    public void setStorageId(Storage storageId) {
        this.storageId = storageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audio audio = (Audio) o;

        if (id != audio.id) return false;
        if (title != null ? !title.equals(audio.title) : audio.title != null) return false;
        if (date != null ? !date.equals(audio.date) : audio.date != null) return false;
        if (type != null ? !type.equals(audio.type) : audio.type != null) return false;
        if (path != null ? !path.equals(audio.path) : audio.path != null) return false;
        if (description != null ? !description.equals(audio.description) : audio.description != null) return false;
        if (annotation != null ? !annotation.equals(audio.annotation) : audio.annotation != null) return false;
        if (genreId != null ? !genreId.equals(audio.genreId) : audio.genreId != null) return false;
        return storageId != null ? storageId.equals(audio.storageId) : audio.storageId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (storageId != null ? storageId.hashCode() : 0);
        return result;
    }
}
