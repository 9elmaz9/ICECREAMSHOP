package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {

 public boolean printStackTrace;

 public NoMoreIceCreamException() {
 }

 public NoMoreIceCreamException (String message) {
     super(message);
  System.out.println(message);
 }
}
