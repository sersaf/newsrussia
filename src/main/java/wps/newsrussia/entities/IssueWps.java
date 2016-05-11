package wps.newsrussia.entities;

import java.sql.Date;
import java.util.Arrays;

/**
 * Created by sergejsafonov on 11.05.16.
 */
public class IssueWps {
    private long idIssueWps;
    private String issueName;
    private Date issueLastmodify;
    private String issueLang;
    private byte issueStatus;
    private String issueStart;
    private String issuePath;
    private long genreIdGenre;
    private int storageIdStorage;
    private byte[] issueCover;

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

    public byte[] getIssueCover() {
        return issueCover;
    }

    public void setIssueCover(byte[] issueCover) {
        this.issueCover = issueCover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IssueWps issueWps = (IssueWps) o;

        if (idIssueWps != issueWps.idIssueWps) return false;
        if (issueStatus != issueWps.issueStatus) return false;
        if (genreIdGenre != issueWps.genreIdGenre) return false;
        if (storageIdStorage != issueWps.storageIdStorage) return false;
        if (issueName != null ? !issueName.equals(issueWps.issueName) : issueWps.issueName != null) return false;
        if (issueLastmodify != null ? !issueLastmodify.equals(issueWps.issueLastmodify) : issueWps.issueLastmodify != null)
            return false;
        if (issueLang != null ? !issueLang.equals(issueWps.issueLang) : issueWps.issueLang != null) return false;
        if (issueStart != null ? !issueStart.equals(issueWps.issueStart) : issueWps.issueStart != null) return false;
        if (issuePath != null ? !issuePath.equals(issueWps.issuePath) : issueWps.issuePath != null) return false;
        if (!Arrays.equals(issueCover, issueWps.issueCover)) return false;

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
        result = 31 * result + (int) (genreIdGenre ^ (genreIdGenre >>> 32));
        result = 31 * result + storageIdStorage;
        result = 31 * result + Arrays.hashCode(issueCover);
        return result;
    }
}
