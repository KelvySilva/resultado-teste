package com.resultado.teste;

import com.resultado.teste.com.resultado.teste.utils.ResultadoTesteUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MainApplicationTest {


    @Test
    public void temQueExibir2() {
        int expected = 2;
        int[] array = {2, 3, 0, 1, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        assertEquals(expected, result);
    }

    @Test
    public void temQueRetornarMenosUm() {
        int expected = -1;
        int[] array = {2, 4, 3, 5, 1};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        assertEquals(expected, result);
    }

    @Test
    public void temQueExibir3() {
        int expected = 3;
        int[] array = {2, 3, 3, 1, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        assertEquals(expected, result);
    }

    @Test
    public void temQueExibir5() {
        int expected = 5;
        int[] array = {2, 3, 0, 1, 5, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        assertEquals(expected, result);
    }


    @Test
    public void temQueExibir1() {
        int expected = 1;
        int[] array = {2, 3, 8, 1, 1, 5, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        assertEquals(expected, result);
    }

    @Test
    public void encontra2IncidenciasDeAma(){

        String string = "Programa Programa";
        String sub = "ama";
        int res = 2;
        String expected = "Ocorrencia:"+" \""+sub+"\" Resultado: "+res;
        String result = ResultadoTesteUtil.getStringIncidence(string, sub);
        assertEquals(expected, result);
    }

    @Test
    public void encontra2IncidenciasDeAMA(){
        int res = 2;
        String string = "Programa Programa";
        String sub = "AMA";
        String expected = "Ocorrencia:"+" \""+sub+"\" Resultado: "+res;
        String result = ResultadoTesteUtil.getStringIncidence(string, sub);
        assertEquals(expected, result);
    }


    @Test
    public void encontra4IncidenciasDeA(){
        int res = 4;
        String string = "Programa Programa";
        String sub = "a";
        String expected = "Ocorrencia:"+" \""+sub+"\" Resultado: "+res;
        String result = ResultadoTesteUtil.getStringIncidence(string, sub);
        assertEquals(expected, result);
    }



    @Test
    public void encontra2IncidenciasDeP(){
        int res = 2;
        String string = "Programa Programa";
        String sub = "P";
        String expected = "Ocorrencia:"+" \""+sub+"\" Resultado: "+res;
        String result = ResultadoTesteUtil.getStringIncidence(string, sub);
        assertEquals(expected, result);
    }

    @Test
    public void encontra2IncidenciasMesmoComPMinusculo(){
        int res = 2;
        String string = "Programa Programa";
        String sub = "p";
        String expected = "Ocorrencia: \""+sub+"\""+" Resultado: "+res;
        String result = ResultadoTesteUtil.getStringIncidence(string, sub);
        assertEquals(expected, result);
    }

    @Test
    public void removeOValorDaLista(){
        List<Integer> arrayListIn = Arrays.asList(3, 8, 9, 2, 7, 1, 6);
        List<Integer> arrayListOut = Arrays.asList(3, 8, 9, 2, 7, 6);
        LinkedList<Integer> linkedListIn = new LinkedList<>();
        LinkedList<Integer> linkedListOut = new LinkedList<>();
        linkedListOut.addAll(arrayListOut);
        linkedListIn.addAll(arrayListIn);
        int value = 1;
        assertEquals(linkedListOut, ResultadoTesteUtil.removeFromLinkedList(value, linkedListIn));
    }

    @Test
    public void removeOValorDaListaSeHouver(){
        List<Integer> arrayListIn = Arrays.asList(3, 8, 9, 2, 7, 1, 6);
        List<Integer> arrayListOut = Arrays.asList(3, 8, 9, 2, 7, 1, 6);
        LinkedList<Integer> linkedListIn = new LinkedList<>();
        LinkedList<Integer> linkedListOut = new LinkedList<>();
        linkedListOut.addAll(arrayListOut);
        linkedListIn.addAll(arrayListIn);
        int value = 20;
        assertEquals(linkedListOut, ResultadoTesteUtil.removeFromLinkedList(value, linkedListIn));
    }


    @Test
    public void removeOValorDaListaSeHouverRepetido(){
        List<Integer> arrayListIn = Arrays.asList(3, 8, 9, 2, 7, 1, 6, 1);
        List<Integer> arrayListOut = Arrays.asList(3, 8, 9, 2, 7, 6);
        LinkedList<Integer> linkedListIn = new LinkedList<>();
        LinkedList<Integer> linkedListOut = new LinkedList<>();
        linkedListOut.addAll(arrayListOut);
        linkedListIn.addAll(arrayListIn);
        int value = 1;
        assertEquals(linkedListOut, ResultadoTesteUtil.removeFromLinkedList(value, linkedListIn));
    }

}