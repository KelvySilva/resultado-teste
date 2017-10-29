package com.resultado.teste;

import com.resultado.teste.com.resultado.teste.main.ResultadoTesteMain;

public class MainApplication {


    public static void main(String[] args) {
        ResultadoTesteMain resultado = new ResultadoTesteMain();
        System.out.println("Exercicio 1 Exemplo 1 = "+resultado.exercicio1Exemplo1());
        System.out.println("Exercicio 1 Exemplo 2 = "+resultado.exercicio1Exemplo2());
        System.out.println("Exercicio 2 = ");
        resultado.exercicio2();
        System.out.println("Exercicio 5 = "+resultado.exercicio5());
    }
}
