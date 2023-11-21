package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    public PriceList pricelist;
    public Stock stock;
    public  double profit;

    //constructor
    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        return null;
    }

    public Cone prepareCone(Cone.Flavor[] flavors) {        return null;

    }




    @Override
    public IceRocket orderIceRocket() {
        return null;
    }
    public IceRocket prepareIceRocket() {
        return null;
    }





    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }
    public Magnum prepareMagnum(Magnum.MagnumType type) {
        return null;
    }



    @Override
    public double getProfit() {
        return 0;
    }
}
