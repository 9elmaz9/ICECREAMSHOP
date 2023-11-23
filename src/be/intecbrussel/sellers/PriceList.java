package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;


public class PriceList {
    //Propertied
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    //Constructor
    public PriceList() {
        ballPrice = 1;
        rocketPrice = 1;
        magnumStandardPrice = 1.1;

        System.out.println(String.format("Boll prijs : + %s$ , Rocket pris : %s$ , Magnum Standard prijs :%s $ . Magnum nuts prijs : %s $", ballPrice, rocketPrice, magnumStandardPrice, magnumStandardPrice *1.5));
        System.out.println("");

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;

    }


    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        switch (type) {
            case ALPINENUTS:
                return 1.5 * magnumStandardPrice;
            default:
                return magnumStandardPrice;
        }
    }
}
//   public double getMagnumPrice(Magnum.MagnumType type) {

//   if (type == Magnum.MagnumType.ALPINENUTS) {
//    magnumStandardPrice *= 1.5;
//    System.out.println("Magnum Alpinnenuts prijs :" +magnumStandardPrice*1.5);
//    }
//    return magnumStandardPrice;
