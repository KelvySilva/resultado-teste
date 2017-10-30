package com.resultado.teste.com.resultado.teste.com.resultado.teste.model;

public class Notes {

    public static final int NOTE_2 = 2;
    public static final int NOTE_5 = 5;
    public static final int NOTE_10 = 10;
    public static final int NOTE_20 = 20;
    public static final int NOTE_50 = 50;
    public static final int NOTE_100 = 100;

    private String stringValue;
    private int anIntValue;

    public Notes(String stringValue, int anIntValue) {
        this.stringValue = stringValue;
        this.anIntValue = anIntValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getAnIntValue() {
        return anIntValue;
    }

    public void setAnIntValue(int anIntValue) {
        this.anIntValue = anIntValue;
    }

    public  static Notes newInstance(String stringValue, int anIntValue){
        return new Notes(stringValue, anIntValue);
    }
}
