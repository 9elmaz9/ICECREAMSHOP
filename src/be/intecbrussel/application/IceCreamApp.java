package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
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
        System.out.println("     Prise List : ");

        PriceList priceList = new PriceList();
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSeller iceCreamSeller = iceCreamSalon;


        Magnum magnum1 = new Magnum(Magnum.MagnumType.ALPINENUTS);
        //Magnum magnum2=new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
        Magnum[] magnum = {iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES), iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS), iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE)};

        //IceRocket iceRocket = new IceRocket();
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.LEMON};
        //Cone cone = new Cone(flavors);
        Cone cone = iceCreamSalon.orderCone(flavors);


        Eatable[] eatables = {iceRocket, cone, magnum[2]};
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();

        }

        System.out.println("Total profit of the IceCreamSalon:" + iceCreamSeller.getProfit() + "$");
        System.out.println(iceCreamSalon);
    }
}






