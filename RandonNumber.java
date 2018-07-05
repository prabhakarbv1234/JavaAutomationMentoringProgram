//2. Write a method that returns an N-digit integer random number..
                import java.util.Random;
public class RandonNumber {
              public static void main(String[] args) {
              Random r = new Random();
              int rnd = r.nextInt(1000);
              System.out.println(("Random number is : "+rnd);
              }
}
