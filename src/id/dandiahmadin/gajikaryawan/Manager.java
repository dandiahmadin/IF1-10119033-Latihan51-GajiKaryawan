/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.gajikaryawan;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Manager yang merupakan subclass dari superclass Karyawan
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        return hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        switch(jabatan.toUpperCase()) {
            case "MANAGER": return 2000000;
            case "KABAG": return 1000000;
            default : return 0;
        }
    }
    
    public float tunjanganGolongan(int golongan){
        switch(golongan) {
            case 1 : return 500000;
            case 2 : return 1000000;
            case 3 : return 1500000;
            default : return 0;
        }
    }
    
    public float gajiTotal() {
        tunjanganKehadiran = tunjanganKehadiran(kehadiran);
        tunjanganGolongan = tunjanganGolongan(golongan);
        tunjanganJabatan = tunjanganJabatan(jabatan);
        
        return tunjanganKehadiran + tunjanganGolongan + tunjanganJabatan;
    }
}
