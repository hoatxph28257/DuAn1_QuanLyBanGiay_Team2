/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "SPCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SPCT implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "idSP", nullable = false)
    private SanPham sp;

    @ManyToOne
    @JoinColumn(name = "idMS", nullable = false)
    private MauSac ms;

    @ManyToOne
    @JoinColumn(name = "idNSX", nullable = false)
    private NSX nsx;

    @ManyToOne
    @JoinColumn(name = "idDongSP", nullable = false)
    private DongSP dongSP;

    @Column(name = "namBH")
    private int namBH;

    @Column(name = "soLuongCon")
    private int sLgCon;

    @Column(name = "giaNhap")
    private BigDecimal giaNhap;

    @Column(name = "giaBan")
    private BigDecimal giaBan;

    @Column(name = "moTa")
    private String moTa;

    public SPCT(SanPham sp, MauSac ms, NSX nsx, DongSP dongSP, int namBH, int sLgCon, BigDecimal giaNhap, BigDecimal giaBan, String moTa) {
        this.sp = sp;
        this.ms = ms;
        this.nsx = nsx;
        this.dongSP = dongSP;
        this.namBH = namBH;
        this.sLgCon = sLgCon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
    }

    public SPCT(String id) {
        this.id = id;
    }

}
