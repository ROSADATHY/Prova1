/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
/**
 *
 * @author Aluno
 */
public abstract class Fisica {
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero) {
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
   private int getIdade;{
    return Period.beetenw(dataNascimento,LocalDate.now)).getYers
}

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getGetIdade() {
        return getIdade;
    }

    public void setGetIdade(int getIdade) {
        this.getIdade = getIdade;
    }

    @Override
    public String toString() {
        return "Fisica{" + "dataNascimento=" + dataNascimento + ", genero=" + genero + ", getIdade=" + getIdade + '}';
    }
    
  
}
    

