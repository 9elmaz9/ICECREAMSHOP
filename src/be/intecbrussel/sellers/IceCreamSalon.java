package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    //properties
    private PriceList priceList;
    private double totalProfit=0;


    //constructor
    // public IceCreamSalon() {
    // }
    // public IceCreamSalon(PriceList priceList, double totalProfit) {
    //     this.priceList = priceList;
    //     this.totalProfit = totalProfit;
    // }
    // public IceCreamSalon(PriceList priceList) {
    // }

    //constructor
    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }



    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone=new Cone(flavors);
        if (flavors != null && flavors.length > 0) {
            //totalProfit += priceList.getBallPrice() * 0.25;
           // totalProfit += priceList.getBallPrice() * flavors.length;
            for (int i = 0; i < flavors.length; i++) {
           // totalProfit += priceList.getBallPrice() * flavors.length * 0.25;
            totalProfit += priceList.getBallPrice();
        }
        //   else {
        //   totalProfit += priceList.getBallPrice();
        }
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        //IceRocket newIce=new IceRocket();
        totalProfit += priceList.getRocketPrice(); //* 0.20;
       // totalProfit += priceList.getRocketPrice() ;
        return new IceRocket();
    }



    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        //Magnum newMagnum = new Magnum();
       totalProfit += priceList.getMagnumPrice(type); // * 0.01;
        //totalProfit += priceList.getMagnumPrice(type) ;
        return new Magnum(type);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
    @Override
    public double getProfit() {
        return totalProfit;
    }

}
