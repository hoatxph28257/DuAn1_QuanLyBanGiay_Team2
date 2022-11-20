/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author tungs
 */
@Entity
@Table(name = "BaoHanh")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaoHanh implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ngayBatDau")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date batDau;

    @Column(name = "ngayKetThuc")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ketThuc;

    @ManyToOne
    @JoinColumn(name = "idKH")
    private KhachHang kh;

    @ManyToOne
    @JoinColumn(name = "idHD")
    private HoaDon hd;

    public BaoHanh(String ma, Date batDau, Date ketThuc, KhachHang kh, HoaDon hd) {
        this.ma = ma;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.kh = kh;
        this.hd = hd;
    }

}
