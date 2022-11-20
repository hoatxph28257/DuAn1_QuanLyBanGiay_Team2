/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import domain_model.NSX;
import java.util.List;
import java.util.UUID;
import view_model.QLNsx;

/**
 *
 * @author 84961
 */
public interface INsx {
    List<QLNsx> getAllNsx();

    Boolean save(NSX nsx);

    Boolean update(NSX nsx);

    Boolean delete(UUID id);

    NSX findById(UUID id);
}
