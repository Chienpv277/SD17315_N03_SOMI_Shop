/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.DangAo;
import java.util.List;
import repository.QuanLySanPhamRepository.DangAoRepository;
import service.QuanLySanPhamService.ViewDangAoService;

/**
 *
 * @author FPTSHOP
 */
public class ViewDangAoServiceImpl implements ViewDangAoService{

    private DangAoRepository repository = new DangAoRepository();
    @Override
    public List<DangAo> getAll() {
        return repository.getAll();
    }
    
}
