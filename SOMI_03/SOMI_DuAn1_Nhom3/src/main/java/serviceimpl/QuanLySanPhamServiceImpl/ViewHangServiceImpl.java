/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.Hang;
import java.util.List;
import repository.QuanLySanPhamRepository.HangRepository;
import service.QuanLySanPhamService.ViewHangService;

/**
 *
 * @author FPTSHOP
 */
public class ViewHangServiceImpl implements ViewHangService{

    private HangRepository repository = new HangRepository();
    @Override
    public List<Hang> getList() {
        return repository.getAll();
    }
    
}
