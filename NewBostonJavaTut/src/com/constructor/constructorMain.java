package com.constructor;

/**
 * Created by Nerd on 6/20/2017.
 */
public class constructorMain {
    public static void main(String[] args) {
        constructorClass coc = new constructorClass("Fefe"); // cuz of constructor include parameter
        coc.saying();
        System.out.println();
        coc.simpleMessage("Fefe");

        // create object for overloaded constructor
        // from overloadedConstructor.java Class
        overloadedConstructor OLC1 = new overloadedConstructor();
        overloadedConstructor OLC2 = new overloadedConstructor(5);
        overloadedConstructor OLC3 = new overloadedConstructor(5,13);
        overloadedConstructor OLC4 = new overloadedConstructor(3,13,43);

        System.out.printf("%s\n",OLC1.toMilitary());
       System.out.printf("%s\n",OLC2.toMilitary());
        System.out.printf("%s\n",OLC3.toMilitary());
       System.out.printf("%s\n",OLC4.toMilitary());


       // from potpieConstruct.java class
       potpieConstuct pc = new potpieConstuct(4,5,6);
        System.out.println(pc.toString());

        // object from compositionConstruct
        CompositionConstruct cc = new CompositionConstruct("Oluwaphmmy",pc);
        System.out.println(cc);





    }
}
