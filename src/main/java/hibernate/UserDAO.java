package hibernate;

import org.hibernate.Session;

public class UserDAO {

    public UserEntity read(int id) {
        Session session = HibernateConfiguration.getSessionFactory()
                .openSession();
        return session.get(UserEntity.class, id);
    }
}
