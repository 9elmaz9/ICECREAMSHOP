package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    public PriceList pricelist;
    public Stock stock;
    public double profit;

    //constructor
    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = prepareCone(balls);

        if (cone != null) {
            profit += pricelist.getBallPrice() * balls.length * 0.25;
        }
        return cone;
    }


    private Cone prepareCone(Cone.Flavor[] balls) {
        if (stock.getBalls() >= 0 && stock.getBalls() >= balls.length) {
            Cone cone = new Cone(balls);
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - balls.length);
            return cone;
        }
        System.out.println("NO MORE ICE CREAM");
        return null;

    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = prepareIceRocket();

        if (iceRocket != null) {
            profit += pricelist.getRocketPrice() * 0.20;
        }
        return iceRocket;
    }

    private IceRocket prepareIceRocket() {
        if (stock.getIceRockets() > 0) {
            IceRocket iceRocket = new IceRocket();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return iceRocket;
        }
        System.out.println("NO MORE ICE CREAM");
        return null;
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnum = prepareMagnum(type);
        if (magnum != null) {
            profit += pricelist.getMagnumPrice(type) * 0.01;
        }
        return magnum;
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) {
        if (stock.getMagni() > 0) {
            Magnum magnum = new Magnum(type);
            stock.setMagni(stock.getMagni() - 1);
            return magnum;
        }
        System.out.println("NO MORE ICE CREAM.Magnum no longer in stock.");
        return null;
    }

    @Override
    public double getProfit() {
        return profit;
    }

}


// @Override
// public Cone orderCone(Cone.Flavor[] flavors) {
//     Cone preparedCone = null;
//     try {
//         preparedCone = prepareCone(flavors);
//     } catch (NoMoreIceCreamException no) {
//