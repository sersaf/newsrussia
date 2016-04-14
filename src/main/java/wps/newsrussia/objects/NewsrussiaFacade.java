package wps.newsrussia.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wps.newsrussia.dao.interfaces.JournalDAO;
import wps.newsrussia.entities.Journal;

import java.util.List;
@Component
public class NewsrussiaFacade {

    private JournalDAO journalDAO;
    private List<Journal> journals;

@Autowired
    public void setJournalDAO(JournalDAO journalDAO) {
        this.journalDAO = journalDAO;
        journals=journalDAO.getJournal();
    }

    public List<Journal> getJournals() {
        return journals;
    }



}
