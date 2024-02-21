package org.acme.example.resource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Entity
@Table(name = "tb_usuario")
@NamedQuery(name = "TbUsuario.findByUsername", query = "SELECT u FROM TbUsuario u WHERE u.usuario = ?1")
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TbUsuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "email")
    private String email;

    @Column(name = "lotacao")
    private String lotacao;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "nome")
    private String nome;

    @Column(name = "perfil")
    private String perfil;

    @Column(name = "primeiro_acesso")
    private Boolean primeiroAcesso;

    @Column(name = "senha")
    private String senha;

    @Column(name = "usuario")
    private String usuario;

    // Construtores...

    public TbUsuario() {
    }

    public TbUsuario(Long idUsuario, Boolean ativo, String cargo, String email, String lotacao, String matricula,
            String nome, String perfil, Boolean primeiroAcesso, String senha, String usuario) {
        this.idUsuario = idUsuario;
        this.ativo = ativo;
        this.cargo = cargo;
        this.email = email;
        this.lotacao = lotacao;
        this.matricula = matricula;
        this.nome = nome;
        this.perfil = perfil;
        this.primeiroAcesso = primeiroAcesso;
        this.senha = senha;
        this.usuario = usuario;
    }


    // Getters e Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Boolean getPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(Boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
