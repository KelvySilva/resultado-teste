package com.resultado.teste;

import com.resultado.teste.com.resultado.teste.main.ResultadoTesteMain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainApplication {


    public static void main(String[] args) {
        ResultadoTesteMain resultado = new ResultadoTesteMain();
        System.out.println("EXERCÍCIO 1 Exemplo 1 = "+resultado.exercicio1Exemplo1());
        System.out.println("EXERCÍCIO 1 Exemplo 2 = "+resultado.exercicio1Exemplo2());
        System.out.println("EXERCÍCIO 2 = ");
        resultado.exercicio2();
        System.out.println("EXERCÍCIO 3 = ");
        resultado.exercicio3();
        System.out.println("EXERCÍCIO 5 = "+resultado.exercicio5());


    }
}
