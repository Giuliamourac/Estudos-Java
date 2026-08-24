package aula2408;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("ADS", "Análise e Desenvolvimento de Sistemas", Periodo.NOITE);
        Curso curso2 = new Curso("SI", "Sistemas de Informação", Periodo.MANHA);

        Aluno aluno1 = new Aluno("123456", "Ana Silva", curso1);
        Aluno aluno2 = new Aluno("654321", "Carlos Oliveira", curso2);

        System.out.println("=== TESTE DE CURSOS ===");
        curso1.exibirInfo();
        curso2.exibirInfo();

        System.out.println("\n=== TESTE DE ALUNOS ===");
        aluno1.exibirInfo();
        aluno2.exibirInfo();
    }
}