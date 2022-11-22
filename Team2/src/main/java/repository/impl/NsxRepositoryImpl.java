/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import domain_model.NSX;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.INsx;
import util.HibernateUtil;
import view_model.QLNsx;

/**
 *
 * @author 84961
 */
public class NsxRepositoryImpl implements INsx{

    private List<QLNsx> listQlnsx = new ArrayList<>();
    
    @Override
    public List<QLNsx> getAllNsx() {
        try (Session session = HibernateUtil.getFACTORY().openSession();) {
            Query qr = session.createQuery("from NSX");
            
            List<NSX> lists = qr.getResultList();
            for (NSX x : lists) {
                QLNsx ql = new QLNsx(x.getId(), x.getMa(), x.getTen());
                listQlnsx.add(ql);
            }
            return listQlnsx;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
//    public static void main(String[] args) {
//////        NSX nsx=new NSX();
//        System.out.println(new NsxRepositoryImpl().getAllNsx().toString());
//    }

    @Override
    public Boolean save(NSX nsx) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.save(nsx);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
//     public static void main(String[] args) {
//        
//        String ma = "NN23";
//        String ten = "Nikaeea";
//        NSX nsx=new NSX(ma,ten);
//         System.out.println(new NsxRepositoryImpl().save(nsx));
//        System.out.println(new NsxRepositoryImpl().getAllNsx().toString());
//    }
    

    @Override
    public Boolean update(NSX nsx) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.update(nsx);
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
            NSX nsx = session.get(NSX.class, id);
            session.delete(nsx);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public NSX findByID(UUID id) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            NSX nsx = session.get(NSX.class, id);
            return nsx;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
        
    }
    
}
