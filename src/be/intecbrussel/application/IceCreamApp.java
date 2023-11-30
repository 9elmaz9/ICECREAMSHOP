package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

import java.util.Scanner;

public class IceCreamApp {
    public static void main(String[] args) {

        System.out.println("   'Welcome to IceCreamCar'  ");
        System.out.println("   We offer 3 types ice cream : ");
        System.out.println("          -Magnum-           "
                +
                "\n" +
                " MILKCHOCOLATE,\n" +
                " WHITECHOCOLATE,\n" +
                " BLACKCHOCOLATE,\n" +
                " ALPINENUTS, \n" +
                " ROMANTICSTRAWBERRIES");

        System.out.println();
        System.out.println("         -Hoorntjes-        "
                +
                " \n" +
                " STRAWBERRY,\n" +
                " BANANA,\n" +
                " CHOCOLATE,\n" +
                " VANILLA,\n" +
                " LEMON,\n" +
                " STRACIATELLA,\n" +
                " MOKKA,\n" +
                " PISTACHE");
        System.out.println();

        System.out.println("-Raketijsjes- ");
        System.out.println();
    //System.out.println();
    //System.out.println(String.format("Boll prijs : + %s$ , Rocket pris : %s$ , Magnum Standard prijs :%s $ . Magnum nuts prijs : %s $"));

        System.out.println("     Prise List : ");

        PriceList priceList = new PriceList(10,20,100);
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);


        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Cone cone=iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.STRAWBERRY,Cone.Flavor.PISTACHE});

        //Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.LEMON};



        Eatable[] eatables = {iceRocket, cone, magnum};
        for (Eatable eatable:eatables){
            eatable.eat();
        }


     // for (int i = 0; i < eatables.length; i++) {
     //     eatables[i].eat();
     // }

        System.out.println("Total profit of the IceCreamSalon:" + iceCreamSalon.getProfit() + "$");
        System.out.println(iceCreamSalon);
    }
}




// PriceList priceList = new PriceList(10,20,100);
//        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
//
//        Cone cone = iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE});
//        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
//        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
//
//        Eatable[] icecreams = new Eatable[]{cone, iceRocket, magnum};
//
//        for (Eatable icecream : icecreams) {
//            icecream.eat();
//        }
//
//        System.out.println("PROFIT: " + iceCreamSalon.getProfit());

