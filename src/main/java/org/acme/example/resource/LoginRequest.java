package org.acme.example.resource;

public class LoginRequest {
    private String usuario; // Alteração do nome da variável
    private String senha;

    // Getters
    public String getUsername() {
        return usuario;
    }

    public String getPassword() {
        return senha;
    }

    // Setters (opcional, dependendo da necessidade do seu aplicativo)
    public void setUsername(String username) {
        this.usuario = username;
    }

    public void setPassword(String password) {
        this.senha = password;
    }
}
