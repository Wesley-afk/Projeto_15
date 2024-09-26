/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15;

/**
 *
 * @author w.rocha
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Projeto_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[5];
        String[] nomeDoArquivo = new String[5];

        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = ler.nextInt();
        }
        ler.nextLine(); 

        System.out.println("Digite os nomes dos arquivos:");
        for (int i = 0; i < 5; i++) {
            nomeDoArquivo[i] = ler.nextLine();
        }

        for (int i = 0; i < 5; i++) {
        try (FileWriter arquivo = new FileWriter(nomeDoArquivo[i] + ".txt");
            PrintWriter gravar = new PrintWriter(arquivo)) {

            for (int j = 1; j <= 10; j++) {
            gravar.println(vetor[i] + " x " + j + " = " + (vetor[i] * j));
            }

        System.out.println("Arquivo " + nomeDoArquivo[i] + ".txt gerado com sucesso!");
        } catch (IOException e) {
          System.out.println("Erro ao criar o arquivo " + nomeDoArquivo[i] + ".txt: " + e.getMessage());
        }
        }

        ler.close();
    }
}
