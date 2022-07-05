package com.example.jokenpo;

import org.junit.jupiter.api.Test;

public class JokenpoTest {

    @Test
    public void pedra_vs_papel() {
        Jokenpo jokenpo = new Jokenpo();
        
        jokenpo.jogar("pedra", "papel");
    }

    @Test
    public void papel_vs_pedra() {
        Jokenpo jokenpo = new Jokenpo();
        
        jokenpo.jogar("papel", "pedra");
    }

    @Test
    public void empate() {
        Jokenpo jokenpo = new Jokenpo();
        
        jokenpo.jogar("pedra", "pedra");
    }

}