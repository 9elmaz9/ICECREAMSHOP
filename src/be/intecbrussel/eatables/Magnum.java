package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    public enum MagnumType{
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;}


    //Properties
    public MagnumType type;

    //Constructors
    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() { // etogo net v UML
        return type;
    }


    //eatable method
    @Override
    public void eat() {
        System.out.println("EAT me"+ type.toString().length()+" "); //??????

    }
}

