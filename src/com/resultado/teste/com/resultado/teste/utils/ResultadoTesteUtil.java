package com.resultado.teste.com.resultado.teste.utils;

import com.resultado.teste.com.resultado.teste.com.resultado.teste.model.Notes;
import com.resultado.teste.com.resultado.teste.com.resultado.teste.model.PathWeith;
import com.resultado.teste.com.resultado.teste.com.resultado.teste.model.Point;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ResultadoTesteUtil {

    private static List<PathWeith> list;
    private static PathWeith[] weiths;

    public static int findFirstRepeated(int... array) {
        list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] == array[j]) {
                    list.add(new PathWeith(Point.newInstance(array[i], i), Point.newInstance(array[j], j)));
                }
            }

        }
        if (list.size() > 0) return sort(list).yPoint.getValue();
        else return -1;
    }

    private static PathWeith[] toArray(List<PathWeith> list) {
        weiths = new PathWeith[list.size()];
        int count = 0;
        for (PathWeith p : list) {
            weiths[count] = p;
            count++;
        }

        return weiths;
    }

    private static PathWeith sort(List<PathWeith> list) {
        PathWeith[] array = toArray(list);
        PathWeith menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDistance() == menor.getDistance()) {
                menor = menor;
            } else if (array[i].getDistance() < menor.getDistance()) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static String printStairs(int number) {
        if (number < 2) {
            number = 2;
        }

        String str = "";
        for (int i = 0; i <= number; i++) {
            System.out.println(String.format("%" + number * 3 + "s", str));
            str += " # ";


        }
        return str;
    }

    public static String getStringIncidence(String string, String sub) {
        int count = 0;
        String lowSub = sub.toLowerCase();
        if (lowSub.length() > 1) {
            String[] spliStrings = string.toLowerCase().split(" ");
            for (int i = 0; i < spliStrings.length; i++) {
                if (spliStrings[i].contains(lowSub)) {
                    count++;
                }
            }
        } else {
            String spliStrings = string.toLowerCase().trim();
            char[] array = spliStrings.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (lowSub.charAt(0) == array[i]) {
                    count++;
                }
            }
        }
        return "Ocorrencia:" + " \"" + sub + "\" " + "Resultado: " + count;
    }


    public static LinkedList<Integer> removeFromLinkedList(Integer value, LinkedList<Integer> list) {
        if (list.contains(value)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(value)) {
                    list.remove(i);
                }
            }
        }
        return list;
    }

    private static int isBigger(int value) {

        if (value > Notes.NOTE_100) return 100;
        if (value > Notes.NOTE_50) return 50;
        if (value > Notes.NOTE_20) return 20;
        if (value > Notes.NOTE_10) return 10;
        if (value > Notes.NOTE_5) return 5;
        if (value > Notes.NOTE_2) return 2;
        return 0;
    }

    private static int subtract(int value, int subtractor){
        return value-subtractor;
    }

    public static int getChange(int value) {

        switch (isBigger(value)) {
            case Notes.NOTE_100:
                System.out.println(Notes.NOTE_100);
                return getChange(subtract(value, Notes.NOTE_100 ));
            case Notes.NOTE_50:
                System.out.println(Notes.NOTE_50);
                return getChange(subtract(value, Notes.NOTE_50 ));
            case Notes.NOTE_20:
                System.out.println(Notes.NOTE_20);
                return getChange(subtract(value, Notes.NOTE_20 ));
            case Notes.NOTE_10:
                System.out.println(Notes.NOTE_10);
                return getChange(subtract(value, Notes.NOTE_10 ));
            case Notes.NOTE_5:
                System.out.println(Notes.NOTE_5);
                return getChange(subtract(value, Notes.NOTE_5 ));
            case Notes.NOTE_2:
                System.out.println(Notes.NOTE_2);
                return getChange(subtract(value, Notes.NOTE_2 ));
            case 0:
                System.out.println(value);
                return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ResultadoTesteUtil.getChange(1077));
    }
}