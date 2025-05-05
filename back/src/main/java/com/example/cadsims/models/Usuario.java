package com.example.cadsims.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Email é obrigatorio")
    @Email(message = "Deve ser um email valido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatoria")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracters.")
    private String senha;

    @Column(nullable = false)
    @NotBlank(message = "telefone é obrigatorio")
    // @Size(min = 11, message = "O telefone deve ter no minimo 11 caracters.")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "CPF é obrigatorio")
    // @Size(min = 11, message = "O CPF deve ter no minimo 11 caracters.")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "CEP é obrigatorio")
    // @Size(min = 11, message = "O CEP deve ter no minimo 8 caracters.")
    private String cep;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, String telefone, String cpf, String cep) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email é obrigatorio") @Email(message = "Deve ser um email valido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatorio") @Email(message = "Deve ser um email valido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracters.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracters.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "telefone é obrigatorio") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "telefone é obrigatorio") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "CPF é obrigatorio") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF é obrigatorio") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "CEP é obrigatorio") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "CEP é obrigatorio") String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}