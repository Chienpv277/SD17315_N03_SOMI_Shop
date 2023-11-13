/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import domainModel.QuanLySanPham.Anh;
import domainModel.QuanLySanPham.CoAo;
import domainModel.QuanLySanPham.CoTay;
import domainModel.QuanLySanPham.DangAo;
import domainModel.QuanLySanPham.Hang;
import domainModel.QuanLySanPham.MauSac;
import domainModel.QuanLySanPham.SanPham;
import domainModel.QuanLySanPham.Size;
import domainModel.QuanLySanPham.ChatLieu;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author ADAMIN
 */

import java.util.Properties;
import org.hibernate.Session;

public class HibernateUtil {
    
    private static final SessionFactory FACTORY;
    private static Session session;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DB_Nhom3_09_11");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "244456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.addAnnotatedClass(ChatLieu.class);
        conf.addAnnotatedClass(CoAo.class);
        conf.addAnnotatedClass(CoTay.class);
        conf.addAnnotatedClass(DangAo.class);
        conf.addAnnotatedClass(Hang.class);
        conf.addAnnotatedClass(Anh.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(Size.class);
        conf.setProperties(properties);
        
//        conf.addAnnotatedClass(DongVat.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    
   
//    public static Session getSession() {
//        if (Session == null || !Session.isConnected()) {
//            Session = FACTORY.openSession();
//        }
//        return Session;
//    }

    public static void main(String[] args) {
        getFACTORY();
    }
}
