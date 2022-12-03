import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek dari class Negara
        Negara ina = new Negara(); // tanpa constructor
        Ibukota jkt = new Ibukota();
        // Kota jkt = new Kota("Jakarta"); // dengan constructor
        Kota plb = new Kota();
        Kota jakpus = new Kota();
        Kota bdg = new Kota();

        // menggunakan method setter
        ina.setNamaNegara("Indonesia");
        jkt.setNamaIbukota("DKI Jakarta"); // set nama ibukota
        ina.setIbukota(jkt);
        plb.setNamaKota("Palembang");
        jakpus.setNamaKota("Jakarta Pusat");
        bdg.setNamaKota("Bandung");
        

        jkt.setNamaIbukota("Jakarta");
        // jkt.setNamaKota("Jakartaa");  // menimpa constructor

        // menggunakan method getter
        System.out.println("Negara: " + ina.getNamaNegara());
        System.out.println("Ibukota negara " + ina.getNamaNegara() + " adalah " + ina.getIbukota());
        System.out.println("Negara: " + ina.getNamaNegara() + " ");

        // System.out.println("Kota: " + jkt.getNamaKota());

        // membuat obyek ArrayList dengan tipe data Kota
        List<Kota> kotas = new ArrayList<>();
        // menambahkan data
        kotas.add(plb);
        kotas.add(jakpus);
        kotas.add(bdg);

        ina.setKota(kotas);
        System.out.println("Negara: " + ina.getNamaNegara() + " punya kota " + ina.getKota());

        // for(DataAsset obj : list){
        //     System.out.println(obj.getAssetcode()+" "+obj.getAssetname());
        // }
    }
}
