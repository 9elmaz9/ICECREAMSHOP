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


    // @Override
    // public Cone orderCone(Cone.Flavor[] flavors) {

    //     try {
    //         Cone cone;
    //         cone = prepareCone(flavors);
    //     } catch (NoMoreIceCreamException e) {
    //         throw new RuntimeException(e);
    //     }

    //     if (flavors != null && flavors.length > 0) { // if in stock
    //         profit += pricelist.getBallPrice() * flavors.length;
    //     } else {
    //         profit += pricelist.getBallPrice();
    //     }
    //     return new Cone(flavors);
    // }

    // private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {
    //     if (stock.getCones() == 0 || stock.getBalls() == 0) {
    //         throw new NoMoreIceCreamException();
    //     }
    //     if (stock.getBalls() >= flavors.length) {
    //         stock.setCones(stock.getCones() - 1);
    //         stock.setBalls(stock.getBalls() - flavors.length);
    //         return new Cone();
    //     } else {
    //         System.out.println(" ice cream is out");
    //         throw new NoMoreIceCreamException();
    //     }
    // }
    // //----------------------------------------------------------------

    // @Override
    // public IceRocket orderIceRocket() {
    //     try {
    //         IceRocket iceRocket = prepareIceRocket();
    //     } catch (NoMoreIceCreamException e) {
    //         throw new RuntimeException(e);
    //     }
    //     profit += pricelist.getRocketPrice();
    //     return new IceRocket();
    // }


    // private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
    //     if (stock.getIceRockets() == 0) {
    //         throw new NoMoreIceCreamException();
    //     }
    //     stock.setIceRockets(stock.getIceRockets() - 1);
    //     return new IceRocket();
    // }

    // //----------------------------------------------------------------


    // @Override
    // public Magnum orderMagnum(Magnum.MagnumType type) {
    //     try {
    //         Magnum magnum = prepareMagnum(type);
    //     } catch (NoMoreIceCreamException e) {
    //         throw new RuntimeException(e);
    //     }
    //     profit += pricelist.getMagnumPrice(type);
    //     return new Magnum(type);
    // }


    // private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
    //     if (stock.getMagni() == 0) {
    //         throw new NoMoreIceCreamException();
    //     }
    //     stock.setMagni(stock.getMagni() - 1);
    //     return new Magnum();
    // }

    // //----------------------------------------------------------------


    // @Override
    // public double getProfit() {
    //     return profit;
    // }

    @Override
    public double getProfit() {
        return profit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone preparedCone = null;
        try {
            preparedCone = prepareCone(flavors);
        } catch (NoMoreIceCreamException no) {
            no.printStackTrace();
        }

        return preparedCone;

    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {

        if (stock.getBalls() < flavors.length || stock.getCones() < 1)
            throw new NoMoreIceCreamException("You're out of stock on the cones mate or balls whatever.");

        profit += pricelist.getBallPrice() * flavors.length;
        stock.setCones(stock.getCones() - 1);
        stock.setBalls(stock.getBalls() - flavors.length);

        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket preparedIceRockets = null;
        try {
            preparedIceRockets = prepareIceRocket();
        } catch (NoMoreIceCreamException no) {
            no.printStackTrace();
        }
        return preparedIceRockets;
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {

        if (stock.getIceRockets() < 1) {
            throw new NoMoreIceCreamException("You're out of IceRockets, surely you jest");
        } else {
            profit += pricelist.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {

        if (stock.getMagni() < 1) {
            throw new NoMoreIceCreamException("You're all out of Mangi oh noo, you jester D:<");
        } else {
            profit += pricelist.getMagnumPrice(type);
            stock.setMagni(stock.getMagni() - 1);
            return new Magnum();
        }
    }

     @Override
     public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException{
         Magnum preparedMagnum = null;
         try {
             preparedMagnum = prepareMagnum(type);
         } catch (NoMoreIceCreamException no) {
             System.out.println("no more"+no.printStackTrace);
         }
         return preparedMagnum;
     }
}

