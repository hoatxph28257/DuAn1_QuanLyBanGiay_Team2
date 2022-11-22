/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domain_model.KhachHang;
import java.util.List;
import repository.impl.KhachHangRepository;
import service.IService;

/**
 *
 * @author tungs
 */
public class KhachHangService implements IService<KhachHang> {

    private KhachHangRepository repo;

    public KhachHangService() {
        repo = new KhachHangRepository();
    }

    @Override
    public List<KhachHang> getLists() {
        return repo.getAll();
    }

    @Override
    public KhachHang getOne(String ma) {
        return repo.getOne(ma);
    }

    @Override
    public String addOrSave(KhachHang x) {
        if (!repo.addOrSave(x)) {
            return "thất bại";
        }
        return "thành công";
    }

    @Override
    public String delete(KhachHang x) {
        if (!repo.delete(x)) {
            return "thất bại";
        }
        return "thành công";
    }

}
