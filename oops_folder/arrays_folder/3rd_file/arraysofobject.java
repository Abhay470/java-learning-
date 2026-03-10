public class arraysofobject {
    // public static void main(String[] args) {
    //     int nums[] = new int[6];
    //     nums[0] = 4;
    //     nums[1] = 8;
    //     nums[2] = 3;
    //     nums[3] = 9;
    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.println(nums[i]);

    //     }
    // }

public static void main(String[] args) {
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

for(int i=0;i<students.length;i++)
{
    System.out.println(students[i].rollno+":"+students[i].name);
}
}


}

class student {
    int rollno;
    String name;
    int marks;

}