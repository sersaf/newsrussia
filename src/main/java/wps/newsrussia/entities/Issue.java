package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 10.04.16.
 */
public class Issue {
    private long idIssueWps;
    private String issueName;
    private Date issueLastmodify;
    private String issueLang;
    private byte issueStatus;
    private String issueStart;
    private String issuePath;
    private int storageIdStorrage;
    private long genreId;

    public long getIdIssueWps() {
        return idIssueWps;
    }

    public void setIdIssueWps(long idIssueWps) {
        this.idIssueWps = idIssueWps;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public Date getIssueLastmodify() {
        return issueLastmodify;
    }

    public void setIssueLastmodify(Date issueLastmodify) {
        this.issueLastmodify = issueLastmodify;
    }

    public String getIssueLang() {
        return issueLang;
    }

    public void setIssueLang(String issueLang) {
        this.issueLang = issueLang;
    }

    public byte getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(byte issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getIssueStart() {
        return issueStart;
    }

    public void setIssueStart(String issueStart) {
        this.issueStart = issueStart;
    }

    public String getIssuePath() {
        return issuePath;
    }

    public void setIssuePath(String issuePath) {
        this.issuePath = issuePath;
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

        Issue issue = (Issue) o;

        if (idIssueWps != issue.idIssueWps) return false;
        if (issueStatus != issue.issueStatus) return false;
        if (storageIdStorrage != issue.storageIdStorrage) return false;
        if (genreId != issue.genreId) return false;
        if (issueName != null ? !issueName.equals(issue.issueName) : issue.issueName != null) return false;
        if (issueLastmodify != null ? !issueLastmodify.equals(issue.issueLastmodify) : issue.issueLastmodify != null)
            return false;
        if (issueLang != null ? !issueLang.equals(issue.issueLang) : issue.issueLang != null) return false;
        if (issueStart != null ? !issueStart.equals(issue.issueStart) : issue.issueStart != null) return false;
        if (issuePath != null ? !issuePath.equals(issue.issuePath) : issue.issuePath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idIssueWps ^ (idIssueWps >>> 32));
        result = 31 * result + (issueName != null ? issueName.hashCode() : 0);
        result = 31 * result + (issueLastmodify != null ? issueLastmodify.hashCode() : 0);
        result = 31 * result + (issueLang != null ? issueLang.hashCode() : 0);
        result = 31 * result + (int) issueStatus;
        result = 31 * result + (issueStart != null ? issueStart.hashCode() : 0);
        result = 31 * result + (issuePath != null ? issuePath.hashCode() : 0);
        result = 31 * result + storageIdStorrage;
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        return result;
    }
}
