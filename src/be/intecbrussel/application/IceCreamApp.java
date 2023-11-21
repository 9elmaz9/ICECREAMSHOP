package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        //Maak een PriceList instantie aan.
        PriceList priceList = new PriceList(1, 2, 3);

        //Maak een IceCreamSalon instantie aan met behulp van de pricelist en steek deze in een
        //IceCreamSeller variabele
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);


      Magnum magnum = new Magnum(Magnum.MagnumType.ALPINENUTS);

      IceRocket iceRocket = new IceRocket();

      Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.LEMON};
      Cone cone = new Cone(flavors);

        Eatable[] eatables = {
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderCone(Cone.Flavor.values()),
                iceCreamSalon.orderIceRocket()};


        iceCreamSalon.orderIceRocket().eat();
        iceCreamSalon.orderCone(Cone.Flavor.values()).eat();
        iceCreamSalon.orderCone(Cone.Flavor.values()).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();


        System.out.println("--");
        for (Eatable iceCream : eatables) {
            iceCream.eat();

        }
        System.out.println("Total profit : " + iceCreamSalon.getProfit());
        System.out.println(iceCreamSalon);



    }
}
