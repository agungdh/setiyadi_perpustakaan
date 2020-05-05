/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamekpbo;

/**
 *
 * @author user
 */
public class Perusahaan {
    String namaPerusahaan;
    String alamat;
    
    String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }
    
    void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    
    String getAlamat() {
        return this.alamat;
    }
    
    void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
