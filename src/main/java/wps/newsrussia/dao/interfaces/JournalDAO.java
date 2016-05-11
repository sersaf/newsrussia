package wps.newsrussia.dao.interfaces;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.entities.JournalWps;
import java.util.Date;
import java.util.List;


public interface JournalDAO {

    List<JournalWps> getJournal();
    List<JournalWps> getJournal(String journalname);
    List<JournalWps> getJournal(Date date_upload);
    List<JournalWps> getJournal(Genre genre);

}
