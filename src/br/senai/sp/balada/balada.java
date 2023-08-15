package br.senai.sp.balada;

import java.util.Scanner;

public class balada {

    public static void main(String[] args) {

        /** definindo variaveis*/

        String nome, nomeAcompanhante;
        int cpf, cpfAcompanhante;
        int idade, idadeAcompanhate = 0;
        boolean continuar = true;
        /** coleta dados do usuacrio*/

        Scanner tecaldo = new Scanner(System.in);

        while (continuar) {

            System.out.println("qual seu Nome:");
            nome = tecaldo.next();
            System.out.println("Digite seu CPF:");
            cpf = tecaldo.nextInt();
            System.out.println("digite sua Idade");
            idade = tecaldo.nextInt();

            /** printa dados do usuario*/

            System.out.println("--------------------------");
            System.out.println("ola" + " " + nome);
            System.out.println("CPF digitado:" + "" + cpf);
            System.out.println("sua idade" + "" + idade);

            System.out.println("--------------------------");

            /** condiçoeso */

            boolean teste = (idade % 2 == 0);

            if (idade >= 18 && idade % 2 == 0) {
                System.out.println("entrada liberada");
            } else if (idade >= 18 && idade % 2 == 1) {

                System.out.println("qual nome da acompanhante?:");
                nomeAcompanhante = tecaldo.next();
                System.out.println("Digite o CPF da acompanhante:");
                cpfAcompanhante = tecaldo.nextInt();
                System.out.println("digite a Idade do acompanhante:");
                idadeAcompanhate = tecaldo.nextInt();
            } else {
                System.out.println("o tema da festa e pares, pela sua idade voce esta sozinho!");
            }

            if ((idade + idadeAcompanhate) % 2 == 0 && idadeAcompanhate >= 18) {
                System.out.println("CURTA");
            } else {
                System.out.println("vao embora");

            }

        }

        /** condiçoeso */

        System.out.println("-------------------------------");

        System.out.println("deseja continuar: [1-sim / 2-nao]");
        int numero = tecaldo.nextInt();


        if (numero == 2) {
            continuar = false;
        }
    }

    }
    }




