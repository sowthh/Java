/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        AnaliseNumeros analise = new AnaliseNumeros();
        analise.solicitarNumeros();
        analise.calcularSoma();
        analise.encontrarMaiorMenor();
        analise.exibirResultados();
    }
}