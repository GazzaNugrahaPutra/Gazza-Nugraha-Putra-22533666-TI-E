package pbo;

public class ObjekGeometri {
    private String color;
    public int jumlahSisi;

    public ObjekGeometri() {
        this.color = "red";
    }
    public ObjekGeometri(int jumlahSisi){
        
        this.jumlahSisi = jumlahSisi;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void displayBangun(){
        System.out.println("Warna Bangun ini adalah "+color);
        System.out.println("Jumlah Sisi Bangun ini adalah"+jumlahSisi);
    }
}