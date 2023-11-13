/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.Anh;
import java.util.List;
import repository.QuanLySanPhamRepository.HinhAnhRepository;
import service.QuanLySanPhamService.ViewHinhAnhService;

/**
 *
 * @author FPTSHOP
 */
public class ViewHinhAnhServiceImpl implements ViewHinhAnhService{

    private HinhAnhRepository repository = new HinhAnhRepository();
    @Override
    public List<Anh> getAll() {
        return repository.getAll();
    }
    
}
