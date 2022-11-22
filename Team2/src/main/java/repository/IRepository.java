/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author tungs
 */
public interface IRepository<X> {

    List<X> getAll();

    X getOne(String ma);

    boolean addOrSave(X x);

    boolean delete(X x);
}
