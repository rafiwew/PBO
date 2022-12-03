public abstract class Mobil {
    public abstract void jalan();
    public abstract void info();
    public void info(String type, String merk, String warna) {
        System.out.println("type2 = "+ type);
        System.out.println("merk = "+ merk);
        System.out.println("warna = "+ warna);
    }
}
