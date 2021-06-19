package br.com.confidencecambio.javabasico.entity;

import org.apache.logging.log4j.util.Strings;


/*
    Create by @Eleison Jr
 */
public class Cliente {
    private String  nome;

    public Cliente(String nome) throws RuntimeException{
        if(Strings.isBlank(nome))
            throw new RuntimeException("Ojeto não pode ser criado com nome vazio ou nulo");
        else
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
