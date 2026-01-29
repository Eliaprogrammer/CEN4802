package com.example.assignment3;

import static com.example.assignment3.CollectPandaInformation.pandaList;

public class PandaList {
     static Panda panda1 = new Panda("Robert", 3, true, 90);

    public static boolean comparePanda(String pandaName){
        return panda1.getName().equals(pandaName);
    }

    //String pandaName, int pandaAge, boolean sleeping, double pandaWeight
    public static Panda addPanda(String pandaName, int pandaAge, boolean sleeping, double pandaWeight){
        return new Panda(pandaName, pandaAge, sleeping, pandaWeight);
    }

    public static int pandaListSze(){
        pandaList.add(panda1);
        return pandaList.size();
    }
}
