/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import Enum.TrangThaiCL;
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
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author tungs
 */
@Entity
@Table(name = "CaLam")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaLam implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "thoiGianBatDau")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thoiGianBatDau;

    @Column(name = "thoiGianKetThuc")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date thoiGianKetThuc;

    @ManyToOne
    @JoinColumn(name = "idNV")
    private NhanVien nhanVien;

    @Column(name = "trangThai")
    @Enumerated(EnumType.ORDINAL)
    private TrangThaiCL trangThai;

    public CaLam(String ma, Date thoiGianBatDau, Date thoiGianKetThuc, NhanVien nhanVien, TrangThaiCL trangThai) {
        this.ma = ma;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.nhanVien = nhanVien;
        this.trangThai = trangThai;
    }

}
