package wps.newsrussia.dao.interfaces;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.entities.Journal;
import java.util.Date;
import java.util.List;


public interface JournalDAO {

    List<Journal> getJournal();
    List<Journal> getJournal(String journalname);
    List<Journal> getJournal(Date date_upload);
    List<Journal> getJournal(Genre genre);

}
