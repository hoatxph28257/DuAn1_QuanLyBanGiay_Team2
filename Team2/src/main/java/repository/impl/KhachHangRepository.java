/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import domain_model.KhachHang;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.IRepository;
import util.HibernateUtil;

/**
 *
 * @author tungs
 */
public class KhachHangRepository implements IRepository<KhachHang> {

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> lst = new ArrayList<KhachHang>();
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "from KhachHang";
            TypedQuery<KhachHang> query = s.createQuery(hql, KhachHang.class);
            lst = query.getResultList();
        }
        return lst;
    }

    @Override
    public KhachHang getOne(String ma) {
        KhachHang khachHang = null;
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            String hql = "from KhachHang where ma = :ma";
            TypedQuery<KhachHang> query = s.createQuery(hql, KhachHang.class);
            query.setParameter("ma", ma);
            khachHang = query.getSingleResult();
        }
        return khachHang;
    }

    @Override
    public boolean addOrSave(KhachHang x) {
        boolean check = false;
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            Transaction tran = s.beginTransaction();
            try {
                s.saveOrUpdate(x);
                tran.commit();
                check = true;
            } catch (Exception e) {
                e.printStackTrace();
                tran.rollback();
            }
        }
        return check;
    }

    @Override
    public boolean delete(KhachHang x) {
        boolean check = false;
        Transaction tran = null;
        try ( Session s = HibernateUtil.getFACTORY().openSession()) {
            tran = s.beginTransaction();
            s.delete(x);
            tran.commit();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
            tran.rollback();
        }
        return check;
    }
}
