package com.maxbotero;

public class Concatena {
    public static void main(String[] args) {
        String[] textos = {"hoy ", "sera ", "un ", "buen ", "dia"};
        String frase = "";

        for(String texto : textos){
            frase = frase.concat(texto).concat("");
        }

        System.out.println(frase);

    }
}
