public class enhancedforloop {
    public static void main(String[] args) {
        /***
         * lets understand this using my previous examples of (arraysofobject
         * file)**********
         */

        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);

        // }

        /**
         * instead of writing this entire code let solve this problem with enhanced for
         * loop
         ****/
        for (int n : nums) {
            System.out.println(n);
        }
        // i enhanced for loop we dont use counter initializer, increment, we are simply
        // saying
        // just give me one value at a time and you decide what you want to do with that
        // value
        // it just give value not index
        // also what value you get stored in n &
        // where do you get the value ( answer is from (nums))


/*****lets solved prevous array of object example  */

student s1 = new student();
s1.rollno=1;
s1.name ="ash";
s1.marks = 88;

student s2 = new student();
s2.rollno = 2;
s2.name = "naveen";
s2.marks = 55;
 
student s3 = new student();
s3.rollno = 3;
s3.name = "radhekrishna";
s3.marks =23;




student[] students= new student[3];
students[0]=s1;
students[1] =s2;
students[2] =s3;

//lets use enhanced for loop here 
for( student stud:students){
    System.out.println(stud.name + ":"+ stud.marks);
}

}


}

class student {
    int rollno;
    String name;
    int marks;

}


    


