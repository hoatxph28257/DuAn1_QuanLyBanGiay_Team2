/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import domain_model.CuaHang;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import repository.ICuaHangRepository;
import util.HibernateUtil;


/**
 *
 * @author Admin
 */
public class CuaHangRepository implements ICuaHangRepository {

    @Override
    public List<CuaHang> getAll() {
        List<CuaHang> chs;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            String hql = "SELECT p FROM CuaHang p";
            TypedQuery<CuaHang> query = session.createQuery(hql, CuaHang.class);
            chs = query.getResultList();
        }
        return chs;
    }

    @Override
    public String delete(String ma) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE CuaHang p WHERE p.ma = :ma";
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
    public CuaHang update(CuaHang ch) {
        Transaction trns = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        try {
            trns = session.beginTransaction();
            session.update(ch);
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return ch;
    }

    @Override
    public void add(CuaHang ch) {
        Transaction trans = null;
        Session session = HibernateUtil.getFACTORY().openSession();
        try {
            trans = session.beginTransaction();
            session.save(ch);
        } catch (RuntimeException e) {
            if (trans != null) {
                trans.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public List<String> listcbbch() {
        ArrayList<String>list = new ArrayList<>();
        try(Session s =HibernateUtil.getFACTORY().openSession()){
            String sql = "select CuaHang.ten from CuaHang CuaHang";
            TypedQuery<String>query = s.createQuery(sql,String.class);
            list = (ArrayList<String>) query.getResultList();
        }
        return list;
    }

}
