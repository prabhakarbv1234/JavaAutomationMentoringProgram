package flowerpack;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
protected List<Flower> flowers = new ArrayList<>();
public void add(Flower flower){
flowers.add(flower);
}
public void add(int n, Flower flower){
for(int i=0;i<n;i++){
flowers.add(flower);
}
}
// public int getCostofBouguet(){
// int costofBouquet  = 0;
// for(Flower flower : flowers ){
// costofBouquet += flower.getCost();
// }
// 
// return costofBouquet;
// }
}

------------------------------------------------------------------------------------ 
package flowerpack;

public class Client {

public static void main(String[] args) {
// TODO Auto-generated method stub
Bouquet sriniBouquet = new Bouquet();
sriniBouquet.add(new Rose());
sriniBouquet.add(new Jasmine());

sriniBouquet.add(new Lilly());
sriniBouquet.add(10, new Rose());
// System.out.println("cost of bouquet : "+sriniBouquet.getCostofBouguet());
// public static int calculatecostofbouquet(Bouquet bouquet){
// for(Flower flower : bouquet.g)
// }
}

}

package flowerpack;

public abstract class Flower {
//public String name;
protected int cost ;
public int getCost(){
return cost;
}  
}
------------------------------------------------------------------

package flowerpack;

public class Jasmine extends Flower{
public Jasmine(){
this.cost = 10;
}
}

-------------------------------------------------
package flowerpack;

public class Lilly extends Flower{
public Lilly(){
this.cost = 23;
}
}

----------------------------------------------
package flowerpack;

public class Rose extends Flower{
public Rose(){
this.cost = 4;
}
}
