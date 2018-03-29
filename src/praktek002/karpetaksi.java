package praktek002;

public class karpetaksi {
    public static void main(String[] args) {
        
        karpet r1 = new karpet();
        r1.panjang = 30;
        r1.lebar = 200;
    
        
        r1.cetakInfo();
        System.out.println("Luas karpet = "+r1.hitungLuas());
    }
 
}
