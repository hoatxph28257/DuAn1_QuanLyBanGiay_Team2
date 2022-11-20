/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "HDCT")
@IdClass(HDCT_ID.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HDCT implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "idHD", nullable = false)
    private HoaDon idHD;

    @Id
    @ManyToOne
    @JoinColumn(name = "idSPCT", nullable = false)
    private SPCT idSPCT;

    @Column(name = "soLuong")
    private int sLg;

    @Column(name = "donGia")
    private BigDecimal donGia;
}
