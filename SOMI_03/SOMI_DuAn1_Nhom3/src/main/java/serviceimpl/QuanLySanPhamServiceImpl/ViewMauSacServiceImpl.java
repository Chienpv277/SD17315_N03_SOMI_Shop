/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.MauSac;
import java.util.List;
import repository.QuanLySanPhamRepository.MauSacRepository;
import service.QuanLySanPhamService.ViewMauSacService;

/**
 *
 * @author FPTSHOP
 */
public class ViewMauSacServiceImpl implements ViewMauSacService{

    private MauSacRepository repository = new MauSacRepository();
    @Override
    public List<MauSac> getAll() {
        return repository.getAll();
    }
    
}
