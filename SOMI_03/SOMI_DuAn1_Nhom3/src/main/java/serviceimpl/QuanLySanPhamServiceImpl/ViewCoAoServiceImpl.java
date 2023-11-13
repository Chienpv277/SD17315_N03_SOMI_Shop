/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl.QuanLySanPhamServiceImpl;

import domainModel.QuanLySanPham.CoAo;
import java.util.List;
import repository.QuanLySanPhamRepository.CoAoRepository;
import service.QuanLySanPhamService.ViewCoAoService;

/**
 *
 * @author FPTSHOP
 */
public class ViewCoAoServiceImpl implements ViewCoAoService{

    private CoAoRepository repository = new CoAoRepository();
    @Override
    public List<CoAo> getAll() {
        return repository.getAll();
    }
    
}
