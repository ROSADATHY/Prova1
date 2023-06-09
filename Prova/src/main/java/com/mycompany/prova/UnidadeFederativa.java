/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("bahia","Ba"),
    SAO_PAULO("sao_paulo","Sp"),
    RIO_DE_JANEIRO("rio_de_janeiro","Rj");
    
    private String texto;
    private String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
}
