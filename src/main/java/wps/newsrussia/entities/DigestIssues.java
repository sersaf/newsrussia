package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 12.05.16.
 */
public class DigestIssues {
    private long id;
    private long issue;
    private String title;
    private Date date;
    private String path;
    private String keywords;
    private Digest digestId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIssue() {
        return issue;
    }

    public void setIssue(long issue) {
        this.issue = issue;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Digest getDigestId() {
        return digestId;
    }

    public void setDigestId(Digest digestId) {
        this.digestId = digestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DigestIssues that = (DigestIssues) o;

        if (id != that.id) return false;
        if (issue != that.issue) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        return digestId != null ? digestId.equals(that.digestId) : that.digestId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (issue ^ (issue >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (digestId != null ? digestId.hashCode() : 0);
        return result;
    }
}
