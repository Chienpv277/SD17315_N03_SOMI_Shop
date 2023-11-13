/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.QuanLySanPhamRepository;

import domainModel.QuanLySanPham.Hang;
import config.HibernateUtil;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author FPTSHOP
 */
public class HangRepository {
    public List<Hang> getAll() {
        List<Hang> hangs = new ArrayList<>();
        Session session = HibernateUtil.getFACTORY().openSession();
        javax.persistence.Query query = session.createQuery("From Hang", Hang.class);
        hangs = query.getResultList();
        return hangs;
    }
    
    public static void main(String[] args) {
        new HangRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
