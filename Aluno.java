/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */
public class Aluno extends Pessoa{
    private int matricula;
    
    public Aluno(String nome, int idade, double cpf, int matricula){
        super(nome,idade,cpf);
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    @Override
     public void apresentar() {
        System.out.println("Aluno(a) " + getNome() + " tem a matricula " + getMatricula() + ".");
 }

}
