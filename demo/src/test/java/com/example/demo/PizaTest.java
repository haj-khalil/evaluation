package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizaTest {
    @Test
    void verficationGetter() {

        Piza piza1 = new Piza ("margarita", 10,5 ) ;

        String nom1 = piza1.getNom();
        int nb_ing1 = piza1.getNb_ing();
        float prix1= piza1.getPrix();


        // verfication getter et la construction
        assertEquals("margarita",nom1);
        assertEquals(5,nb_ing1);
        assertEquals(10,prix1);


    }
    @Test
    void verficationSetterGetter() {

        Piza piza2 = new Piza ("somon", 15 , 3);



        piza2.setNom("secret");
        piza2.setNb_ing(10);
        piza2.setPrix(100);

        String nom1 = piza2.getNom();
        int nb_ing1 = piza2.getNb_ing();
        float prix1= piza2.getPrix();


        // verfication getter & setter
        assertEquals("secret",nom1);
        assertEquals(10,nb_ing1);
        assertEquals(100,prix1);



    }
    @Test
    void verficationGetterConstructor() {

        Piza piza2 = new Piza ("somon", 15 , 3);


        String nom2 = piza2.getNom();
        int nb_ing2= piza2.getNb_ing();
        float prix2= piza2.getPrix();



        // verfication getter & constructor
        assertEquals("somon",nom2);
        assertEquals(3,nb_ing2);
        assertEquals(15,prix2);


    }

}