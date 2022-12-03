public class Ibukota {
    private String namaIbukota;
    private double luas;
    private double populasi;

    Ibukota(String nama) {
        this.namaIbukota = nama;
    }

    // set ibukota
    public void setNamaIbukota(String namaIbukota) {
        this.namaIbukota = namaIbukota;
    }

    // set luas
    public void setLuas(double luas) {
        this.luas = luas;
    }

    // set populasi
    public void setPopulasi(double populasi) {
        this.populasi = populasi;
    }

    // get ibukota
    public String getNamaIbukota() {
        return namaIbukota;
    }

    // get luas
    public double getLuas() {
        return luas;
    }

    // get populasi
    public double getPopulasi() {
        return populasi;
    }
}
