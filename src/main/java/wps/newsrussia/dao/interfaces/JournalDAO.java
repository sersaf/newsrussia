package wps.newsrussia.dao.interfaces;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.entities.Journals;

import java.util.Date;
import java.util.List;


public interface JournalDAO {

    List<Journals> getJournal();
    List<Journals> getJournal(String journalname);
    List<Journals> getJournal(Date date_upload);
    List<Journals> getJournal(Genre genre);

}
