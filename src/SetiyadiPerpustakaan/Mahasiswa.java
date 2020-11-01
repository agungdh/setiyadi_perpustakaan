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
class Mahasiswa {
  private String npm;
  private String nama;
  private String jurusan;
  
  public String getNama() {
      return this.nama;
  }
  
  public void setNama(String nama) {
      this.nama = nama;
  }
  
  public String getNPM() {
      return this.npm;
  }
  
  public void setNPM(String npm) {
      this.npm = npm;
  }
  
  public String getJurusan() {
      return this.jurusan;
  }
  
  public void setJurusan(String jurusan) {
      this.jurusan = jurusan;
  }
}
