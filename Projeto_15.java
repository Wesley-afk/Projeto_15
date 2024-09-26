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

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);
        int vetor[]; vetor = new int[5];
        String []nome_do_arquivo; nome_do_arquivo = new String[5];
        
        System.out.println("Digite 5 valores.\n"); //pede para o usuário digitar 5 valores para a multiplicação
        for (int i = 0; i < 5; i++) {
            vetor[i] = ler.nextInt();
        }
        
        System.out.println("Digite o nome dos aqruivos. \n");
        for(int i = 0; i < 5; i++){
            nome_do_arquivo[i] = ler.nextLine();
        }
           
        for(int i = 0; i < 5; i++){
        FileWriter arquivo = new FileWriter("C:\\Users\\w.rocha\\Documents\\TxT" + nome_do_arquivo[i] + ".txt");
        PrintWriter gravar = new PrintWriter(nome_do_arquivo[i]);
        }
        
        for (int i = 0; i < 5; i++) {
         gravar.printf("Tabuada do " + vetor[i] + "\n"); //escrevo no arquivo a tabuada de tal numero.
         gravar.printf(vetor[i] + "x" + i + vetor[i] * i); //escrevo o numero vezes o indice até o 10 mostrando seu resultado.
        }
    }
} 
