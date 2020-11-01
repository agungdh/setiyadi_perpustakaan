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
public class Gaji {
    private double gajiPokok;
    private double uangLembur;
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void setUangLembur(double uangLembur) {
       this.uangLembur = uangLembur;
    }
   
    public double getGajiBersih() {
       return this.gajiPokok + this.uangLembur;
    }
}
