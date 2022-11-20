/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domain_model.SanPham;
import java.util.List;
import java.util.UUID;
import view_model.QLSP;

/**
 *
 * @author 84961
 */
public interface SanPhamService {
    
    List<QLSP> getAllSP();

    String save(QLSP x);

    String update(QLSP x);

    SanPham findById(UUID id);

    String delete(UUID id);

    List<SanPham> findByName(String name);
}
