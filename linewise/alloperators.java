package linewise;
public class alloperators {
    public static void main(String[] args) {
        

/* arithmatic operator********* */
        int num1 = 7;
        int num2 = 5;
        int result = num1+num2;
        int result1 = num1-num2;
        int result2 = num1*num2;
        int result3 =  num1/num2;
        System.out.println(result);
               System.out.println(result1);
                       System.out.println(result2);
                               System.out.println(result3);

/**** relational operator ****** */
int x = 6;
int y= 5;
int z = 6;
boolean result4 = x<y;
boolean result5 = x>y;
boolean result6 = x!=y;
boolean result7 =  x==z;
System.out.println(result4);
System.out.println(result5);
System.out.println(result6);
System.out.println(result7);

double x1= 8.8;
double y1= 9.8;
boolean result8 = x1<=y1;
boolean result9 = x1>=y1;

System.out.println(result8);
System.out.println(result9);

/****************logical operators***************** */

int x2 = 7;
int y2 = 5;
int a = 5;
int b = 9;
boolean result10 = x2>y2 && a>b;     // double and or not means using short circuit => (if first condition is true it will not check second one )
System.out.println(result10);                                                           // (or vice versa )
boolean result11 =x2>y2||a<b;
System.out.println(result11);

    }
}
