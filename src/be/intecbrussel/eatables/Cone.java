package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    public enum Flavor {

        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

    }


    public Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    //eatable method
    @Override
    public void eat() {
        System.out.println("You are eating a Cone with   " +balls.length + "flavors : ");
        for (int i = 0; i < Arrays.stream(balls).count(); i++) {

            System.out.print(balls[i]);
            if (i < balls.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");

    }
}


