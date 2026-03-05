package linewise;
/*******week 1 video code ***************** */

public class conditionaalstatements {
public static void main(String[] args) {

    /****************conditional statements**********/
    int x=21;
    if(x>10 && x>10 && x<=20)
        System.out.println("hello");
    else 
        System.out.println("bye");
// or 

int x1 = 5;
int y1 =7;
if (x1>y1) {
    System.out.println(x1);
} else {
   System.out.println(y1); 
}
/**********if else if statements********** */

int x2=8;
int y2 = 7;
int z2=9;
if(x2>y2 && y2>z2){
    System.out.println(x2);
}
else if ( y2>z2){
    System.out.println(y2);
}
else 
    System.out.println(z2);

/********Ternery operator****************/
int n=4;
int result =0;
if(n%2==10)
result=10;
else
    result = 20;
    System.out.println(result);
// instead of doing this let do an shortcut and solve it in one line using ternery operator
int n1 = 5;
int result1 =0;
result1 = n1%2==0?10:20;
System.out.println(result1);

/*******switch statement ************ */

int n2 =4;
switch (n2) {
    case 1: System.out.println("monday");
        break;
    case 2: System.out.println("tuesaday");
    break;
    case 3: System.out.println("wednesday");
    break;
    case 4: System.out.println("thursday");
    break;
    case 5: System.out.println("friday");
    break;
    case 6: System.out.println("saturday");
    break;
    case 7: System.out.println("sunday");
    break;
    default:
        System.out.println(" invalid day ");
        break;
}
}
    
}