import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String hostname = "localhost";
        String port = "5432";
        String dbname = "db_toko";
        String username = "postgres";
        String password = "040703";

        // String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=040703";
        String url = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbname + "?user=" + username + "&password=" + password;

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Koneksi Berhasil");

            // Query DML
            String insert_data = "INSERT INTO tbl_barang(kode_barang, nama_barang) VALUES (7, 'Penghapus')";
            String update_data = "UPDATE tbl_barang SET nama_barang = 'Keyboard' WHERE kode_barang = 6";
            String show_data = "SELECT * FROM tbl_barang";

            Statement s = conn.createStatement(); // Create a new statement on the connection
            
            try {
                // INSERT, UPDATE, DELETE
                // s.execute(update_sql);

                // SELECT
                ResultSet result  = s.executeQuery(show_data);
                int i = 0;
                while(result.next()) {
                    System.out.println((i+1) + ". Nama Barang: " + result.getString("nama_barang"));
                    i++;
                }
                System.out.println("Jumlah data: " + String.valueOf(i));

                // Success message
                System.out.println("Query berhasil.");
            } catch (Exception e) {
                // Message failed
                System.out.println("Query gagal.");
                System.out.println(e.getMessage());
            }            

            conn.close();
        } catch (Exception e) {
            // Message failed
            System.out.println("Koneksi Gagal");
            System.out.println(e.getMessage());
        }
    }
}
