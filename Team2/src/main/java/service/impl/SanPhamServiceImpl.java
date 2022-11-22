/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import repository.ISanPham;
import repository.impl.SanPhamRepository;
import service.SanPhamService;
import view_model.QLSP;

/**
 *
 * @author 84961
 */
public class SanPhamServiceImpl implements SanPhamService{

    private ISanPham spRep = new SanPhamRepository();
    private List<QLSP> lists = new ArrayList<>();
    
    @Override
    public List<QLSP> getAllSP() {
        return spRep.getAllSP();
    }

    @Override
    public String save(QLSP x) {
        
        SanPham ql = new SanPham(x.getId(),x.getMaSP(), x.getTenSP());
        boolean add = spRep.save(ql);
        if (add) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(QLSP x) { 
        SanPham sp = new SanPham(x.getId(),x.getMaSP(), x.getTenSP());
        boolean update = spRep.update(sp);
        if (update) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public SanPham findById(String ma) {
        return null;
    }

    @Override
    public String delete(UUID id) {
        boolean delete = spRep.delete(id);
        if (delete) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public List<SanPham> findByName(String name) {
        return spRep.findByName(name);
    }

    
    
}
