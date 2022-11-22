/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.NSX;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import repository.INsx;
import repository.impl.NsxRepositoryImpl;
import service.NsxService;
import view_model.QLNsx;
import view_model.QLNsxFind;

/**
 *
 * @author 84961
 */
public class NsxServiceImpl implements NsxService {
    
    private INsx nsxRep = new NsxRepositoryImpl();

    
    @Override
    public List<QLNsx> getAllNSX() {
        return nsxRep.getAllNsx();
    }

    @Override
    public String save(QLNsx nsx) {
        NSX nsx1 = new NSX(nsx.getId(), nsx.getMa(), nsx.getTen());
        boolean add = nsxRep.save(nsx1);
        if (add) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(QLNsx nsx) {
        NSX nsx1 = new NSX(nsx.getId(),nsx.getMa(), nsx.getTen());
        boolean update = nsxRep.update(nsx1);
        if (update) {
            return "Cập nhật thành công";
        } else {
            return "Cập nhật thất bại";
        }
    }

    @Override
    public String delete(UUID id) {
        boolean delete = nsxRep.delete(id);
        if (delete) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public NSX findByID(UUID id) {
        return nsxRep.findByID(id);
    }
    
}
