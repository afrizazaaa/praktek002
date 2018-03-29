package praktek002;
public class karpet {
    double panjang;
    double lebar;

    public karpet() {
        panjang=20;
        lebar=150;
    }
    
    void cetakInfo() {
        System.out.println("=======================");
        System.out.println("Panjang :"+panjang);
        System.out.println("Lebar   :"+lebar);
        System.out.println("=======================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah: "+hitungLuas());
    }
}
