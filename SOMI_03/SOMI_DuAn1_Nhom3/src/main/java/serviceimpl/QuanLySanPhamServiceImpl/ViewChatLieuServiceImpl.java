/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.ChatLieu;
import java.util.List;
import repository.QuanLySanPhamRepository.ChatLieuRepository;
import service.QuanLySanPhamService.ViewChatLieuService;

/**
 *
 * @author FPTSHOP
 */
public class ViewChatLieuServiceImpl implements ViewChatLieuService{

    private ChatLieuRepository repository = new ChatLieuRepository();
    @Override
    public List<ChatLieu> getAll() {
        return repository.getAll();
    }
    
}
