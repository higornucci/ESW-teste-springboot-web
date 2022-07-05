package com.example.romanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorRomanos {

    private Map<String, Integer> mapaRomanos = new HashMap<>();

    public ConversorRomanos() {
        mapaRomanos.put("I", 1);
        mapaRomanos.put("V", 5);
        mapaRomanos.put("X", 10);
        mapaRomanos.put("L", 50);
        mapaRomanos.put("C", 100);
        mapaRomanos.put("D", 500);
        mapaRomanos.put("M", 1000);
    }

    public int converter(String simbolo) {
        int somador = 0;
        Character atual;
        for(int i = 0; i < simbolo.length(); i++) {
            atual = simbolo.charAt(i);
            somador += mapaRomanos.get(atual.toString());
        }
        return somador;
    }

}
