/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TIEN THANH
 */
public class BanHD {
    public BanHD()
    {
        
    }
    public String idsp;

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public int getSlBan() {
        return slBan;
    }

    public void setSlBan(int slBan) {
        this.slBan = slBan;
    }
    public int slBan;
    public BanHD(String idsp, int slBan)
    {
        this.idsp=idsp;
        this.slBan=slBan;
    }
}
