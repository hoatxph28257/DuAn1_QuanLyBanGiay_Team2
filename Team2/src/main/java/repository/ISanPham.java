/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domain_model.SanPham;
import java.util.List;
import java.util.UUID;
import view_model.QLSP;

/**
 *
 * @author 84961
 */
public interface ISanPham {
    List<QLSP> getAllSP();


    Boolean save(SanPham sp);

    Boolean update(SanPham sp);

    Boolean delete(UUID id);

    SanPham findById(UUID id);

    List<SanPham> findByName(String name);
}
