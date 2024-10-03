package main;

import bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("rahul");
        std.setStd_id(103);
        std.setGender("male");
        std.setCity("patna");
        std.setEmail("rahul@gmail.com");
        std.setRollno(12347);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(std);
        tx.commit();


    }
}
