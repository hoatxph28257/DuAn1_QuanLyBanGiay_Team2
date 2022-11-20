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
    public static void main(String[] args) {
////        NSX nsx=new NSX();
        System.out.println(new NsxRepositoryImpl().getAllNsx());
    }

    @Override
    public Boolean save(NSX nsx) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(NSX nsx) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NSX findById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
