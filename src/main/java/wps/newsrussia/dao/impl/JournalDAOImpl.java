package wps.newsrussia.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.entities.Journal;
import wps.newsrussia.dao.interfaces.JournalDAO;

import java.util.Date;
import java.util.List;

@Component
public class JournalDAOImpl implements JournalDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private ProjectionList journalProjection;

    public JournalDAOImpl() {
        journalProjection = Projections.projectionList();
        journalProjection.add(Projections.property("idJournal"), "idJournal");
        journalProjection.add(Projections.property("journalName"), "journalName");
        journalProjection.add(Projections.property("journalLinkToPdf"), "journalLinkToPdf");
        journalProjection.add(Projections.property("journalDateUpload"), "journalDateUpload");
        journalProjection.add(Projections.property("journalDate"), "journalDate");
        journalProjection.add(Projections.property("genreId"), "genreId");
        journalProjection.add(Projections.property("journalStorageId"), "journalStorageId");
        journalProjection.add(Projections.property("journalIssue"), "journalIssue");
    }



    private DetachedCriteria createJournalCriteria(){
        DetachedCriteria journalListCriteria = DetachedCriteria.forClass(Journal.class, "b");
        createAliases(journalListCriteria);
        return journalListCriteria;
    }


    @Transactional
    @Override
    public List<Journal> getJournal() {

        List<Journal> journals = createJournalList(createJournalCriteria());

        return journals;
    }

    @Transactional
    @Override
    public List<Journal> getJournal(String journalname) {
        List<Journal> journals = createJournalList(createJournalCriteria().add(Restrictions.ilike("b.journalName",journalname, MatchMode.ANYWHERE)));
        return journals;
    }

    @Transactional
    @Override
    public List<Journal> getJournal(Date date_upload) {
        return null;
    }

    @Transactional
    @Override
    public List<Journal> getJournal(Genre genre) {

        List<Journal> journals = createJournalList(createJournalCriteria().add(Restrictions.ilike("genre.genreName", genre.getGenreName(), MatchMode.ANYWHERE)));
        return journals;
    }


    private void createAliases(DetachedCriteria criteria) {
        criteria.createAlias("b.genreId", "genreId");
        criteria.createAlias("b.journalStorageId", "storageId");
    }


    private List<Journal> createJournalList(DetachedCriteria bookListCriteria) {
        Criteria criteria = bookListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("b.genreId")).setProjection(journalProjection).setResultTransformer(Transformers.aliasToBean(Journal.class));
        return criteria.list();
    }




}
