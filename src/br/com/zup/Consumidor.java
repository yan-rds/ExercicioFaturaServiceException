package br.com.zup;

public class Consumidor {
    private String email;

    public Consumidor(String email) {
        this.email = email;
    }

    public Consumidor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
