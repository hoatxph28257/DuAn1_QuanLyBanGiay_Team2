/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import domain_model.CuaHang;

/**
 *
 * @author Admin
 */
public interface CuaHangService {
    List<CuaHang> getCuaHang();
    
    String delete(String ma);
    
    void update(CuaHang ch);
    
    void add(CuaHang ch);
    
    List<String>listcbbch();
}
