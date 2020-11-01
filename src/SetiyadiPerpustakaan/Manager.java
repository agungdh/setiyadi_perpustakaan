/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetiyadiPerpustakaan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Manager extends Pegawai {
    private String departemen;
    private List<Staf> staf = new ArrayList<Staf> ();
    
    public String getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public void addStaff(Staf staf) {
        this.staf.add(staf);
    }
    
    @Override
    public void getDetail() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("Departemen: " + this.getDepartemen());
        System.out.println("Gaji Bersih: " + this.getSalary());
        System.out.println("===== LIST STAF =====");
        for (Staf stafList : this.staf) {
            System.out.println(stafList.getNama());
        }
        System.out.println("===== END LIST STAF =====");
    }
}
