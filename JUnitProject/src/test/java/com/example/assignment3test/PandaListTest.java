package com.example.assignment3test;

import com.example.assignment3.Panda;
import com.example.assignment3.PandaList;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import  org.junit.jupiter.api.Assertions.*;

class PandaListTest {

    @DisplayName("Compare panda name is Robert")
    @Test
    public void testComparePanda() {
        Assertions.assertTrue(PandaList.comparePanda("Robert"));
    }

    @DisplayName("Input does not match the panda name")
    @Test
    public void testWrongPandaName(){
        Panda panda1 = new Panda("Robert", 3, true, 90);
        Assertions.assertFalse(PandaList.comparePanda("Sky"));
        Assertions.assertNotEquals(panda1.getName(), PandaList.comparePanda("Sky"));
    }

    @DisplayName("Panda name is not null")
    @Test
    public void testNotNullName(){
        Assertions.assertNotNull(PandaList.comparePanda("Robert"));
    }

    @DisplayName("See the panda arraylist size")
    @Test
    public void testPandaListSize(){
        List<Panda> pandaList = new ArrayList<>();
        Panda panda1 = new Panda("Robert", 3, true, 90);
        pandaList.add(panda1);
        Assertions.assertEquals(1, PandaList.pandaListSze());
        pandaList.add(PandaList.addPanda("Jack",1, false, 40.2));

        Assertions.assertEquals(2, PandaList.pandaListSze());

    }

    @DisplayName("Can we add a panda from user input")
    @Test
    public void testAddPanda(){

        List<Panda> pandaList = new ArrayList<>();

        //Assertions.assertEquals(true, PandaList.addPanda());
        Assertions.assertEquals(true, pandaList.add(PandaList.addPanda("Jack",1, false, 40.2)));
    }
}