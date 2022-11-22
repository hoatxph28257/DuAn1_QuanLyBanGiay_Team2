/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import domain_model.DongSP;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import repository.IDongSP;
import util.HibernateUtil;

/**
 *
 * @author Admin
 */
public class DongSPRepository implements IDongSP {

    @Override
    public List<DongSP> getAll() {
        List<DongSP> dSP;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            String hql = "SELECT p FROM DongSP p";
            TypedQuery<DongSP> query = session.createQuery(hql, DongSP.class);
            dSP = query.getResultList();
        }
        return dSP;
    }

    @Override
    public String Delete(String ma) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE DongSP p WHERE p.ma = :ma";
                Query query = session.createQuery(hql);
                query.setParameter("ma", ma);
                int result = query.executeUpdate();
                if (result == 0) {
                    ma = "";
                }
                trans.commit();
            } catch (Exception e) {
                ma = "";
            }
        }
        return ma;
    }

    @Override
    public DongSP update(DongSP dongSP) {
        Transaction trns = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        try {
            trns = session.beginTransaction();
            session.update(dongSP);
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return dongSP;
    }

    @Override
    public void add(DongSP dongSP) {
        Transaction trans = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        try{
            trans = session.beginTransaction();
            session.save(dongSP);
        }catch(RuntimeException e){
            if(trans != null){
                trans.rollback();
            }
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
    }

}
