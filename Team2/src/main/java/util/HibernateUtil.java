/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import domain_model.BHCT;
import domain_model.BaoHanh;
import domain_model.CaLam;
import domain_model.ChucVu;
import domain_model.CuaHang;
import domain_model.DoanhThu;
import domain_model.DongSP;
import domain_model.HDCT;
import domain_model.HoaDon;
import domain_model.KhachHang;
import domain_model.KhuyenMai;
import domain_model.MauSac;
import domain_model.NSX;
import domain_model.NhanVien;
import domain_model.SPCT;
import domain_model.SanPham;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author tungs
 */
public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;"
                + "databaseName=team2;encrypt=true;trustServerCertificate=true;");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "xuanhoa2002");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(DongSP.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(NSX.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(DoanhThu.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(CaLam.class);
        conf.addAnnotatedClass(KhuyenMai.class);
        conf.addAnnotatedClass(SPCT.class);
        conf.addAnnotatedClass(BHCT.class);
        conf.addAnnotatedClass(BaoHanh.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HDCT.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    public static void main(String[] args) {
        getFACTORY();
    }
}
