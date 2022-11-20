/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import Enum.TrangThaiHD;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author tungs
 */
@Entity
@Table(name = "HoaDon")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ngayTao")
    private Date ngayTao;

    @Column(name = "ngayThanhToan")
    private Date ngayThanhToan;

    @Column(name = "ngayMongMuonNhan")
    private Date ngayMongMuon;

    @Column(name = "ngayGui")
    private Date ngayGui;

    @Column(name = "ngayNhan")
    private Date ngayNhan;

    @Column(name = "tinhTrang")
    @Enumerated(EnumType.ORDINAL)
    private TrangThaiHD trangThai;

    @Column(name = "tenNguoiNhan")
    private String tenNguoiNhan;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @ManyToOne
    @JoinColumn(name = "idKH")
    private KhachHang kh;

    @ManyToOne
    @JoinColumn(name = "idNV")
    private NhanVien nv;

    @ManyToOne
    @JoinColumn(name = "idKM")
    private KhuyenMai km;

    public HoaDon(String ma, Date ngayTao, Date ngayThanhToan, Date ngayMongMuon, Date ngayGui, Date ngayNhan, TrangThaiHD trangThai, String tenNguoiNhan, String diaChi, String sdt, KhachHang kh, NhanVien nv, KhuyenMai km) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayMongMuon = ngayMongMuon;
        this.ngayGui = ngayGui;
        this.ngayNhan = ngayNhan;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.kh = kh;
        this.nv = nv;
        this.km = km;
    }

}
