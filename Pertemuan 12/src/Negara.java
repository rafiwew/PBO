public class Negara {
    private String namaNegara;
    private Ibukota ibuKota;

    // constructor
    public Negara() {
        // TO-DO
    }

    // overload const (4 param)
    Negara(String namaNegara, String namaIbukota, double luas, double populasi) {
        this.namaNegara = namaNegara;
        Ibukota n = new Ibukota(namaIbukota);
        n.setLuas(luas);
        n.setPopulasi(1.78);
        this.ibuKota = n;
    }

    // set negara
    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    // set ibukota
    public void setNamaIbuKota(String namaIbuKota) {
        Ibukota jkt = new Ibukota(namaIbuKota); // composition => membuat objek jkt di dalam class negara
        this.ibuKota = jkt;
    }

    // get negara
    public String getNamaNegara() {
        return namaNegara;
    }

    // get ibukota
    public Ibukota getIbuKota() {
        return ibuKota;
    }

    // mencetak info negara
    public void info() {
        // System.out.println("Negara " + namaNegara + " ibukota nya " + ibuKota.getNamaIbukota());
        System.out.println("Negara " + namaNegara + " punya ibukota " + ibuKota.getNamaIbukota() + " dengan luas " + ibuKota.getLuas() + " km kubik dan populasi " + ibuKota.getPopulasi() + " juta");
    }
}
