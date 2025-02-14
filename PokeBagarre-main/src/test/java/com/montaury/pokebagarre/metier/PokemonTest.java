package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
   @Test
   void pokemon1_wins_because_best_attaque(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu",null,new Stats(11,12));
        Pokemon pokemon2 = new Pokemon("Pik",null,new Stats(10,12));

        //When
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //Then
        assertThat(resultat).isTrue();
    }
}