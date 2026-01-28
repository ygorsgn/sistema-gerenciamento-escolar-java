/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */
public class LiderSala extends Aluno {
    private String tarefa;
    
    public LiderSala(String nome, int idade, double cpf, int matricula, String tarefa){
        super(nome, idade, cpf, matricula);
        this.tarefa = tarefa;
    }
    
    public String getTarefa(){
        return tarefa;
    }
    
    public void setTarefa(String tarefa){
        this.tarefa = tarefa;
    }
    
     @Override
     public void apresentar() {
        System.out.println("O(a)Lider de sala " + getNome() + " tem a tarefa de " + tarefa + ".");
 }
    
}
