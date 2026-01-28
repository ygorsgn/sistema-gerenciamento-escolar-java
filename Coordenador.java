/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */
public class Coordenador extends Professor {
    private String responsabilidade;
    
    public Coordenador(String nome, int idade, double cpf, String graduacao, String responsabilidade){
        super(nome,idade,cpf,graduacao);
        this.responsabilidade = responsabilidade;
    }
    
    public String getResponsabilidade(){
        return responsabilidade;
    }
    
    public void setResponsabilidade(String responsabilidade){
        this.responsabilidade = responsabilidade;
    }
     @Override
     public void apresentar() {
        System.out.println("O(a) coordenador(a) " + getNome() + " tem a responsabilidade " + responsabilidade + ".");
 }
}
