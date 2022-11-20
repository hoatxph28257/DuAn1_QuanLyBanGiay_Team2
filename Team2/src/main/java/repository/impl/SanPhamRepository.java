/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import domain_model.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.ISanPham;
import util.HibernateUtil;
import view_model.QLSP;

/**
 *
 * @author 84961
 */
public class SanPhamRepository implements ISanPham{

    private List<QLSP> listQLSP = new ArrayList<>();
    
    @Override
    public List<QLSP> getAllSP() {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query qr = session.createQuery("select sp from SanPham sp");
            List<SanPham> list = qr.getResultList();
            for (SanPham x : list) {
                QLSP ql = new QLSP(x.getId(), x.getMa(), x.getTen());
                listQLSP.add(ql);
            }
            return listQLSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }


    @Override
    public Boolean save(SanPham sp) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.save(sp);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public Boolean update(SanPham sp) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.update(sp);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public Boolean delete(UUID id) {
         Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            SanPham sp = session.find(SanPham.class, id);
            session.delete(sp);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public SanPham findById(UUID id) {
//        try (Session ses = HibernateUtil.getFACTORY().openSession()) {
//            SanPham sp = ses.get(SanPham.class, id);
//            return sp;
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
        return null;
    }

    @Override
    public List<SanPham> findByName(String name) {
        try (Session sess = HibernateUtil.getFACTORY().openSession()) {
            Query query = sess.createQuery("SELECT sp From SanPham sp WHERE sp.tenSP=:tenSP");
            query.setParameter("tenSP", name);
            List<SanPham> lists = query.getResultList();
            return lists;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
    
}
