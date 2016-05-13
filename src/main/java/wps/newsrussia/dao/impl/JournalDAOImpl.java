package wps.newsrussia.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import wps.newsrussia.entities.Genre;
import wps.newsrussia.dao.interfaces.JournalDAO;
import wps.newsrussia.entities.Journals;

import java.util.Date;
import java.util.List;

@Component
public class JournalDAOImpl implements JournalDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private ProjectionList journalProjection;

    public JournalDAOImpl() {
        journalProjection = Projections.projectionList();
        journalProjection.add(Projections.property("id"), "id");
        journalProjection.add(Projections.property("genreId"), "genreId");
        journalProjection.add(Projections.property("journalCoversId"), "journalCoversId");
        journalProjection.add(Projections.property("name"), "name");
        journalProjection.add(Projections.property("startDate"), "startDate");
        journalProjection.add(Projections.property("lastmodify"), "lastmodify");
    }



    private DetachedCriteria createJournalCriteria(){
        DetachedCriteria journalListCriteria = DetachedCriteria.forClass(Journals.class, "b");
        createAliases(journalListCriteria);
        return journalListCriteria;
    }


    @Transactional
    @Override
    public List<Journals> getJournal() {

        List<Journals> journals = createJournalList(createJournalCriteria());

        return journals;
    }

    @Transactional
    @Override
    public List<Journals> getJournal(String name) {
        List<Journals> journals = createJournalList(createJournalCriteria().add(Restrictions.ilike("b.name",name, MatchMode.ANYWHERE)));
        return journals;
    }


    @Transactional
    @Override
    public List<Journals> getJournal(Date date_upload) {
        return null;
    }

    @Transactional
    @Override
    public List<Journals> getJournal(Genre genre) {

        List<Journals> journals = createJournalList(createJournalCriteria().add(Restrictions.ilike("genre.Name", genre.getName(), MatchMode.ANYWHERE)));
        return journals;
    }


    private void createAliases(DetachedCriteria criteria) {
        criteria.createAlias("b.genreId", "genreId");
        criteria.createAlias("b.storageId", "storageId");
    }


    private List<Journals> createJournalList(DetachedCriteria bookListCriteria) {
        Criteria criteria = bookListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("b.name")).setProjection(journalProjection).setResultTransformer(Transformers.aliasToBean(Journals.class));
        return criteria.list();
    }




}
