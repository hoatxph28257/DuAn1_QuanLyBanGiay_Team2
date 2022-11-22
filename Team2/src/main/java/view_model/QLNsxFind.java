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
public class QLNsxFind {
    UUID id;
    String ma;
    String ten;

    public QLNsxFind() {
    }

    public QLNsxFind(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public QLNsxFind(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "QLNsx{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
}
