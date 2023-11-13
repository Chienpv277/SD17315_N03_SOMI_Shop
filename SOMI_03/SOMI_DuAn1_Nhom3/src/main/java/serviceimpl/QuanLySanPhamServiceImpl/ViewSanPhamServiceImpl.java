/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.SanPham;
import java.util.List;
import repository.QuanLySanPhamRepository.SanPhamRepository;
import service.QuanLySanPhamService.ViewSanPhamService;

/**
 *
 * @author FPTSHOP
 */
public class ViewSanPhamServiceImpl implements ViewSanPhamService{

    private SanPhamRepository repository = new SanPhamRepository();
    @Override
    public List<SanPham> getAll() {
        return repository.getAll();
    }
    
}
