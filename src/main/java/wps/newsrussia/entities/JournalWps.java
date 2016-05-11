package wps.newsrussia.entities;

import java.sql.Date;
import java.util.Arrays;

public class JournalWps {
    private long idJournal;
    private String journalName;
    private String journalLinkToPdf;
    private String journalLinkToTxt;
    private Date journalDateUpload;
    private Date journalDate;
    private Integer journalIssue;
    private String journalCover;
    private Genre genreIdGenre;
    private Storage storageIdStorage;

    public long getIdJournal() {
        return idJournal;
    }

    public void setIdJournal(long idJournal) {
        this.idJournal = idJournal;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getJournalLinkToPdf() {
        return journalLinkToPdf;
    }

    public void setJournalLinkToPdf(String journalLinkToPdf) {
        this.journalLinkToPdf = journalLinkToPdf;
    }

    public String getJournalLinkToTxt() {
        return journalLinkToTxt;
    }

    public void setJournalLinkToTxt(String journalLinkToTxt) {
        this.journalLinkToTxt = journalLinkToTxt;
    }

    public Date getJournalDateUpload() {
        return journalDateUpload;
    }

    public void setJournalDateUpload(Date journalDateUpload) {
        this.journalDateUpload = journalDateUpload;
    }

    public Date getJournalDate() {
        return journalDate;
    }

    public void setJournalDate(Date journalDate) {
        this.journalDate = journalDate;
    }

    public Integer getJournalIssue() {
        return journalIssue;
    }

    public void setJournalIssue(Integer journalIssue) {
        this.journalIssue = journalIssue;
    }

    public String getJournalCover() {
        return journalCover;
    }

    public void setJournalCover(String journalCover) {
        this.journalCover = journalCover;
    }

    public Genre getGenreIdGenre() {
        return genreIdGenre;
    }

    public void setGenreIdGenre(Genre genreIdGenre) {
        this.genreIdGenre = genreIdGenre;
    }

    public Storage getStorageIdStorage() {
        return storageIdStorage;
    }

    public void setStorageIdStorage(Storage storageIdStorage) {
        this.storageIdStorage = storageIdStorage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalWps that = (JournalWps) o;

        if (idJournal != that.idJournal) return false;
        if (journalName != null ? !journalName.equals(that.journalName) : that.journalName != null) return false;
        if (journalLinkToPdf != null ? !journalLinkToPdf.equals(that.journalLinkToPdf) : that.journalLinkToPdf != null)
            return false;
        if (journalLinkToTxt != null ? !journalLinkToTxt.equals(that.journalLinkToTxt) : that.journalLinkToTxt != null)
            return false;
        if (journalDateUpload != null ? !journalDateUpload.equals(that.journalDateUpload) : that.journalDateUpload != null)
            return false;
        if (journalDate != null ? !journalDate.equals(that.journalDate) : that.journalDate != null) return false;
        if (journalIssue != null ? !journalIssue.equals(that.journalIssue) : that.journalIssue != null) return false;
        if (journalCover != null ? !journalCover.equals(that.journalCover) : that.journalCover != null) return false;
        if (genreIdGenre != null ? !genreIdGenre.equals(that.genreIdGenre) : that.genreIdGenre != null) return false;
        return storageIdStorage != null ? storageIdStorage.equals(that.storageIdStorage) : that.storageIdStorage == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (idJournal ^ (idJournal >>> 32));
        result = 31 * result + (journalName != null ? journalName.hashCode() : 0);
        result = 31 * result + (journalLinkToPdf != null ? journalLinkToPdf.hashCode() : 0);
        result = 31 * result + (journalLinkToTxt != null ? journalLinkToTxt.hashCode() : 0);
        result = 31 * result + (journalDateUpload != null ? journalDateUpload.hashCode() : 0);
        result = 31 * result + (journalDate != null ? journalDate.hashCode() : 0);
        result = 31 * result + (journalIssue != null ? journalIssue.hashCode() : 0);
        result = 31 * result + (journalCover != null ? journalCover.hashCode() : 0);
        result = 31 * result + (genreIdGenre != null ? genreIdGenre.hashCode() : 0);
        result = 31 * result + (storageIdStorage != null ? storageIdStorage.hashCode() : 0);
        return result;
    }
}
