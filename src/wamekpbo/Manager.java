/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamekpbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Manager extends Pegawai {
    String departemen;
    List<Staf> staf = new ArrayList<Staf> ();
    
    String getDepartemen() {
        return this.departemen;
    }
    
    void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    void addStaff(Staf staf) {
        this.staf.add(staf);
    }
    
    @Override
    void getDetail() {
        System.out.println("Detil");
    }
}
