//package com.airTicket.repository;
//
//
//        import com.airTicket.core.BaseEntity;
//        import org.hibernate.Session;
//        import org.hibernate.SessionFactory;
//        import org.hibernate.boot.MetadataSources;
//        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//        import org.hibernate.service.ServiceRegistry;
//        import org.springframework.stereotype.Component;
//
//        import javax.persistence.criteria.CriteriaBuilder;
//        import javax.persistence.criteria.CriteriaQuery;
//        import java.lang.reflect.ParameterizedType;
//        import java.util.List;
//
//@Component
//public class CustomCrudRepositoryImpl<T extends BaseEntity> implements CustomCrudRepository<T, Long> {
//
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//
//    private Class<T> typeOfT;
//
//    private static SessionFactory buildSessionFactory() {
//        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
//        return new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
//    }
//
//    @SuppressWarnings("unchecked")
//    private void setTypeOfT() {
//        this.typeOfT = (Class<T>)
//                ((ParameterizedType)getClass()
//                        .getGenericSuperclass())
//                        .getActualTypeArguments()[0];
//
//    }
//
//    @Override
//    public T save(T s) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(s);
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("hello in save!");
//        return s;
//    }
//
//    @Override
//    public T findOne(Long id) {
//        setTypeOfT();
//        Session session = sessionFactory.openSession();
//        T result = session.get(typeOfT, id);
//        System.out.println(typeOfT);
//        session.close();
//        return result;
//    }
//
//    @Override
//    public List<T> findAll() {
//        setTypeOfT();
//        Session session = sessionFactory.openSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<T> criteria = builder.createQuery(typeOfT);
//        criteria.from(typeOfT);
//        return session.createQuery(criteria).getResultList();
//    }
//}
