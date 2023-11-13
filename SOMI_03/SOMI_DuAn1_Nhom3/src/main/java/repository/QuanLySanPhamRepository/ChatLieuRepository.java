/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.QuanLySanPhamRepository;

import config.HibernateUtil;
import domainModel.QuanLySanPham.ChatLieu;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author FPTSHOP
 */
public class ChatLieuRepository {

    public List<ChatLieu> getAll() {
        List<ChatLieu> chatLieus = new ArrayList<>();
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From ChatLieu", ChatLieu.class);
        chatLieus = query.getResultList();
        return chatLieus;
    }

    public static void main(String[] args) {
        List<ChatLieu> list = new ChatLieuRepository().getAll();
        for (ChatLieu x : list) {
            System.out.println(x.toString());
        }
    }
}
