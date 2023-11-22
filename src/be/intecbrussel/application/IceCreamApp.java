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
        ///HELLO






        System.out.println("Hello in iceCreamCar");
        System.out.println("We have 3 type ice crem");
        System.out.println("Magnum : MILKCHOCOLATE,\n" +
                "        WHITECHOCOLATE,\n" +
                "        BLACKCHOCOLATE,\n" +
                "        ALPINENUTS, //1.5\n" +
                "        ROMANTICSTRAWBERRIES");


        System.out.println("Hoorntjes : STRAWBERRY,\n" +
                        "          BANANA,\n" +
                        "          CHOCOLATE,\n" +
                        "          VANILLA,\n" +
                        "          LEMON,\n" +
                        "          STRACIATELLA,\n" +
                        "          MOKKA,\n" +
                        "          PISTACHE");

        System.out.println("Raketijsjes ");

        //choose
     // Scanner scanner=new Scanner(System.in);
     // System.out.println("You can choose");
     // int chose=scanner.nextInt();




        PriceList priceList = new PriceList();
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSeller iceCreamSeller = iceCreamSalon;


        Magnum magnum1 = new Magnum(Magnum.MagnumType.ALPINENUTS);
        //Magnum magnum2=new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
        Magnum []magnum = {iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE)};




        //IceRocket iceRocket = new IceRocket();
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.LEMON};
        //Cone cone = new Cone(flavors);
        Cone cone = iceCreamSalon.orderCone(flavors);



        //  Eatable[] eatables = {
        //          iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),
        //          iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
        //          iceCreamSalon.orderCone(Cone.Flavor.values()),
        //          iceCreamSalon.orderIceRocket()};


        //  iceCreamSalon.orderIceRocket().eat();
        //  iceCreamSalon.orderCone(Cone.Flavor.values()).eat();
        //  iceCreamSalon.orderCone(Cone.Flavor.values()).eat();
        //  iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();
        //  iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE).eat();
        //  iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();


        //  System.out.println("--");
        //  for (Eatable iceCream : eatables) {
        //      iceCream.eat();

        //  System.out.println("Total profit : " + iceCreamSalon.getProfit());
        //  System.out.println(iceCreamSalon);
        //  } }




        Eatable[] eatables = {iceRocket, cone, magnum[1]};
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();

        }



        System.out.println("Total profit of the IceCreamSeller:"+ iceCreamSeller.getProfit() + "$");
    }
}





