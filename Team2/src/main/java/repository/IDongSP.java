/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domain_model.DongSP;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDongSP {
    List<DongSP> getAll();

    String Delete(String ma);

    DongSP update(DongSP dongSP);

    void add(DongSP dongSP);
}
