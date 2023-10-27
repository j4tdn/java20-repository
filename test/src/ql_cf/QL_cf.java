package ql_cf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.Level;

class QLNV{
    NVDet N[]= new NVDet[20];
  
      
    public int ReadDet(String fileName){
        int n = 0;
        String str = "";
        try{
            FileReader fptr = new FileReader(fileName);
            BufferedReader Buff = new BufferedReader(fptr);
            while((str = Buff.readLine()) != null){
            String manv = str;
            String tennv = Buff.readLine();    
            String gt= Buff.readLine();
            String SDT = Buff.readLine();
            int sogio = Integer.parseInt(Buff.readLine());
            double phucap = Double.parseDouble(Buff.readLine());
            NVDet d = new NVDet(manv,tennv, SDT, SDT, sogio, phucap);
            N[n] = d;
            n = n + 1;
            
            
        }
            
        }catch(FileNotFoundException e){System.out.print(e.getMessage());} catch (IOException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public void InDet(int n){
        for(int i = 0; i < n ; i++)
            N[i].In();
        System.out.printf("\n");
    }
}
    /**
     */
    public class QL_cf {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        QLNV Q= new QLNV();
        int n;
        n = Q.ReadDet("NVDet.txt");Q.InDet(n);
    }
    
}
