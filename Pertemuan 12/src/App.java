public class App {
    public static void main(String[] args) throws Exception {
        // bikin objek negara
        Negara ina = new Negara();
        ina.setNamaNegara("Indonesia");
        ina.setNamaIbuKota("DKI Jakarta");
        // ina.info();

        // Negara mly = new Negara("Malaysia", "Kuala Lumpur", 243, "1.8 juta");
        // buat constructor baru (overloading)
        // mly.info(); -> modifikasi method info
        // "Malaysia punya ibukota Kuala Lumpur dengan luas 243 km kubik dan populasi 1.8 juta"

        Negara my = new Negara("Malaysia", "Kuala Lumpur", 243, 1.8);
        my.info();
    }
}
