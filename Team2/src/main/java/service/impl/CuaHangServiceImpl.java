/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import domain_model.CuaHang;
import repository.ICuaHangRepository;
import repository.impl.CuaHangRepository;
import service.CuaHangService;

/**
 *
 * @author Admin
 */
public class CuaHangServiceImpl implements CuaHangService {

    private final ICuaHangRepository iCuaHangRepository;

    public CuaHangServiceImpl() {
        iCuaHangRepository = new CuaHangRepository();
    }

    @Override
    public List<CuaHang> getCuaHang() {
        return iCuaHangRepository.getAll();
    }

    @Override
    public String delete(String ma) {
        return iCuaHangRepository.delete(ma);
    }

    @Override
    public void update(CuaHang ch) {
        iCuaHangRepository.update(ch);
    }

    @Override
    public void add(CuaHang ch) {
        iCuaHangRepository.add(ch);
    }

    @Override
    public List<String> listcbbch() {
        return iCuaHangRepository.listcbbch();
    }

}
