/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laptrinhjava_doan;

/**
 *
 * @author TIEN THANH
 */
public class LAPTRINHJAVA_DOAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MyConnection().getConnection();
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        dn.setLocationRelativeTo(null);
    }
    
}
