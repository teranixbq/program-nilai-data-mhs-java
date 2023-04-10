/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassemester2;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



/**
 *
 * @author TeranixBQ
 */
public class ClassMhs {
    public double nuts,nuas,ntugas,nkehadiran,ttl;
    String grade;
    
    public double getnuts(){
        return nuts;
    }
    
    public void setnuts(double nuts){
        this.nuts = nuts;
    }
    
    public double getnuas(){
    return nuas;
    }
    
    public void setuas(double nuas){
        this.nuas = nuas;
    }
    
    public double getntugas(){
        return ntugas;
    }
    
    public void settugas(double ntugas){
        this.ntugas = ntugas;
    }    

    public double getnkehadiran(){
        return nkehadiran;
    }
    
    public void setnkehadiran(double nkehadiran){
        this.nkehadiran = nkehadiran;
    }    
    
    
    public double getNilaiAkhir2(){
        ttl = (nuts*0.25)+(nuas*0.3)+(ntugas*0.25)+(((nkehadiran/16)*0.2)*100);
        return (ttl);
    }
    

    public void getNilaiGrade(){
        if (ttl >= 80 && ttl <=100) {
            grade = "A";
            }
            else if (ttl >= 68 && ttl <= 79){
                grade = "B";
             }
            else if (ttl >= 56 && ttl <= 67){
                grade = "C";
            }
             else if (ttl >= 45 && ttl <= 55){
                grade = "D";
            }
            else {
                grade = "E";
            }
        }
    
    public void setGrd (String val){
        grade = val;
    }
    
    public String getGrd(){
        return grade;
    }
    public void angka(KeyEvent a) {
    if (Character.isAlphabetic(a.getKeyChar())) {
        a.consume();
        JOptionPane.showMessageDialog(null, "Masukan Hanya Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }
}
