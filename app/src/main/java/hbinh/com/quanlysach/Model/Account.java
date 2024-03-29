package hbinh.com.quanlysach.Model;

public class Account {
    String username;
    String password;
    String sodienthoai;
    String email;

    public Account(String username, String password, String sodienthoai, String email) {
        this.username = username;
        this.password = password;
        this.sodienthoai = sodienthoai;
        this.email = email;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {
    }

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

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
