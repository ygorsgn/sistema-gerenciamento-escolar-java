package com.mycompany.escolaapp;

/**
 *
 * @author ygorg
 * 
 */

public class EscolaApp {

    public static void main(String[] args) {
        System.out.println("🚀 Sistema de Gerenciamento Escolar Inicializado 🚀");
        System.out.println("---------------------------------------------------\n");

        LiderSala lider = new LiderSala("Mariana Costa", 16, 111.222333, 2024001, "organizar o material didático");
        Professor profRegente = new Professor("Dr. Ricardo Almeida", 55, 444.555666, "Doutorado em Computação");
        Coordenador coord = new Coordenador("Ana Paula Santos", 42, 777.888999, "Mestrado em Gestão Escolar", "Acompanhamento Pedagógico");
        
        System.out.println("--- 👥 Apresentação das Pessoas (Polimorfismo) ---");
        lider.apresentar(); 
        profRegente.apresentar();
        coord.apresentar(); 
        System.out.println("---------------------------------------------------\n");

        Turma turmaA = new Turma("3º Ano A - T.I.", profRegente, lider);
        
        System.out.println("--- Informações da Turma " + turmaA.getNomeTurma() + " ---");
        System.out.print("Professor Regente: ");
        turmaA.getProfessorRegente().apresentar(); 
        System.out.print("Representante de Turma: ");
        turmaA.getRepresentanteDeTurma().apresentar(); 
        System.out.println("---------------------------------");

        

        Biblioteca biblio = new Biblioteca("Biblioteca Central - Saber Mais");
        Livro livro1 = new Livro("A Lógica de Programação", biblio);
        
        System.out.println("--- 📚 Demonstração de Associação (Livro e Biblioteca) ---");
        livro1.mostrarDetalhes();
        System.out.println("---------------------------------------------------\n");
        

        Aluno alunoSimples = new Aluno("Roberto Silva", 17, 123.456789, 2024005);
        
        Nota nota1 = new Nota(4.5);
        Nota nota2 = new Nota(6.5);
        
        double media = (nota1.getValor() + nota2.getValor()) / 2.0;
        
        ResultadoFinal resultadoRoberto = new ResultadoFinal(alunoSimples, media);
        
        System.out.println("--- 📝 Cálculo e Exibição do Resultado Final ---");
        System.out.println("Notas obtidas: Nota 1 (" + nota1.getValor() + "), Nota 2 (" + nota2.getValor() + ")");
        resultadoRoberto.calcularEExibirResultado(); 
        System.out.println("---------------------------------------------------\n");
    }
}