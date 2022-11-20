/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import Enum.TrangThaiBH;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author tungs
 */
@Entity
@Table(name = "BHCT")
@IdClass(BHCT_ID.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BHCT implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "idBH", nullable = false)
    private HoaDon idBH;

    @Id
    @ManyToOne
    @JoinColumn(name = "idSPCT", nullable = false)
    private SPCT idSPCT;

    @Column(name = "moTa")
    private String moTa;

    @Column(name = "tinhTrang")
    private TrangThaiBH tinhTrang;

    @Column(name = "ngayMuaSP")
    private Date ngayMua;

    @Column(name = "chiPhi")
    private BigDecimal chiPhi;

}
