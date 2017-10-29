package com.resultado.teste.com.resultado.teste.utils;

import com.resultado.teste.com.resultado.teste.com.resultado.teste.model.PathWeith;
import com.resultado.teste.com.resultado.teste.com.resultado.teste.model.Point;
import org.omg.PortableServer.POA;

import java.util.*;

public class ResultadoTesteUtil {

    private static List<PathWeith> list;
    private static PathWeith[] weiths;

    public static int findFirstRepeated(int... array) {
        list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] == array[j]) {
                    list.add(new PathWeith(Point.newInstance(array[i],i ), Point.newInstance(array[j], j)));
                }
            }

        }
        if (list.size() > 0) return sort(list).yPoint.getValue();
        else return -1;
    }

    private static PathWeith[] toArray(List<PathWeith> list){
        weiths = new PathWeith[list.size()];
        int count = 0;
        for (PathWeith p: list) {
            weiths[count] = p;
            count++;
        }

        return weiths;
    }

    private static PathWeith sort(List<PathWeith> list){
        PathWeith[] array = toArray(list);
        PathWeith menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDistance() == menor.getDistance() ){
                menor = menor;
            }else
            if (array[i].getDistance() < menor.getDistance() ){
                menor = array[i];
            }
        }
        return menor;
    }
}