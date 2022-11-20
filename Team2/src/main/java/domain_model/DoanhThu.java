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
@Table(name = "DoanhThu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoanhThu implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id")
    private String id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "doanhThu")
    private BigDecimal doanhThu;

    @ManyToOne
    @JoinColumn(name = "idCH", nullable = false)
    private CuaHang cuaHang;

    public DoanhThu(String ma, BigDecimal doanhThu, CuaHang cuaHang) {
        this.ma = ma;
        this.doanhThu = doanhThu;
        this.cuaHang = cuaHang;
    }

    public DoanhThu(String id) {
        this.id = id;
    }

}
