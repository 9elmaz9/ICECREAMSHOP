package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static void main(String[] args) throws NoMoreIceCreamException {

        PriceList pricelist = new PriceList();

        Stock stock = new Stock();
        stock.setCones(5);
        stock.setBalls(5);
        stock.setMagni(1);
        stock.setIceRockets(5);

        IceCreamCar iceCreamCar = new IceCreamCar(pricelist, stock);
        IceCreamSeller iceCreamSeller = iceCreamCar;

        //IceCreamSeller iceCreamCar = new IceCreamCar(pricelist, stock);
        // stock1.setCones(2);
        // stock1.setIceRockets(2);
        // stock1.setMagni(4);

        //  iceCreamCar.orderIceRocket().eat();
        //  iceCreamCar.orderIceRocket().eat();

        //  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();
        //  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();
        //  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();
        //  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();

        //   iceCreamCar.orderCone(Cone.Flavor.values()).eat();
        //   iceCreamCar.orderCone(Cone.Flavor.values()).eat();

        IceRocket iceRocket = iceCreamCar.orderIceRocket();

        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA,Cone.Flavor.STRACIATELLA,Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamCar.orderCone(flavors);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);




        Eatable[] eatables = {iceRocket, cone, magnum};
        for (int i = 0; i < eatables.length; i++) {
            if (eatables[i] != null) {
                eatables[i].eat();

            }

        }

        System.out.println("Total profit of the IceCream Seller : " + iceCreamSeller.getProfit() + "$");


    }
}

//  Eatable[] eatables1 = {
//          iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
//          iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
//          iceCreamCar.orderCone(Cone.Flavor.values()),
//          iceCreamCar.orderIceRocket()};


//  iceCreamCar.orderIceRocket().eat();
//  iceCreamCar.orderCone(Cone.Flavor.values()).eat();
//  iceCreamCar.orderCone(Cone.Flavor.values()).eat();
//  iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();
//  iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE).eat();
//  iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();


//  System.out.println("--");
//  for (Eatable iceCream : eatables1) {
//      iceCream.eat();

//  }
//  System.out.println("Total profit : " + iceCreamCar.getProfit());
//  System.out.println(iceCreamCar);








