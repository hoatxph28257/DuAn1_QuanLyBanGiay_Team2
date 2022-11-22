/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.CuaHang;
import java.util.List;
import repository.impl.CuaHangRepository;
import repository.impl.KhachHangRepository;
import service.IService;

/**
 *
 * @author tungs
 */
public class CuaHangService implements IService<CuaHang> {

    private CuaHangRepository repo;

    public CuaHangService() {
        repo = new CuaHangRepository();
    }

    @Override
    public List<CuaHang> getLists() {
        return repo.getAll();
    }

    @Override
    public CuaHang getOne(String ma) {
        return repo.getOne(ma);
    }

    @Override
    public String addOrSave(CuaHang x) {
        if (!repo.addOrSave(x)) {
            return "thất bại";
        }
        return "thành công";
    }

    @Override
    public String delete(CuaHang x) {
        if (!repo.delete(x)) {
            return "thất bại";
        }
        return "thành công";
    }
}
