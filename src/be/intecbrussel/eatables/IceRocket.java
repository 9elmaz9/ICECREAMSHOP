package be.intecbrussel.eatables;

import be.intecbrussel.sellers.IceCreamSalon;

public class IceRocket implements Eatable {


    public IceRocket() {
    }

    //eatable method
    @Override
    public void eat() {
        System.out.println("***");
        System.out.println("You are eating an Ice Rocket");
        System.out.println("***");


    }
}
