package linewise;

/*******week 1 videos code ****** */
/***loops***** */
/* used to automate repetition tasks ******** */
/************* types => for , while , do while ************ */

/***  for used = when you know all things , starting , compare, end (in coding = initialize, comapare, increment)****/
/*** while used = when you are reading the file , when it ends you want to know whether it rue false , while  */
/*** do while used = when you wanrt to try program when it is wrong even once */

public class repetitionunderstands {
    public static void main(String[] args) {

        /****** while loop************** */
        // program => print hi 4 times if it is true, otherwise bye
/* 

comment beacuse nested loop in while form facing issue and stuck in same infinite loop

        int i = 1;
        while (i <= 4) {
            System.out.println("hi" + i);
            i++; // increment important otherwise infinite loop
        }
        System.out.println("bye ");



*/


        // nested loop in while form

        // program=> print hi 4 times if it is true,print hello 3 times , otherwise bye

        int i1 = 1;
        while (i1 <= 4) {
            System.out.println("hi" + i1);
        
        int j1=1;
        while (j1<=3) {
            System.out.println("hello"+j1);
            j1++;
        }
        i1++;
    }
    System.out.println("bye");


/************do while ************ */
int i2 = 5;
do {
    System.out.println("hello i am ash" +("-")+ i2);
    i2++;
} while (i2<=4);

/********for loop****************** */
for( int i3=1;i3<=4;i3++){
   System.out.println("hiii you are idiot"+i3);
}
for(int i4=7;i4>=0;i4--){
    System.out.println("reverse "+i4);
}

for(int i5=1;i5<=6;i5++){
System.out.println("day"+ i5);

for(int j5=1;j5<=9;j5++){
System.out.println(" "+(j5+8)+"-"+(j5+9));
}
}



    }

    

}