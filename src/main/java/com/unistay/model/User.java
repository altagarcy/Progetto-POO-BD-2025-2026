package com.unistay.model;

public class User {

    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String telefono;

    public User(int id, String nome, String cognome, String email, String password, String telefono) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public User(String nome, String cognome, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", email='" + email + "', nome='" + getNomeCompleto() + "'}";
    }
}
