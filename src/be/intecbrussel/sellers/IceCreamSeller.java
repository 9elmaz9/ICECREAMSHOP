package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {


    public Cone orderCone(Cone.Flavor[] flavors);

    public IceRocket orderIceRocket();

    public Magnum orderMagnum(Magnum.MagnumType type);

    //  @Override
    //  double getProfit();


}
