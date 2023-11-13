public class Pengguna {
    private String username;
    private String password;

    public void simpanData(String username, String password) {
        // Isi kode penyimpanan di sini
        this.username = username;
        this.password = password;
    }

    // Getter dan setter jika diperlukan
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
