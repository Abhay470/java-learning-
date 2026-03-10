package week3;



// static variable class
public class Staticvariable {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 1500;
       mobile.name= "smartphone";

        mobile obj2 = new mobile();
        obj2.brand = "samsung";
        obj2.price = 1700;
        //obj2.name = "smartphone";
         mobile.name= "smartphone";
obj1.show();
obj2.show();
    }

}

class  mobile {
    String brand;
    int price;
    String network;
   static String name;
    // lets create static method in mobile class
    public void show()
    {
System.out.println( brand+":"+ price+":"+ name);
    }
}