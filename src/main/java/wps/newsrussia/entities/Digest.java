package wps.newsrussia.entities;

import java.sql.Date;

public class Digest {
    private long id;
    private String name;
    private Date lastmodify;
    private String startDate;
    private String lang;
    private Byte status;
    private Storage storageId;
    private Genre genreId;
    private DigestCover digestCoverId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Storage getStorageId() {
        return storageId;
    }

    public void setStorageId(Storage storageId) {
        this.storageId = storageId;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public DigestCover getDigestCoverId() {
        return digestCoverId;
    }

    public void setDigestCoverId(DigestCover digestCoverId) {
        this.digestCoverId = digestCoverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Digest digest = (Digest) o;

        if (id != digest.id) return false;
        if (name != null ? !name.equals(digest.name) : digest.name != null) return false;
        if (lastmodify != null ? !lastmodify.equals(digest.lastmodify) : digest.lastmodify != null) return false;
        if (startDate != null ? !startDate.equals(digest.startDate) : digest.startDate != null) return false;
        if (lang != null ? !lang.equals(digest.lang) : digest.lang != null) return false;
        if (status != null ? !status.equals(digest.status) : digest.status != null) return false;
        if (storageId != null ? !storageId.equals(digest.storageId) : digest.storageId != null) return false;
        if (genreId != null ? !genreId.equals(digest.genreId) : digest.genreId != null) return false;
        return digestCoverId != null ? digestCoverId.equals(digest.digestCoverId) : digest.digestCoverId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastmodify != null ? lastmodify.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (storageId != null ? storageId.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (digestCoverId != null ? digestCoverId.hashCode() : 0);
        return result;
    }
}
