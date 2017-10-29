package com.resultado.teste.com.resultado.teste.main;

import com.resultado.teste.com.resultado.teste.utils.ResultadoTesteUtil;

public class ResultadoTesteMain {

    public int exercicio1Exemplo1(){
        int[] exemplo1 = {2, 3, 3, 1, 5, 2};
        return ResultadoTesteUtil.findFirstRepeated(exemplo1);
    }

    public int exercicio1Exemplo2(){
        int[] exemplo1 = {2, 4, 3, 5, 1};
        return ResultadoTesteUtil.findFirstRepeated(exemplo1);
    }

    public String exercicio2() {
        return ResultadoTesteUtil.printStairs(3);
    }

    public String exercicio5() {

        return ResultadoTesteUtil.getStringIncidence("Programa Programa", "ama");
    }
}
