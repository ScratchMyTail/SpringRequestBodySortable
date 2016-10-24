package com.example;

/**
 * Created by christerhansen on 24.10.2016.
 */
public class Person {
    String fornavn;
    String etternavn;
    int sortering;

    public Person() {
    }

    public Person(String fornavn, String etternavn, int sortering) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.sortering = sortering;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getSortering() {
        return sortering;
    }

    public void setSortering(int sortering) {
        this.sortering = sortering;
    }
}
