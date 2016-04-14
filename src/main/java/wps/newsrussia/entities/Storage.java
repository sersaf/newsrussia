package wps.newsrussia.entities;

/**
 * Created by sergejsafonov on 10.04.16.
 */
public class Storage {
    private int idStorrage;
    private String issueType;
    private String path;

    public int getIdStorrage() {
        return idStorrage;
    }

    public void setIdStorrage(int idStorrage) {
        this.idStorrage = idStorrage;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storage storage = (Storage) o;

        if (idStorrage != storage.idStorrage) return false;
        if (issueType != null ? !issueType.equals(storage.issueType) : storage.issueType != null) return false;
        if (path != null ? !path.equals(storage.path) : storage.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStorrage;
        result = 31 * result + (issueType != null ? issueType.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
