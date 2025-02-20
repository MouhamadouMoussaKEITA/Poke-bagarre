package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static com.montaury.pokebagarre.fixtures.ConstructeurDePokemon.unPokemon;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void pokemon1_wins_because_best_attaque() {
        //given
        //Pokemon pokemon1 = new Pokemon("Pikachu", null, new Stats(11, 12));
        //Pokemon pokemon2 = new Pokemon("Pik", null, new Stats(10, 12));
        Pokemon pokemon1 = unPokemon().avecAttaque(11).construire();
        Pokemon pokemon2 = unPokemon().avecAttaque(10).construire();

        //When
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //Then
        assertThat(resultat).isTrue();
    }


    /*  Listes des tests:
     *  1- Pokemon1 gagne par attaque le pokemon2
     *  2- Pokemon1 gagne par défense le pokemon2
     *  3- Pokemon 2 gagne par attaque le pokemon1
     *  4- Pokemon 2 gagne par défense le pokemon1
     *  5- Pokemon 1 gagne quand attaque et défense sont égale que pokemon2
     * */


    @Test
    void pokemon1_devrait_gagner_avec_defense_superieur() {
       // Pokemon pokemon1 = new Pokemon("Pikachu", null, new Stats(11, 13));
      //  Pokemon pokemon2 = new Pokemon("Pik", null, new Stats(11, 12));

       Pokemon pokemon1 = unPokemon().avecAttaque(11).avecDefense(13).construire();
       Pokemon pokemon2 = unPokemon().avecAttaque(11).avecDefense(12).construire();

        //When
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //Then
        assertThat(resultat).isTrue();
    }


    @Test
    void pokemon2_devrait_gagner_avec_attaque_superieur() {
        //GIVEN
        //Pokemon pokemon1 = new Pokemon("ex1", null, new Stats(15, 10));
        //Pokemon pokemon2 = new Pokemon("ex2", null, new Stats(10, 15));

        Pokemon pokemon1 = unPokemon().avecAttaque(15).avecDefense(10).construire();
        Pokemon pokemon2 = unPokemon().avecAttaque(10).avecDefense(15).construire();

        //When
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //Then
        assertThat(resultat).isTrue();
    }


    @Test
    void pokemon2_devrait_gagner_avec_defense_superieur() {

        //Pokemon pokemon1 = new Pokemon("ex1", null, new Stats(15, 10));
       // Pokemon pokemon2 = new Pokemon("ex2", null, new Stats(15, 15));

        Pokemon pokemon1 = unPokemon().avecAttaque(15).avecDefense(10).construire();
        Pokemon pokemon2 = unPokemon().avecAttaque(15).avecDefense(15).construire();


        //When
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);

        //Then
        assertThat(resultat).isTrue();
    }

    @Test
    void pokemon1_devrait_gagner_avec_defense_et_attaque_egal() {
        //GIVEN
       // Pokemon pokemon1 = new Pokemon("ex1", null, new Stats(15, 15));
        //Pokemon pokemon2 = new Pokemon("ex2", null, new Stats(15, 15));
        Pokemon pokemon1 = unPokemon().avecAttaque(15).avecDefense(15).construire();
        Pokemon pokemon2 = unPokemon().avecAttaque(15).avecDefense(15).construire();

        //When
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //Then
        assertThat(resultat).isTrue();
    }
}