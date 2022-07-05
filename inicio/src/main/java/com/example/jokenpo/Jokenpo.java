package com.example.jokenpo;

public class Jokenpo {
    public void jogar(String jogador1, String jogador2) {
        if(
              ( jogador1 == "tesoura" && jogador2 == "papel") ||
              ( jogador1 == "papel" && jogador2 == "pedra" ) ||
              ( jogador1 == "pedra" && jogador2 == "tesoura")
      ){//jogador1 ganhador
          System.out.println("Jogador 2 perdeu! :(");

      }else if(
              ( jogador2 == "tesoura" && jogador1 == "papel") ||
              ( jogador2 == "papel" && jogador1 == "pedra" ) ||
              ( jogador2== "pedra" && jogador1 == "tesoura")

      ){ //jogador2 ganhador
        System.out.println("Jogador 1 ganhou! :)");

      }else{
          //empate
          System.out.println("Empate!");


      }
    }
}
