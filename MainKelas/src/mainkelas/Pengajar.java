/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkelas;

import java.util.Map;

/**
 *
 * @author arrai
 */
public class Pengajar {

    private String namaPengajar, idPengajar;
    Map<String, Pengajar> daftarPengajar;

    public Map<String, Pengajar> getDaftarPengajar() {
        return daftarPengajar;
    }

    public void setDaftarPengajar(Map<String, Pengajar> daftarPengajar) {
        this.daftarPengajar = daftarPengajar;
    }

    public String getNamaPengajar() {
        return namaPengajar;
    }

    public void setNamaPengajar(String namaPengajar) {
        this.namaPengajar = namaPengajar;
    }

    public String getIdPengajar() {
        return idPengajar;
    }

    public void setIdPengajar(String idPengajar) {
        this.idPengajar = idPengajar;
    }

}
