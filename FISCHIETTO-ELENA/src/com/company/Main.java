package com.company;

public class Main {

    public static void main(String[] args) {

        Persona estudiante = new Persona("Juancito", "Pérez", "12345678", 21);

        Licenciatura titulo = new Licenciatura(estudiante, 15, "2015", "2020", true, true, "Tema Tesis", "2019", 20);
        Licenciatura titulo2 = new Licenciatura(estudiante, 10, "2015", "2020", true, false, "Tema Tesis", "2019", 15);

        Terciario terciario = new Terciario(estudiante, 13, "2012", "2015", false, true, "nacional");
        Terciario terciario2 = new Terciario(estudiante, 10, "2012", "2015", false, false, "provincial");

        System.out.println(titulo.puedeEjercer());
        System.out.println(titulo2.puedeEjercer());
        System.out.println(terciario.puedeEjercer());
        System.out.println(terciario2.puedeEjercer());

        System.out.println(titulo.compareTo(titulo2));
        System.out.println(titulo2.compareTo(titulo));

        System.out.println(terciario.tieneValidezNacional());
        System.out.println(terciario2.tieneValidezNacional());
    }
}
