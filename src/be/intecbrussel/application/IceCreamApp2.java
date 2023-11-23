package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static void main(String[] args) throws NoMoreIceCreamException {


        System.out.println("   Welcome to IceCreamCar");
        System.out.println("   We offer 3 types ice cream");
        System.out.println("   -Magnum- \n"
                        +
                " MILKCHOCOLATE,\n" +
                " WHITECHOCOLATE,\n" +
                " BLACKCHOCOLATE,\n" +
                " ALPINENUTS, \n" +
                " ROMANTICSTRAWBERRIES");

        System.out.println();
        System.out.println("   -Hoorntjes- \n"
                +
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
        System.out.println("     Prise List : ");


        PriceList pricelist = new PriceList();

        Stock stock = new Stock();
        stock.setCones(10);
        stock.setBalls(5);
        stock.setMagni(5);
        stock.setIceRockets(2);

        IceCreamCar iceCreamCar = new IceCreamCar(pricelist, stock);
        IceCreamSeller iceCreamSeller = iceCreamCar;

        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();

        Cone.Flavor[] balls = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.STRACIATELLA, Cone.Flavor.STRAWBERRY};
        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.STRACIATELLA, Cone.Flavor.STRAWBERRY};

        Cone cone = iceCreamCar.orderCone(flavors);
        Cone cone1 = iceCreamCar.orderCone(balls);
        //  Cone.Flavor[]flavors1={Cone.Flavor.STRAWBERRY,Cone.Flavor.MOKKA,Cone.Flavor.PISTACHE};
        //  Cone cone1=iceCreamCar.orderCone(flavors1);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);


        Eatable[] eatables = {iceRocket, iceRocket1, magnum, magnum1, cone, cone1};
        for (int i = 0; i < eatables.length; i++) {
            if (eatables[i] != null) {
                eatables[i].eat();

            }
        }

        System.out.println("\n Total profit of the IceCream Car : " + iceCreamSeller.getProfit() + "$");
        System.out.println();
        System.out.println("ICE CREAM  STOCK IN WAREHOUSE");
        System.out.println("Stock Ice Rocket :" + stock.getIceRockets());
        System.out.println("Stock Magni :" + stock.getMagni());
        System.out.println("Stock Balls :" + stock.getBalls());
    }
}







//  Eatable[] eatables1 = {
//          iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
//          iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
//          iceCreamCar.orderCone(Cone.Flavor.values()),
//          iceCreamCar.orderIceRocket()};

//  iceCreamCar.orderIceRocket().eat();
//  iceCreamCar.orderCone(Cone.Flavor.values()).eat();
//  iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();


//  System.out.println("--");
//  for (Eatable iceCream : eatables1) {
//      iceCream.eat();
//  }

//------------------------------------------------------

//IceCreamSeller iceCreamCar = new IceCreamCar(pricelist, stock);
// stock1.setCones(1);
// stock1.setIceRockets(1);
// stock1.setMagni(1);

//  iceCreamCar.orderIceRocket().eat();
//  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();
//   iceCreamCar.orderCone(Cone.Flavor.values()).eat();






