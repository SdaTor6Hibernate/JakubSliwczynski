import model.*;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad1 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Country country = session.find(Country.class, 3);
        Address address = session.find(Address.class, 3);
        Category category = session.find(Category.class, 1);
        Product product = session.find(Product.class, 1);
        User user = session.find(User.class, 5);
        Order order = session.find(Order.class, 5);
        session.close();
        System.out.println(country.toString());
        System.out.println(address.toString());
        System.out.println(category.toString());
        System.out.println(product.toString());
        System.out.println(user.toString());
        System.out.println(order.toString());
    }

}
