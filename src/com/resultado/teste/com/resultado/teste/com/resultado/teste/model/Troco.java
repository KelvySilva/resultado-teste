package com.resultado.teste.com.resultado.teste.com.resultado.teste.model;

public class Troco {

    private Notes notes;

    public Troco(Notes notes) {
        this.notes = notes;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public  static Troco newInstance(Notes notes){
        return new Troco(notes);
    }
}
