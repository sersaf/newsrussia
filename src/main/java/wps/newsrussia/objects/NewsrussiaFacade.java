package wps.newsrussia.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wps.newsrussia.dao.interfaces.JournalDAO;
import wps.newsrussia.entities.JournalWps;

import java.util.List;
@Component("newsrussiaFacade")
@Scope("singleton")
public class NewsrussiaFacade {

    @Autowired
    private JournalDAO journalDAO;

    @Autowired
    private SearchCriteria searchCriteria;

    private List<JournalWps> journals;

    public List<JournalWps> getJournals() {
        if(journals == null){
            journals = journalDAO.getJournal();
        }

        return journals;
    }

    public void searchJournalsByText(){
        journals = journalDAO.getJournal(searchCriteria.getName());

    }

}
