package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    //properties
    private PriceList priceList;
    private double totalProfit = 0;



    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);
        if (flavors != null && flavors.length > 0) {

            for (int i = 0; i < flavors.length; i++) {
                totalProfit += priceList.getBallPrice() * flavors.length * 0.25;
                //totalProfit += priceList.getBallPrice();
            }
        }
        return cone;
    }

    @Override
    public IceRocket orderRocket() {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket newIce = new IceRocket();
        //totalProfit += priceList.getRocketPrice();
        totalProfit += priceList.getRocketPrice() * 0.20;
        return new IceRocket();
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum newMagnum = new Magnum();
        totalProfit += priceList.getMagnumPrice(type)* 0.01;
        //totalProfit += priceList.getMagnumPrice(type) ;
        return new Magnum(type);
    }

    @Override
    public String toString() {
        return "You are always welcome in our Ice Cream Salon!";
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

}
