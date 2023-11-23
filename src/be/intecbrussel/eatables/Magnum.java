package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS, //1.5
        ROMANTICSTRAWBERRIES;
    }

    private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    //eatable method
    @Override
    public void eat() {
        System.out.println("***");
        System.out.println("You are eating Magnum with flavor :" + type); // type.toString().length()+" ");
        System.out.println("***");

    }

    public MagnumType getType() {
        return type;
    }
}

