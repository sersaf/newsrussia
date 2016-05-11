package wps.newsrussia.entities;

/**
 * Created by sergejsafonov on 11.05.16.
 */
public class Genre {
    private long idGenre;
    private String genreName;
    private Long parent;

    public long getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(long idGenre) {
        this.idGenre = idGenre;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return genreName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (idGenre != genre.idGenre) return false;
        if (genreName != null ? !genreName.equals(genre.genreName) : genre.genreName != null) return false;
        if (parent != null ? !parent.equals(genre.parent) : genre.parent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idGenre ^ (idGenre >>> 32));
        result = 31 * result + (genreName != null ? genreName.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }
}
