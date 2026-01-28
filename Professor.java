/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */
public class Professor extends Pessoa{
    private String graduacao;
    
    public Professor(String nome, int idade, double cpf, String graduacao){
        super(nome,idade,cpf);
        this.graduacao = graduacao;
    }
    
    public String getGraduacao(){
        return graduacao;
    }
    
    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }
    
    @Override
     public void apresentar() {
        System.out.println("Professor(a) " + getNome() + " é formado em " + graduacao + ".");
 }
}
