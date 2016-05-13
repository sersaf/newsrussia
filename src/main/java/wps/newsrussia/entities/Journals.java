package wps.newsrussia.entities;

import java.sql.Date;


public class Journals {
    private long id;
    private String name;
    private Date startDate;
    private Storage storageId;
    private Date lastmodify;
    private Genre genreId;
    private JournalCovers journalCoversId;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Storage getStorageId() {
        return storageId;
    }

    public void setStorageId(Storage storageId) {
        this.storageId = storageId;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public JournalCovers getJournalCoversId() {
        return journalCoversId;
    }

    public void setJournalCoversId(JournalCovers journalCoversId) {
        this.journalCoversId = journalCoversId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journals journals = (Journals) o;

        if (id != journals.id) return false;
        if (name != null ? !name.equals(journals.name) : journals.name != null) return false;
        if (startDate != null ? !startDate.equals(journals.startDate) : journals.startDate != null) return false;
        if (storageId != null ? !storageId.equals(journals.storageId) : journals.storageId != null) return false;
        if (lastmodify != null ? !lastmodify.equals(journals.lastmodify) : journals.lastmodify != null) return false;
        if (genreId != null ? !genreId.equals(journals.genreId) : journals.genreId != null) return false;
        return journalCoversId != null ? journalCoversId.equals(journals.journalCoversId) : journals.journalCoversId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (storageId != null ? storageId.hashCode() : 0);
        result = 31 * result + (lastmodify != null ? lastmodify.hashCode() : 0);
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (journalCoversId != null ? journalCoversId.hashCode() : 0);
        return result;
    }
}
