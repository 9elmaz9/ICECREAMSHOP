package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    public enum MagnumType{
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS, //1.5
        ROMANTICSTRAWBERRIES;}


    //Properties
    private MagnumType type;

    //Constructors
    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

 //  public MagnumType getType() { // etogo net v UML
 //      return type;
 //  }     nichego ne delaet  , potom delet sdelat


    //eatable method
 @Override
 public void eat() {
     System.out.println("You are eating magnum with flavor" + type ) ; // type.toString().length()+" "); //??????

    }
    public MagnumType getType(){
        return type;
    }
}

