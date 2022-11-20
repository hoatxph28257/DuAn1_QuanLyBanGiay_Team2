/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

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
import Enum.TrangThaiNV;
import javax.persistence.Temporal;

/**
 *
 * @author tungs
 */
@Entity
@Table(name = "NhanVien")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ho")
    private String ho;

    @Column(name = "tenDem")
    private String tenDem;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gioiTinh")
    private String gioiTinh;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "ngaySinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngaySinh;

    @Column(name = "trangThai")
    @Enumerated(EnumType.ORDINAL)
    private TrangThaiNV trangThai;

    @ManyToOne
    @JoinColumn(name = "idCV")
    private ChucVu chucVu;

    @ManyToOne
    @JoinColumn(name = "idCH")
    private CuaHang cuaHang;

    public NhanVien(String ma, String ho, String tenDem, String ten, String gioiTinh, String diaChi, Date ngaySinh, TrangThaiNV trangThai, ChucVu chucVu, CuaHang cuaHang) {
        this.ma = ma;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
        this.cuaHang = cuaHang;
    }

    public NhanVien(String id) {
        this.id = id;
    }

}
