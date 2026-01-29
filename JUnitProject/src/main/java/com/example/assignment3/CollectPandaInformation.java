package com.example.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectPandaInformation {
      static List<Panda> pandaList = new ArrayList<>();
    public static void main(String[] args){
        Panda panda1 = new Panda("Robert", 3, true, 90);
        pandaList.add(panda1);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter panda name");
        String name = input.nextLine();
        PandaList.comparePanda(name);

        System.out.println("Please enter the panda age");
        String age = input.nextLine();
        int pandaAge = Integer.parseInt(age);

        System.out.println("Is the panda sleeping: true or false");
        boolean sleeping = input.nextBoolean();

        System.out.println("How much does the panda weigh?");
        String weight = input.nextLine();
        double pandaWeight = Double.parseDouble(weight);

        pandaList.add(PandaList.addPanda(name, pandaAge, sleeping, pandaWeight));

        System.out.println(pandaList);
        System.out.println(pandaList.size());
    }
}
