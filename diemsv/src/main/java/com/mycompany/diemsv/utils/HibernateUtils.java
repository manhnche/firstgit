/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemsv.utils;

import com.mycompany.diemsv.entities.Student;
import com.mycompany.diemsv.entities.diemCSI;
import com.mycompany.diemsv.entities.diemPRO;
import com.mycompany.diemsv.entities.diemMAE;
import com.mycompany.diemsv.entities.diemSSG;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/**
 *
 * @author manhnche186093
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory;
    static{
        try {
            Configuration configuration = new Configuration();
            
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/diemsv");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "congmanh2k4");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            configuration = configuration.setProperties(properties);
            
            configuration = configuration.addAnnotatedClass(Student.class);
            configuration = configuration.addAnnotatedClass(diemCSI.class);
            configuration = configuration.addAnnotatedClass(diemPRO.class);
            configuration = configuration.addAnnotatedClass(diemMAE.class);
            configuration = configuration.addAnnotatedClass(diemSSG.class);
            
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
        }
    }
    public static SessionFactory getSessionFactory(){
            return sessionFactory;
        }
    public static void shutdown(){
        getSessionFactory().close();
    }
}
