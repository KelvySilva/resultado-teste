package com.resultado.teste;

import com.resultado.teste.com.resultado.teste.utils.ResultadoTesteUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainApplicationTest {


    @Test
    public void temQueExibir2() {
        int expected = 2;
        int[] array = {2, 3, 0, 1, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void temQueRetornarMenosUm() {
        int expected = -1;
        int[] array = {2, 4, 3, 5, 1};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void temQueExibir3() {
        int expected = 3;
        int[] array = {2, 3, 3, 1, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void temQueExibir5() {
        int expected = 5;
        int[] array = {2, 3, 0, 1, 5, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void temQueExibir1() {
        int expected = 1;
        int[] array = {2, 3, 8, 1, 1, 5, 5, 2};
        int result = ResultadoTesteUtil.findFirstRepeated(array);
        Assert.assertEquals(expected, result);
    }
}