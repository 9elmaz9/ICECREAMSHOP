package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    public PriceList pricelist;
    public Stock stock;
    public double profit=0;

    //constructor
    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public double getProfit() {
        return profit;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if (prepareCone(flavors)) {
            profit += pricelist.getBallPrice() * 0.25;
            return new Cone(flavors);
        }
        return null;
    }
    @Override
    public IceRocket orderRocket() {
        return null;
    }
    private boolean prepareCone(Cone.Flavor[] flavors) {
        if (stock.getBalls() >= flavors.length) {
            stock.setBalls(stock.getBalls() - flavors.length);
            return true;
        } else {
            System.out.println("***");
            System.out.println("NO MORE ICE CREAM.Cone no longer in stock.");
            return false;
        }
    }
    public IceRocket orderIceRocket() {
        if (prepareIceRocket()) {
            profit += pricelist.getRocketPrice() * 0.20;
            return new IceRocket();
        }
        return null;
    }
    private boolean prepareIceRocket() {
        if (stock.getIceRockets() > 0) {
            stock.setIceRockets(stock.getIceRockets() - 1);
            return true;
        } else {
            System.out.println("***");
            System.out.println("NO MORE ICE CREAM. Ice Rocket no longer in stock.");
            return false;
        }
    }


    public Magnum orderMagnum(Magnum.MagnumType type) {
        if (prepareMagnum()) {
            double magnumProfit = 0.01;
            switch (type) {
                case MILKCHOCOLATE:
                case WHITECHOCOLATE:
                case BLACKCHOCOLATE:
                    magnumProfit *= 1.1;
                    break;
                case ALPINENUTS:
                    magnumProfit *= 1.5;
                    break;
                case ROMANTICSTRAWBERRIES:
                    magnumProfit *= 2;
                    break;
            }
            profit += pricelist.getMagnumPrice(type) * magnumProfit;
            return new Magnum(type);
        }
        return null;
    }


    private boolean prepareMagnum() {
        if (stock.getMagni() > 0) {
            stock.setMagni(stock.getMagni() - 1);
            return true;
        } else {
            System.out.println("NO MORE ICE CREAM.Magnum no longer in stock.");
            return false;
        }
    }
}











// @Override
// public Cone orderCone(Cone.Flavor[] flavors) {
//     Cone preparedCone = null;
//     try {
//         preparedCone = prepareCone(flavors);
//     } catch (NoMoreIceCreamException no) {
//