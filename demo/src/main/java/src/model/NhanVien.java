/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.sql.Date;

/**
 *
 * @author local
 */
public class NhanVien extends ThanhVien{
    private String viTri;

    public NhanVien(String viTri, String username, String password, int id, HoTen hoTen, DiaChi diaChi, String email, String SDT, String vaitro, Date ngaySinh) {
        super(username, password, id, hoTen, diaChi, email, SDT, vaitro, ngaySinh);
        this.viTri = viTri;
    }

    public NhanVien(String viTri) {
        this.viTri = viTri;
    }
    
}
