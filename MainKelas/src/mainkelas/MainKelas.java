/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkelas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author arrai
 */
public class MainKelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isTambah = true;
        boolean isKurang = true;
        Scanner input = new Scanner(System.in);
        Map<String, Kelas> daftarKelas = new LinkedHashMap<String, Kelas>();
        Map<String, Pengajar> daftarPengajar = new LinkedHashMap<String, Pengajar>();
        Map<String, Mahasiswa> daftarMahasiswa = new LinkedHashMap<String, Mahasiswa>();

        while (isTambah) {

            Kelas kelas = new Kelas();
            Pengajar pengajar = new Pengajar();
            
            System.out.println(" ***********************************************************");
            System.out.println(" Tambah Data Kelas ! ");
            System.out.print(" Nama Kelas : ");
            kelas.setNamaKelas(input.next());
            System.out.print(" ID Kelas : ");
            daftarKelas.put(input.next(), kelas);
            System.out.print(" Nama Pengajar : ");
            pengajar.setNamaPengajar(input.next());
            System.out.print(" ID Pengajar : ");
            daftarPengajar.put(input.next(), pengajar);
            do {
                Mahasiswa mahasiswa = new Mahasiswa();
                System.out.println("Input nama Mahasiswa : ");
                mahasiswa.setNamaMahasiswa(input.next());
                System.out.println("ID Mahasiswa : ");
                daftarMahasiswa.put(input.next(), mahasiswa);
                System.out.print(" Tambah data Mahasiswa ?(jawab dengan true/false : ");
                isTambah = input.nextBoolean();
            } while (isTambah);
            System.out.print(" Tambah data baru kembali ?(jawab dengan true/false : ");
            isTambah = input.nextBoolean();
            //return daftarBuku;
        }
        for (Map.Entry<String, Kelas> entry : daftarKelas.entrySet()) {
            System.out.println(entry.getKey());
            Kelas kelas = entry.getValue();
            System.out.println("  Nama Kelas : " + kelas.getNamaKelas());
        }
        for (Map.Entry<String, Pengajar> entryPengajar : daftarPengajar.entrySet()) {
            System.out.println(entryPengajar.getKey());
            Pengajar pengajar = entryPengajar.getValue();
            System.out.println("  Nama Pengajar : " + pengajar.getNamaPengajar());
        }
        for (Map.Entry<String, Mahasiswa> entryMahasiswa : daftarMahasiswa.entrySet()) {
            System.out.println(entryMahasiswa.getKey());
            Mahasiswa mahasiswa = entryMahasiswa.getValue();
            System.out.println("  Nama Mahasiswa : " + mahasiswa.getNamaMahasiswa());

        }
        System.out.println("____________________________________________________________________ ");

    }

}
