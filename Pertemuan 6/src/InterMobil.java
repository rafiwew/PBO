public interface InterMobil {
    public abstract void jalan();
    public void info();
    public void info(String type, String merk, String warna);
    public static void cetak() {
        System.out.println("Ini method static");
    }
}