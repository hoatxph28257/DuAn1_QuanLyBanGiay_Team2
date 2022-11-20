/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.NSX;
import java.util.List;
import java.util.UUID;
import repository.INsx;
import repository.impl.NsxRepositoryImpl;
import service.NsxService;
import view_model.QLNsx;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(QLNsx nsx) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NSX findById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
