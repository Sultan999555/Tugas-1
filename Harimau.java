 

    public class Harimau {
    String bulu, mata, mulut, telinga, cakar, kaki;
        
    /*
    set = kata "SET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk memasukkan nilai kedalam method pada suatu class
    
    get = kata "GET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk mengambil nilai dari class
    */
    
    public void setBulu(String bulu) {
        this.bulu = bulu;
    }
 
    public void setMata(String mata) {
        this.mata = mata;
    }
 
    public void setMulut(String mulut) {
        this.mulut = mulut;
    }
 
    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }
 
    public void setCakar(String cakar) {
        this.cakar = cakar;
    }
 
    public void setKaki(String kaki) {
        this.kaki = kaki;
    }
 
    public String getBulu() {
        return bulu;
    }
 
    public String getMata() {
        return mata;
    }
 
    public String getMulut() {
        return mulut;
    }
 
    public String getTelinga() {
        return telinga;
    }
 
    public String getCakar() {
        return cakar;
    }
 
    public String getKaki() {
        return kaki;
    }
    
    void berburu( String m ){ //dgn parameter
        System.out.println("berburu mangsa"+ m);
    }
    
    void makan(){ //tanpa parameter
        System.out.println("makan mangsa");
    }
    
    void tidur(String tempat, String lokasi){ //2 paramater
         System.out.println("tidur di "+ tempat + " hutan "+ lokasi);
    }
    
    void berlari(){
        System.out.println("berlari mengejar mangsa");
    }
    
    void berkuasa(){  
        System.out.println("berkuasa terhadap wilayah");
    }
    
    void minum(){ 
        System.out.println("minum di sungai");
    }
 
}