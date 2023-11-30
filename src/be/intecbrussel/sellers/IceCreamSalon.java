package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    //properties
    private PriceList priceList;
    private double totalProfit ;



    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }



    public IceCreamSalon(PriceList priceList, double totalProfit) {
        this.priceList = priceList;
        this.totalProfit = totalProfit;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = new Cone(balls);
        totalProfit += priceList.getBallPrice() * balls.length * 0.25;
        return cone;
    }



    @Override
    public IceRocket orderIceRocket() {
       //IceRocket newIce = new IceRocket();
        //totalProfit += priceList.getRocketPrice();
        totalProfit += priceList.getRocketPrice() * 0.20;
        return new IceRocket();
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum newMagnum = new Magnum(type);
        totalProfit += priceList.getMagnumPrice(type)* 0.01;
        //totalProfit += priceList.getMagnumPrice(type) ;
        return newMagnum;
    }




    @Override
    public double getProfit() {
        return totalProfit;
    }
    @Override
    public String toString() {
        return "You are always welcome in our Ice Cream Salon!";
    }
}

// @Override
//    public String toString() {
//        return "IceCreamSalon{" +
//                "priceList=" + priceList +
//                ", totalProfit=" + totalProfit +
//                '}';