package wps.newsrussia.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import wps.newsrussia.enums.SearchType;

import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Utils {

    private Map<String, SearchType> searchTypeList = new HashMap<String, SearchType>();
    private SearchType selectedSearchType = SearchType.TITLE;// значение по-умолчанию


    @Autowired
    private MessageSource msg;

    private Character[] letters = new Character[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public Character[] getLetters() {
        return letters;
    }

    public Map<String, SearchType> getSearchTypeList() {
        searchTypeList.clear();
        searchTypeList.put(msg.getMessage("title", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.TITLE);
        searchTypeList.put(msg.getMessage("text", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.TEXT);
        return searchTypeList;
    }

    public SearchType getSelectedSearchType() {
        return selectedSearchType;
    }

    public void setSearchTypeList(Map<String, SearchType> searchTypeList) {
        this.searchTypeList = searchTypeList;
    }


}