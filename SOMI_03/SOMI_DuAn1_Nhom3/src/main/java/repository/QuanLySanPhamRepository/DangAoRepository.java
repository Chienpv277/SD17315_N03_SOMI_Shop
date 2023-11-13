/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.QuanLySanPhamRepository;

import config.HibernateUtil;
import domainModel.QuanLySanPham.DangAo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author FPTSHOP
 */
public class DangAoRepository {
    public List<DangAo> getAll() {
        List<DangAo> x = new ArrayList<>();
        Session session = HibernateUtil.getFACTORY().openSession();
        javax.persistence.Query query = session.createQuery("From DangAo", DangAo.class);
        x = query.getResultList();
        return x;
    }
     
     public static void main(String[] args) {
        new DangAoRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
