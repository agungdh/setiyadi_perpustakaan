/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetiyadiPerpustakaan;

/**
 *
 * @author user
 */
public class Staf extends Pegawai {
    @Override
    public void getDetail() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("Gaji Bersih: " + this.getSalary());
    }
}
