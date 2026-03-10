package first_code;

/***********week 1 video code ********* */

public class datatypes {
    public static void main(String[] args) {

        // integer = * int,* long,* short,* boolean( for integer value )
        // float = * float, * double (decimal numbers )
        // character = * char , ( in single qoutes single value )
        // boolean = boolean , ( reue, false)

        int num1 = 9;
        // byte by =129; // error = possible lossy conversion from int to byte
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);

        /*     ******** float section **************** */
float f = 5.8f;  // as double is by default we use f in last to show flaot
double d = 5.6754;
System.out.println(f);
System.out.println(d);

/*********************** character section ***************** */
char c = 'a';
System.out.println(c);

/************* boolean section ***************** */
boolean b= true;
System.out.println(b);


/*********literal*********/
int num = 585;
int numa = 0b101;
System.out.println(num);
System.out.println(numa);

int num2 = 1000000000;
  int num3 = 100_00_00;
System.out.println(num2);
System.out.println(num3);

// for double 
 double number =56;
System.out.println(number);

double number1 = 12e10;
System.out.println(number1);

//for boolean
boolean number3 = true;
System.out.println(number3);

    }

}
