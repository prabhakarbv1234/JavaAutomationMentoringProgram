package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> arrayList = new ArrayList<>();
LinkedList<Integer> linkedList = new LinkedList<>();
readtime("ArrayList",arrayList);
readtime("LinkedList",linkedList);
}
public static void readtime(String type,List<Integer> List){
for(int i=0;i<1E5;i++){
List.add(i);
}
Long start = System.currentTimeMillis();
for(int i=0;i<1E5;i++){
List.add(List.size(),i);
}
System.out.println(List.size());
for(int i=0;i<1E5;i++){
List.add(i);
}
Long end =  System.currentTimeMillis();
System.out.println("time take "+(end-start) +" ms for "+type);
}

}

------------------------------------------------------------------------------------ 
package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShortedMap {

public static void main(String[] args) {
// TODO Auto-generated method stub
    Map<Integer,String> hashmap = new HashMap<>();
Map<Integer,String>linkedhashmap = new LinkedHashMap<>();
Map<Integer,String> treemap = new TreeMap<>();
testmap(hashmap);
testmap(linkedhashmap);
testmap(treemap);
}
public static void testmap(Map<Integer,String> map){
map.put(01, "one");
map.put(322, "three");
map.put(15, "five");
map.put(4, "four");
map.put(0, "zero");
map.put(10, "zero");
map.put(12, "zero");
map.put(01, "one");
map.put(32, "three");
map.put(15, "five");
map.put(4, "four");
map.put(0, "zero");
map.put(10, "zero");
map.put(12, "zero");
// for(Map.Entry<Integer,String> tentry : map.entrySet()){
// int tkey = tentry.getKey();
// String tvalue = tentry.getValue();
// System.out.println(tkey+" :" +tvalue);
// }
for(Integer key : map.keySet()){
String value = map.get(key);
System.out.println(key+" : "+value);
}
System.out.println("----------------------");
}

}

------------------------------------------------------------------------------------------------- 
package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
HashSet<String>hashset = new HashSet<>();
LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
TreeSet<String> treeset1 =new TreeSet<>();
treeset1.add("cat");
treeset1.add("Monkey");
treeset1.add("dog");
treeset1.add("dogall");
TreeSet<String> treeset2 =new TreeSet<>();
treeset2.add("cat");
treeset2.add("Monkey");
treeset2.add("dog");
treeset2.add("dogs");
TreeSet<String> interaction = new TreeSet<>(treeset1);
interaction.retainAll(treeset2);
System.out.println(interaction);
TreeSet<String> diff = new TreeSet<>(treeset1);
diff.removeAll(treeset2);
System.out.println(diff);
TreeSet<String> diff1 = new TreeSet<>(treeset2);
diff1.removeAll(treeset1);
System.out.println(diff1);
// getvalue(hashset);
// getvalue(linkedhashset);
// getvalue(treeset);
}
// public static void getvalue(Set<String> set){
// if(set.isEmpty()){
// System.out.println("it is empty");
// }
// set.add("cat");
// set.add("bat");
 
// set.add("ant");
// set.add("monkey");
// System.out.println(set);
// if(set.isEmpty()){
// System.out.println("it is empty");
// }
// if(set.contains("cat")){
// System.out.println("cat is avaliable");
// }
// 
// System.out.println("--------------------------------------");
// for(String value :set){
// System.out.println(set);
// }
// System.out.println("--------------------------------------");
// }
}

------------------------------------------------------------------------------------------------------- 
package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer,String> map = new HashMap<>();
map.put(1, "one");
map.put(5, "five");
map.put(2, "two");
map.put(4, "four");
map.put(3, "three");
map.put(6, "");
map.put(7, "seven");
 
map.put(0, "");
 
//map.put(7, "seveny");
map.put(6, "six");
String text = map.get(4);
System.out.println(text);
for(Map.Entry<Integer,String> entry : map.entrySet() ){
int key = entry.getKey();
String value = entry.getValue();
System.out.println(key +" : "+value);
}
} 

}
---------------------------------------------------------------------
package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
class Person{
private int id ;
private String name;
Person(int id,String name){
this.id = id;
this.name  = name;
}
@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + id;
result = prime * result + ((name == null) ? 0 : name.hashCode());
return result;
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Person other = (Person) obj;
if (id != other.id)
return false;
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
return true;
}
public String toString(){
return "["+id+" : "+name+"]";
}
}

public class CustomizedSetMap {

public static void main(String[] args) {
// TODO Auto-generated method stub
Person p1 = new Person(1,"test");
Person p2 = new Person(1,"rest");
Person p3 = new Person(1,"best");
Person p4 = new Person(1,"gest");
Map<Person,Integer>map = new LinkedHashMap<>();
map.put(p1, 1);
map.put(p2, 3);
map.put(p3,2);
map.put(p4, 4);
System.out.println("--------------in map entry method start");
for(Map.Entry<Person,Integer> entry :map.entrySet()){
Person key = entry.getKey();
int value = entry.getValue();
System.out.println(key+":"+value);
}
System.out.println("--------------in map for each ");
for(Person mkey :map.keySet()){
int mvalue = map.get(mkey);
System.out.println(mkey+":"+mvalue);
}
System.out.println("--------------in set for each ");
Set<Person> set = new LinkedHashSet<>();
set.add(p1);
set.add(p2);
set.add(p3);
set.add(p4);
System.out.println(set);
for(Person s : set){
System.out.println(s);
}  
}

}



