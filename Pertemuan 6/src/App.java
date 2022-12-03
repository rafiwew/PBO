public class App {
    public static void main(String[] args){

        // InterMobil m1 = new InterMobil(); // tidak bisa instansiasi dari InterfaceMobil

        // Mobil m1 = new Mobil(); // tidak bisa instansiasi dari abstract mobil

        Hyundai m1 = new Hyundai();
        m1.jalan();
        m1.info("matic", "inova", "hitam");

        Toyota t1 = new Toyota();
        t1.jalan();
        t1.info("matic", "avanza", "merah");

        InterMobil.cetak();
    }
}