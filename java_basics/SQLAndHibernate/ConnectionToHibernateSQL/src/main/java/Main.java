import Hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry)
                .getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        String sql = "REPLACE INTO linkedpurchaselist(student_id, course_id)\n" +
                "SELECT students.id,courses.id" +
                " FROM courses \n" +
                " JOIN purchaselist ON courses.name = course_name\n" +
                " JOIN students ON students.name = student_name;";

        session.beginTransaction();
        session.createNativeQuery(sql).executeUpdate();


        Student student1 = session.get(Student.class, 37);
        List<LinkedPurchaseList> linkedPurchaseLists_st2 = student1.getPurchaseList();
        System.out.println(student1.getName() + " подписан на курсы ");
        linkedPurchaseLists_st2.forEach(System.out::println);
        System.out.println("*************");

        for (LinkedPurchaseList p : linkedPurchaseLists_st2) {

            System.out.println(p.getCourseId());
        }

        session.getTransaction().commit();
        session.close();

    }

}
