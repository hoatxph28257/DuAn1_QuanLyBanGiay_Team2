/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domain_model.DongSP;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface DongSPService {
    public List<DongSP> getDongSP();
    
    String delete(String ma);
    
    void update(DongSP dongSP);
    
    void add(DongSP dongSP);
}
