/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.CoTay;
import java.util.List;
import repository.QuanLySanPhamRepository.CoTayRepository;
import service.QuanLySanPhamService.ViewCoTayService;

/**
 *
 * @author FPTSHOP
 */
public class ViewCoTayServiceImpl implements ViewCoTayService{

    private CoTayRepository repository = new CoTayRepository();
    @Override
    public List<CoTay> getAll() {
        return repository.getAll();
    }
}
