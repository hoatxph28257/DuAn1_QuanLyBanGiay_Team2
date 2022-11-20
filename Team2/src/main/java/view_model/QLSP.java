/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_model;

import java.util.UUID;

/**
 *
 * @author 84961
 */
public class QLSP {
    private UUID id;
    private String ma;
    private String ten;

    public QLSP() {
    }

    public QLSP(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public QLSP(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaSP() {
        return ma;
    }

    public void setMaSP(String maSP) {
        this.ma = maSP;
    }

    public String getTenSP() {
        return ten;
    }

    public void setTenSP(String tenSP) {
        this.ten = tenSP;
    }
}
