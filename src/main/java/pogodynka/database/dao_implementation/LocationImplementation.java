package pogodynka.database.dao_implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pogodynka.database.dao.LocationDao;
import pogodynka.database.utils.HibernateUtils;
import pogodynka.model.Location;

import java.time.LocalDate;
import java.util.List;

public class LocationImplementation implements LocationDao {

    @Override
    public void save(Location location) {
        Session session = HibernateUtils
                .getInstance()
                .getSessionFactory()
                .getCurrentSession();

        session.beginTransaction();
        session.saveOrUpdate(location);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Location findById(Long id) {
        Session session = HibernateUtils
                .getInstance()
                .getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();

        Location location = session
                .createQuery("from NfcTag where id=:id", Location.class)
                .setParameter("id", id)
                .uniqueResult();

        session.getTransaction().commit();
        session.close();

        return location;
    }

    @Override
    public List<Location> findAll() {
        SessionFactory sessionFactory = HibernateUtils
                .getInstance()
                .getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        List<Location> locationList = session
                .createQuery("from Location", Location.class)
                .list();

        session.getTransaction().commit();
        session.close();
        return locationList;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Location> findByName(Location location) {
        return null;
    }
}
