/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixoperations;
//importei a biblioteca scanner
import java.util.Scanner;


/**
 * classe principal que contém operações com matrizes
 */
public class MatrixOperations {
    
    /**
     * PROBLEMA 1: Matriz 4x4 - Calcula soma e média dos números pares
     * Solicita ao usuário preencher uma matriz 4x4 e então:
     * - Calcula a soma de todos os números pares
     * - Calcula a média dos números pares
     */
    public static void problema1() {
        Scanner sc = new Scanner(System.in);
        // declara matriz 4x4 de inteiros
        int[][] matriz = new int[4][4];
        
        System.out.println("=== PROBLEMA 1 ===");
        System.out.println("Digite os valores da matriz 4x4:");
        
        // loop para preencher a matriz com valores digitados pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // variáveis que irão armazenar os valores atribuidos para a soma e a contagem de números pares
        int somaPares = 0;
        int countPares = 0;
        
        // loop para identificar e somar números pares
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // verifica se o número é par (resto da divisão por 2 deve ser obrigatoriamente 0 (zero))
                if (matriz[i][j] % 2 == 0) {
                    somaPares += matriz[i][j];
                    countPares++;
                }
            }
        }
        
        // exibe os resultados
        System.out.println("\nMatriz digitada:");
        imprimirMatriz(matriz);
        System.out.println("\nSoma dos numeros pares: " + somaPares);
        
        // calcula a média apenas se tiver números pares
        if (countPares > 0) {
            double media = (double) somaPares / countPares;
            System.out.println("Media dos numeros pares: " + media);
        } else {
            System.out.println("Nao ha numeros pares na matriz");
        }
    }
    
    /**
     * PROBLEMA 2: Criar e exibir três matrizes com padrões específicos
     * Matriz a: Cada linha tem o mesmo valor (linha 0 = zeros, linha 1 = uns, etc)
     * Matriz b: Cada coluna tem valores crescentes (0, 1, 2, 3)
     * Matriz c: Padrão diagonal crescente
     */
    public static void problema2() {
        System.out.println("\n=== PROBLEMA 2 ===");
        
        // Matriz a - 5x5
        int[][] matrizA = {
            {0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4}
        };
        
        System.out.println("Matriz a):");
        imprimirMatriz(matrizA);
        
        // Matriz b - 4x4
        int[][] matrizB = {
            {0, 1, 2, 3},
            {0, 1, 2, 3},
            {0, 1, 2, 3},
            {0, 1, 2, 3}
        };
        
        System.out.println("\nMatriz b):");
        imprimirMatriz(matrizB);
        
        // Matriz c - 4x4
        int[][] matrizC = {
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 2, 0},
            {0, 1, 2, 3}
        };
        
        System.out.println("\nMatriz c):");
        imprimirMatriz(matrizC);
    }
    
    /**
     * PROBLEMA 3: Matriz 5x5 com cálculo de somas
     * Calcula:
     * a) Soma dos números ímpares
     * b) Soma de cada coluna
     * c) Soma de cada linha
     */
    public static void problema3() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("\n=== PROBLEMA 3 ===");
        System.out.println("Digite os valores da matriz 5x5:");
        
        // preenche matriz 5x5 com entrada de dados do usuário
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz digitada:");
        imprimirMatriz(matriz);
        
        // a) Calcula soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // número ímpar: resto da divisão por 2 é obrigatoriamente diferente de 0(zero)
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("\na) Soma dos números ímpares: " + somaImpares);
        
        // b) Calcula a soma de cada coluna 
        System.out.println("\nb) Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("   Coluna " + j + ": " + somaColuna);
        }
        
        // c) Calcula a soma de cada linha 
        System.out.println("\nc) Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("   Linha " + i + ": " + somaLinha);
        }
    }
    
    /**
     * PROBLEMA 4: Matriz 3x5 com análise de elementos
     * Verifica:
     * a) Se existem elementos repetidos
     * b) Quantidade de números pares
     * c) Quantidade de números ímpares
     */
    public static void problema4() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        
        System.out.println("\n=== PROBLEMA 4 ===");
        System.out.println("Digite os valores da matriz 3x5:");
        
        // preenche a matriz 3x5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz digitada:");
        imprimirMatriz(matriz);
        
        // a) Verifica se há elementos repetidos
        // compara cada elemento com todos os outros
        boolean temRepetidos = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                // loop aninhado para comparar com todos os outros elementos
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 5; l++) {
                        // verifica se não é a mesma posição e se os valores são iguais
                        if ((i != k || j != l) && matriz[i][j] == matriz[k][l]) {
                            temRepetidos = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("\na) A matriz possui elementos repetidos? " + 
                         (temRepetidos ? "SIM" : "NÃO"));
        
        // b) Conta quantidade de números pares
        int countPares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    countPares++;
                }
            }
        }
        System.out.println("\nb) Quantidade de números pares: " + countPares);
        
        // c) Conta quantidade de números ímpares
        int countImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    countImpares++;
                }
            }
        }
        System.out.println("\nc) Quantidade de números ímpares: " + countImpares);
    }
    
    /**
     * PROBLEMA 5: Matriz 4x4 com números decimais
     * Exibe:
     * a) Valores da diagonal principal
     * b) Valores da diagonal secundária
     */
    public static void problema5() {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        
        System.out.println("\n=== PROBLEMA 5 ===");
        System.out.println("Digite os valores da matriz 4x4 (decimais):");
        
        // preenche matriz com números decimais
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("\nMatriz digitada:");
        imprimirMatrizDouble(matriz);
        
        // a) Diagonal principal: onde i == j (0,0), (1,1), (2,2), (3,3)
        System.out.println("\na) Valores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("   [" + i + "][" + i + "] = " + matriz[i][i]);
        }
        
        // b) Diagonal secundária: onde i + j = n-1, ou seja j = n-1-i
        // Posições: (0,3), (1,2), (2,1), (3,0)
        System.out.println("\nb) Valores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println("   [" + i + "][" + (3-i) + "] = " + matriz[i][3-i]);
        }
    }
    
    // Problema 6: Comentário indicando que é similar ao problema 2
    
    /**
     * Método auxiliar para imprimir matriz de inteiros
     * Formata com 4 espaços para cada número
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // %4d = formata como inteiro com 4 caracteres de largura
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * método auxiliar para imprimir matriz de doubles
     * formata com 7 espaços e 2 casas decimais
     */
    public static void imprimirMatrizDouble(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // %7.2f = formata como float com 7 caracteres e 2 decimais
                System.out.printf("%7.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * método principal - Exibe menu e executa problemas selecionados
     * usa estrutura de repetição com menu até usuário escolher sair
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        // loop do menu principal
        do {
            // Exibe menu de opções
            System.out.println("  MATRIZES - Escolha um dos exercicios para ser executado:");
            System.out.println("1 - Exercicio 1 (Matriz 4x4 - pares)");
            System.out.println("2 - Exercicio 2 (Criar matrizes a, b, c)");
            System.out.println("3 - Exercicio 3 (Matriz 5x5 - somas)");
            System.out.println("4 - Exercicio 4 (Matriz 3x5 - analise)");
            System.out.println("5 - Exercicio 5 (Matriz 4x4 - diagonais)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            
            // switch para executar o exercício escolhido
            switch(opcao) {
                case 1:
                    problema1();
                    break;
                case 2:
                    problema2();
                    break;
                case 3:
                    problema3();
                    break;
                case 4:
                    problema4();
                    break;
                case 5:
                    problema5();
                    break;
                case 0:
                    System.out.println("\nEncerrando programa...");
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
            }
        } while(opcao != 0); // continua até usuário digitar 0
        
        // fecha o Scanner para liberar recursos
        sc.close();
    }
}