package wps.newsrussia.entities;

/**
 * Created by sergejsafonov on 11.05.16.
 */
public class Storage {
    private int idStorage;
    private String issueType;

    public int getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(int idStorage) {
        this.idStorage = idStorage;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storage storage = (Storage) o;

        if (idStorage != storage.idStorage) return false;
        if (issueType != null ? !issueType.equals(storage.issueType) : storage.issueType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStorage;
        result = 31 * result + (issueType != null ? issueType.hashCode() : 0);
        return result;
    }
}
