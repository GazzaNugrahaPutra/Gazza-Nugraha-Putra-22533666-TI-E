package pbo;

public class TestPolymorphism {

    public static void main(String[] args) {
        ObjekGeometri persegi = new Kotak(4);
        persegi.setColor("Blue");
        persegi.displayBangun();
        
        ObjekGeometri bentuk = new ObjekGeometri();
        bentuk.setColor("Black");
        bentuk.displayBangun();
        
        ObjekGeometri Balok = new Lingkaran(0);
        Balok.setColor("Green");
        Balok.displayBangun();
        
        ObjekGeometri segitiga = new Segitiga(3);
        segitiga.setColor("Grey");
        segitiga.displayBangun();
        
        ObjekGeometri trapesium = new Trapesium(4);
        trapesium.setColor("purple");
        trapesium.displayBangun();
        

        
        
}

}