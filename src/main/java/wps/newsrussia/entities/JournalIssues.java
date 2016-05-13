package wps.newsrussia.entities;

import java.sql.Date;


public class JournalIssues {
    private long id;
    private long issue;
    private String title;
    private Date date;
    private String linkToPdf;
    private String linkToTxt;
    private String keywords;
    private Journals journalsId;

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

    public String getLinkToPdf() {
        return linkToPdf;
    }

    public void setLinkToPdf(String linkToPdf) {
        this.linkToPdf = linkToPdf;
    }

    public String getLinkToTxt() {
        return linkToTxt;
    }

    public void setLinkToTxt(String linkToTxt) {
        this.linkToTxt = linkToTxt;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Journals getJournalsId() {
        return journalsId;
    }

    public void setJournalsId(Journals journalsId) {
        this.journalsId = journalsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalIssues that = (JournalIssues) o;

        if (id != that.id) return false;
        if (issue != that.issue) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (linkToPdf != null ? !linkToPdf.equals(that.linkToPdf) : that.linkToPdf != null) return false;
        if (linkToTxt != null ? !linkToTxt.equals(that.linkToTxt) : that.linkToTxt != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        return journalsId != null ? journalsId.equals(that.journalsId) : that.journalsId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (issue ^ (issue >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (linkToPdf != null ? linkToPdf.hashCode() : 0);
        result = 31 * result + (linkToTxt != null ? linkToTxt.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (journalsId != null ? journalsId.hashCode() : 0);
        return result;
    }
}
