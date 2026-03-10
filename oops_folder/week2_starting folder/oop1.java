/**containing all codes of classes  (inneroop1,calculatoroop1,computeroop1 ) but their classes are seperate  (all codes here)*/

/****first oop pracatical code ******* */
/*
public class oop1 {
    public static void main(String[] args) {
     
      
        Inneroop1 in = new Inneroop1();
        in.add(4,5);
    }
}
class Inneroop1 {
public int add(int num1,int num2)
{
    int r= num1+num2;
System.out.println(r);;
return r;
}
    
}
*/

/***** methods********* */
// methods simple means functions used in program that return somethings based
// on your need and demand like in computter oop1 class void
// dont return anything or string used in get me a pen function means it return
// string like any name oe even value present in double quotes

public class oop1 {
    public static void main(String[] args) {

        // oop1 obj = new oop1;
        computeroop1 obj1 = new computeroop1();
        obj1.play_music();
        String str = obj1.getmeapen(2);
        System.out.println(str);

        // for method overloading
        calculatoroop1 calc = new calculatoroop1();
        System.out.println(calc.add(2));
        System.out.println(calc.add(3, 5));
        System.out.println(calc.add(10, 20, 30));

    }

}

class computeroop1 {

    public void play_music() {
        System.out.println("music playing ");
    }

    public String getmeapen(int cost) {
        if (cost >= 10) {
            return "pen";
        } else {
            return "nothing";
        }
    }
}

/****** method overloading**** */

// it simply means methods with same name but different parameters
// you see in calculator oop1 class all have same method name but all have
// different parameter like 1st add print only one value,
// 2nd value is add 2 number
// 3rd value is add 3 numbers

class calculatoroop1 {
    public int add(int n) {
        System.out.println("single value");
        return n;
    }

    public int add(int n1, int n2) {
        System.out.println("add 2 numbers");
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        System.out.println("add 3 numbers");
        return n1 + n2 + n3;
    }
}
