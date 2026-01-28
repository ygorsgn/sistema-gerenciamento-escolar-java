/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */
public class Livro {
    
    private String nomeLivro;
    private Biblioteca biblioteca;
    

    public Livro(String nomeLivro, Biblioteca biblioteca) {
        this.nomeLivro = nomeLivro;
        this.biblioteca = biblioteca; 
    }
    
    public String getNomeLivro() {
        return nomeLivro;
    }
    
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    
    public void mostrarDetalhes() {
        System.out.println("O livro '" + getNomeLivro() + " pertence à biblioteca " + biblioteca.getNomeBiblioteca() + "'.");
    }
}