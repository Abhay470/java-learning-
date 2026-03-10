package week3;

//import string.string;

class mobile
{
String brand;
int price;
String name;

public void show(){
System.out.println("in static method");
}
}
public void show1(){

}


public class Staticmethod 
{
public static void main(String[] args)
 {
 mobile obj1 = new mobile();
 obj1.brand="apple";
 obj1.price=1500;
 obj1.name="smartphone";

 mobile obj2 = new mobile();
 obj2.brand="samsung";
 obj2.price=1700;
 obj2.name="smartphone";
    
// obj1.show();
mobile.show();

}
}