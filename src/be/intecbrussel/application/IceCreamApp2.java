package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static void main(String[] args) {


        System.out.println("   'Welcome to IceCreamCar'   ");
        System.out.println("   We offer 3 types ice cream : ");
        System.out.println("   -Magnum-    "
                +
                "\n" +
                " MILKCHOCOLATE,\n" +
                " WHITECHOCOLATE,\n" +
                " BLACKCHOCOLATE,\n" +
                " ALPINENUTS, \n" +
                " ROMANTICSTRAWBERRIES");

        System.out.println();
        System.out.println("   -Hoorntjes-   "
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
        System.out.println("   -Raketijsjes- ");
        System.out.println();
        System.out.println("     ***");

        PriceList pricelist = new PriceList(1, 2, 3);

        Stock stock = new Stock(2, 2, 2, 2);

        IceCreamSeller iceCreamCar = new IceCreamCar(pricelist, stock);

        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket4 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket5 = iceCreamCar.orderIceRocket();

        Cone cone = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE, Cone.Flavor.STRAWBERRY});
        //  Cone.Flavor[]flavors1={Cone.Flavor.STRAWBERRY,Cone.Flavor.MOKKA,Cone.Flavor.PISTACHE};
        //  Cone cone1=iceCreamCar.orderCone(flavors1);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);


        Eatable[] eatables = new Eatable[]{iceRocket1, iceRocket2, iceRocket3, iceRocket4, iceRocket5, magnum, magnum1, cone,};

        for (Eatable eatable : eatables) {
            if (eatable != null) {
                eatable.eat();
            }
        }


        System.out.println("\n Total profit of the IceCream Car : " + iceCreamCar.getProfit() + "$");
        System.out.println();
        System.out.println("ICE CREAM  STOCK IN WAREHOUSE :");
        System.out.println("Stock Ice Rocket :" + stock.getIceRockets());
        System.out.println("Stock Magni :" + stock.getMagni());
        System.out.println("Stock Balls :" + stock.getBalls());
    }
}


// Eatable[] eatables = new Eatable[] {iceRocket, iceRocket1, magnum, magnum1, cone, };
//     for (int i = 0; i < eatables.length; i++) {
//     if (eatables[i] != null) {
//     eatables[i].eat();

//     }
//     }



