package aula2408;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        do {
            System.out.println("============================");
            System.out.println("           Fatec            ");
            System.out.println("============================");
            System.out.println("1- Adicionar novo aluno");
            System.out.println("2- Adicionar novo curso");
            System.out.println("3- Consultar alunos");
            System.out.println("4- Consultar cursos");
            System.out.println("5- Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    if (cursos.isEmpty()) {
                        System.out.println("\nCadastre pelo menos um curso antes de cadastrar alunos.\n");
                        break;
                    }

                    System.out.println("\n--- CADASTRAR ALUNO ---");
                    System.out.print("Digite o RA: ");
                    String ra = sc.nextLine();

                    System.out.print("Digite o Nome do Aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Selecione o curso:");
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println((i + 1) + " - " + cursos.get(i).getNome());
                    }

                    System.out.print("Opção do curso: ");
                    int opCurso = sc.nextInt();
                    sc.nextLine();

                    if (opCurso > 0 && opCurso <= cursos.size()) {
                        Curso cursoSelecionado = cursos.get(opCurso - 1);
                        Aluno novoAluno = new Aluno(ra, nomeAluno, cursoSelecionado);
                        alunos.add(novoAluno);
                        System.out.println("-> Aluno cadastrado com sucesso!\n");
                    } else {
                        System.out.println("Opção de curso inválida! Aluno não cadastrado.\n");
                    }
                    break;

                case 2:
                    System.out.println("\n--- CADASTRAR CURSO ---");
                    System.out.print("Digite o nome do curso: ");
                    String nomeCurso = sc.nextLine();

                    System.out.print("Digite a sigla do curso: ");
                    String siglaCurso = sc.nextLine();

                    Periodo[] periodos = Periodo.values();

                    System.out.println("Opções de período: ");
                    for (int i = 0; i < periodos.length; i++) {
                        System.out.println((i + 1) + " - " + periodos[i]);
                    }

                    System.out.print("Selecione o período: ");
                    int opPeriodo = sc.nextInt();
                    sc.nextLine();

                    if (opPeriodo > 0 && opPeriodo <= periodos.length) {
                        Periodo periodoSelecionado = periodos[opPeriodo - 1];
                        Curso novoCurso = new Curso(siglaCurso, nomeCurso, periodoSelecionado);
                        cursos.add(novoCurso);
                        System.out.println("-> Curso cadastrado com sucesso!\n");
                    } else {
                        System.out.println("Opção de período inválida! Curso não cadastrado.\n");
                    }
                    break;

                case 3:
                    System.out.println("\n--- ALUNOS CADASTRADOS ---");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            alunos.get(i).exibirInfo();
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\n--- CURSOS CADASTRADOS ---");
                    if (cursos.isEmpty()) {
                        System.out.println("Nenhum curso cadastrado.");
                    } else {
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            cursos.get(i).exibirInfo();
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Saindo do programa... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        } while (op != 5);

        sc.close();
    }
}
