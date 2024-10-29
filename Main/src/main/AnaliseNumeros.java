/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
 
public class AnaliseNumeros {
    private int[] numeros = new int[10];
    private int soma;
    private int maior;
    private int menor;
 
    public void solicitarNumeros() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
    }
 
    public void calcularSoma() {
        soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
    }
 
    public void encontrarMaiorMenor() {
        maior = numeros[0];
        menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
    }
 
    public void exibirResultados() {
        System.out.println("Soma: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        for (int numero : numeros) {
            if (numero == maior) {
                System.out.println(numero + " (Maior)");
            } else if (numero == menor) {
                System.out.println(numero + " (Menor)");
            } else {
                System.out.println(numero);
            }
        }
    }
}
