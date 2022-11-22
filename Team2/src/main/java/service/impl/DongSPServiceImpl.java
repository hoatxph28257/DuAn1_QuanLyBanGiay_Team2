/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.DongSP;
import java.util.List;
import repository.IDongSP;
import repository.impl.DongSPRepository;
import service.DongSPService;

/**
 *
 * @author Admin
 */
public class DongSPServiceImpl implements DongSPService{
    private final IDongSP iDongSP;
    public DongSPServiceImpl(){
        iDongSP = new DongSPRepository();
    }

    @Override
    public List<DongSP> getDongSP() {
        return iDongSP.getAll();
    }

    @Override
    public String delete(String ma) {
        return iDongSP.Delete(ma);
    }

    @Override
    public void update(DongSP dongSP) {
        iDongSP.update(dongSP);
    }

    @Override
    public void add(DongSP dongSP) {
        iDongSP.add(dongSP);
    }
    
}
