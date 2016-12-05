package java9r.dao.com;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;

import java9r.entites.com.Product;
import java9r.util.com.HibernateUtil;

public class ProductDAO {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")

	public Product FindAllByIdProducts(Integer id) {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			SQLQuery sqlq = sessionFactory.getCurrentSession().createSQLQuery("call getproductsbyid(:id)");
			sqlq.setInteger("id", id);
			return (Product) sqlq.addEntity(Product.class).uniqueResult();

		} catch (Exception e) {
			return null;
		}
	}
}