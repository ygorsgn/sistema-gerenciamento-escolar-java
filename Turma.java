package com.mycompany.escolaapp;

public class Turma {
    
    private String nomeTurma;
    private Professor professorRegente; 
    private LiderSala representanteDeTurma; 
    

    public Turma(String nomeTurma, Professor professorRegente, LiderSala representanteDeTurma) {
        this.nomeTurma = nomeTurma;
        this.professorRegente = professorRegente;
        this.representanteDeTurma = representanteDeTurma; 
    }
    
    // Getters e Setters permanecem inalterados
    public String getNomeTurma() {
        return nomeTurma;
    }
    
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    
    public Professor getProfessorRegente() {
        return professorRegente;
    }
    
    public void setProfessorRegente(Professor professorRegente) {
        this.professorRegente = professorRegente;
    }
    
    public LiderSala getRepresentanteDeTurma() { 
        return representanteDeTurma;
    }
    
    public void setRepresentanteDeTurma(LiderSala representanteDeTurma) { 
        this.representanteDeTurma = representanteDeTurma;
    }
    

}