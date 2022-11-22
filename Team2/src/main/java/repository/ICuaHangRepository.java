/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import domain_model.CuaHang;

/**
 *
 * @author Admin
 */
public interface ICuaHangRepository {
    List<CuaHang> getAll();
    
    String delete(String ma);
    
    CuaHang update(CuaHang ch);
    
    void add(CuaHang ch);
    
    List<String>listcbbch();
}
