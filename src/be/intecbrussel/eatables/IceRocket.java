package be.intecbrussel.eatables;

import be.intecbrussel.sellers.IceCreamSalon;

public class IceRocket implements Eatable {

    //Constructor

    public IceRocket() {
    }

    //eatable method
    @Override
    public void eat() {
        System.out.println("You are zating an Ice Ricket");

    }
}
