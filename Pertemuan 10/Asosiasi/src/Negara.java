import java.util.List;

public class Negara {
    String namaNegara;
    Ibukota ibukota;
    List<Kota> kota;

    // tanpa constructor

    // method setter
    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    public void setIbukota(Ibukota ibukota) {
        this.ibukota = ibukota;
    }

    public void setKota(List<Kota> kota) {
        this.kota = kota;
    }

    // method getter
    public String getNamaNegara() {
        return this.namaNegara;
    }

    public Ibukota getIbukota() {
        return ibukota;
    }

    public List<Kota> getKota() {
        return kota;
    }
}