package wps.newsrussia.objects;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.enums.SearchType;

import java.io.Serializable;

@Component
@Scope("singleton")
public class SearchCriteria implements Serializable {

    private String name;
    private SearchType searchType = SearchType.TEXT;
    private String title;
    private Genre genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


}
