
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 */


public class ResultadoFinal {
    public static final double MEDIA_MINIMA_APROVACAO = 5.0; 
    
    private Aluno aluno;
    private double mediaFinal;
    private String status;
    
    public ResultadoFinal(Aluno aluno, double mediaFinal) {
        this.aluno = aluno;
        this.mediaFinal = mediaFinal;
        this.status = "Pendente"; 
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void calcularEExibirResultado() {
        if (mediaFinal >= MEDIA_MINIMA_APROVACAO) { 
            this.status = "Aprovado(a)";
        } else {
            this.status = "Reprovado(a)";
        }
        
        System.out.println("Resultado Final do Aluno: " + aluno.getNome());
        System.out.println("Média Final: " + mediaFinal);
        System.out.println("Status: " + status);
        System.out.println("Nota de corte utilizada: " + MEDIA_MINIMA_APROVACAO);
    }
}
