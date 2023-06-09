/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected String nome;
    protected String numero;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String nome, String numero, String email, Endereco endereco) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString()+
                 "\n nome=" + nome + 
                "\n numero=" + numero +
                "\n email=" + email + 
                "\n endereco=" + endereco ;
    }

   
 
    
    
}
