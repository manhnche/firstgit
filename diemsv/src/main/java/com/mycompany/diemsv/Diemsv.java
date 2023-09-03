/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diemsv;

import com.mycompany.diemsv.entities.Student;
import com.mycompany.diemsv.entities.diemCSI;
import com.mycompany.diemsv.entities.diemMAE;
import com.mycompany.diemsv.entities.diemPRO;
import com.mycompany.diemsv.entities.diemSSG;
import com.mycompany.diemsv.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author manhnche186093
 */
public class Diemsv {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Student student;
            
            student = new Student("HE186093","Nguyen Cong Manh");
            session.save(student);
            session.save(new diemCSI(9.2f,student));
            session.save(new diemPRO(8.6f,student));
            session.save(new diemMAE(7.9f,student));
            session.save(new diemSSG(8.2f,student));
            
            student = new Student("HS185497","Duong Tinh Nam");
            session.save(student);
            session.save(new diemCSI(5.6f,student));
            session.save(new diemPRO(4.7f,student));
            session.save(new diemMAE(9.0f,student));
            session.save(new diemSSG(8f,student));
            
            student = new Student("HE173849","Pham Quang Linh");
            session.save(student);
            session.save(new diemCSI(8.8f,student));
            session.save(new diemPRO(6.3f,student));
            session.save(new diemMAE(9.4f,student));
            session.save(new diemSSG(7.1f,student));
            
            student = new Student("HE184579","Phan Manh Tuan");
            session.save(student);
            session.save(new diemCSI(4.5f,student));
            session.save(new diemPRO(7.1f,student));
            session.save(new diemMAE(2.2f,student));
            session.save(new diemSSG(8.8f,student));
                                    
            student = new Student("HE187523", "Tran Van Khuyen");
            session.save(student);
            session.save(new diemCSI(7.7f,student));
            session.save(new diemPRO(6.1f,student));
            session.save(new diemMAE(9.3f,student));
            session.save(new diemSSG(5.5f,student));
            
        } catch (Exception e) {
            if(session.getTransaction() != null && session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
            HibernateUtils.shutdown();
        }
    }
}
