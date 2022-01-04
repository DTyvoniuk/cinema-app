package cinema.dao.impl;

import cinema.model.Order;
import cinema.util.HibernateUtil;
import java.util.List;
import cinema.dao.OrderDao;
import cinema.exception.DataProcessingException;
import cinema.lib.Dao;
import cinema.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class OrderDaoImpl implements OrderDao {
    @Override
    public Order add(Order order) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
            return order;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add order " + order + " to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Order> getByUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Order> getOrdersByUser = session.createQuery("from Order o "
                    + "join fetch o.user "
                    + "join fetch o.tickets t "
                    + "join fetch t.movieSession mv "
                    + "join fetch mv.movie "
                    + "join fetch mv.cinemaHall "
                    + "where o.user = :user", Order.class);
            getOrdersByUser.setParameter("user", user);
            return getOrdersByUser.getResultList();
        } catch (HibernateException e) {
            throw new DataProcessingException("Can't get orders by user " + user + " from DB", e);
        }
    }
}
