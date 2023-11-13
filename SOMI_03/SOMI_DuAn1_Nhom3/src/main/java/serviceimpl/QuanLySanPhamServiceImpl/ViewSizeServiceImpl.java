/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.Size;
import java.util.List;
import repository.QuanLySanPhamRepository.SizeRepository;
import service.QuanLySanPhamService.ViewSizeService;

/**
 *
 * @author FPTSHOP
 */
public class ViewSizeServiceImpl implements ViewSizeService{

    private SizeRepository repository = new SizeRepository();
    @Override
    public List<Size> getAll() {
        return repository.getAll();
    }
    
}
