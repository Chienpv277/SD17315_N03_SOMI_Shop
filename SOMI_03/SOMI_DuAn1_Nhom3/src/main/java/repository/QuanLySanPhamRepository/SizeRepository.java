/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.QuanLySanPhamRepository;

import config.HibernateUtil;
import domainModel.QuanLySanPham.Size;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author FPTSHOP
 */
public class SizeRepository {
    public List<Size> getAll() {
        List<Size> x = new ArrayList<>();
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From Size", Size.class);
        x = query.getResultList();
        return x;
    }
     
     public static void main(String[] args) {
        new SizeRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
