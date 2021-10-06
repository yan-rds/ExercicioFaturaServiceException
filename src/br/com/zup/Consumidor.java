package br.com.zup;

public class Consumidor {
    private String email;

    public Consumidor(String email) {
        this.email = email;
    }

    public Consumidor() {
    }

    @Override
    public String toString() {
        return "\tEmail: " + email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
