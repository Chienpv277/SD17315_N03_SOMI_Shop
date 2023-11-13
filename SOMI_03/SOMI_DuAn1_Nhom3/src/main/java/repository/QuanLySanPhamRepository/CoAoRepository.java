/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.QuanLySanPhamRepository;

import config.HibernateUtil;
import domainModel.QuanLySanPham.CoAo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author FPTSHOP
 */
public class CoAoRepository {
     public List<CoAo> getAll() {
        List<CoAo> x = new ArrayList<>();
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From CoAo", CoAo.class);
        x = query.getResultList();
        return x;
    }
     
     public static void main(String[] args) {
        new CoAoRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
