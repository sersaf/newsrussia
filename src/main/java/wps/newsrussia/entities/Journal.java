package wps.newsrussia.entities;

import java.sql.Date;


public class Journal {
    private long idJournal;
    private String journalName;
    private String journalLinkToPdf;
    private String journalLinkToTxt;
    private Date journalDateUpload;
    private Date journalDate;
    private Genre genreId;
    private Storage journalStorageId;
    private Integer journalIssue;

    public Journal() {
    }

    public Journal(long idJournal, String journalName, String journalLinkToPdf, String journalLinkToTxt, Date journalDateUpload, Date journalDate, Genre genreId, Storage journalStorageId, Integer journalIssue) {
        this.idJournal = idJournal;
        this.journalName = journalName;
        this.journalLinkToPdf = journalLinkToPdf;
        this.journalLinkToTxt = journalLinkToTxt;
        this.journalDateUpload = journalDateUpload;
        this.journalDate = journalDate;
        this.genreId = genreId;
        this.journalStorageId = journalStorageId;
        this.journalIssue = journalIssue;
    }

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

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public Storage getJournalStorageId() {
        return journalStorageId;
    }

    public void setJournalStorageId(Storage journalStorageId) {
        this.journalStorageId = journalStorageId;
    }

    public Integer getJournalIssue() {
        return journalIssue;
    }

    public void setJournalIssue(Integer journalIssue) {
        this.journalIssue = journalIssue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journal journal = (Journal) o;

        if (idJournal != journal.idJournal) return false;
        if (journalName != null ? !journalName.equals(journal.journalName) : journal.journalName != null) return false;
        if (journalLinkToPdf != null ? !journalLinkToPdf.equals(journal.journalLinkToPdf) : journal.journalLinkToPdf != null)
            return false;
        if (journalLinkToTxt != null ? !journalLinkToTxt.equals(journal.journalLinkToTxt) : journal.journalLinkToTxt != null)
            return false;
        if (journalDateUpload != null ? !journalDateUpload.equals(journal.journalDateUpload) : journal.journalDateUpload != null)
            return false;
        if (journalDate != null ? !journalDate.equals(journal.journalDate) : journal.journalDate != null) return false;
        if (genreId != null ? !genreId.equals(journal.genreId) : journal.genreId != null) return false;
        if (journalStorageId != null ? !journalStorageId.equals(journal.journalStorageId) : journal.journalStorageId != null)
            return false;
        return journalIssue != null ? journalIssue.equals(journal.journalIssue) : journal.journalIssue == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (idJournal ^ (idJournal >>> 32));
        result = 31 * result + (journalName != null ? journalName.hashCode() : 0);
        result = 31 * result + (journalLinkToPdf != null ? journalLinkToPdf.hashCode() : 0);
        result = 31 * result + (journalLinkToTxt != null ? journalLinkToTxt.hashCode() : 0);
        result = 31 * result + (journalDateUpload != null ? journalDateUpload.hashCode() : 0);
        result = 31 * result + (journalDate != null ? journalDate.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (journalStorageId != null ? journalStorageId.hashCode() : 0);
        result = 31 * result + (journalIssue != null ? journalIssue.hashCode() : 0);
        return result;
    }
}
