public class Mobil {
    String merk;
    int tahun_pembuatan;

    public Mobil(String merk, int tahun_pembuatan){
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setTahunBuat(int tahun_pembuatan){
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahunBuat(){
        return tahun_pembuatan;
    }

    public void infoMobil(){
        System.out.println("Merek " + getMerk());
        System.out.println("Tahun " + getTahunBuat());
    }
}
