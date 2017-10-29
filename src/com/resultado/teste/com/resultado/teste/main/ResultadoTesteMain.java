package com.resultado.teste.com.resultado.teste.main;

import com.resultado.teste.com.resultado.teste.utils.ResultadoTesteUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

    public void exercicio3() {
        List<Integer> arrayListIn = Arrays.asList(3, 8, 9, 2, 7, 1, 6, 1);
        List<Integer> arrayListOut = Arrays.asList(3, 8, 9, 2, 7, 6);
        LinkedList<Integer> linkedListIn = new LinkedList<>();
        LinkedList<Integer> linkedListOut = new LinkedList<>();
        linkedListOut.addAll(arrayListOut);
        linkedListIn.addAll(arrayListIn);
        int value = 1;
        System.out.println("LinkedList antes\n"+Arrays.toString(linkedListIn.toArray()));
        System.out.println("LinkedList depois\n"+Arrays.toString(ResultadoTesteUtil.removeFromLinkedList(value, linkedListIn).toArray()));

    }

    public String exercicio5() {

        return ResultadoTesteUtil.getStringIncidence("Programa Programa", "ama");
    }
}
