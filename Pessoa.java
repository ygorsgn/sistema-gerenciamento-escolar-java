/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 * 
 */

  
public abstract class Pessoa {
    private String nome;
    private int idade;
    private double cpf;
    
    public Pessoa(String nome, int idade, double cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getCpf(){
        return cpf;
    }
    
    public void setCpf( double cpf){
        this.cpf = cpf;
    }

    public abstract void apresentar();
}