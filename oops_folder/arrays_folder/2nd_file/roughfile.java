public class roughfile {
    public static void main(String[] args) {
        int nums4[][] = new int[3][4];
for( int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
              nums4[i][j]= (int)(Math.random()*100);
              System.out.println(nums4[i][j]);
            }
          }











        // nested loop( loop inside loop)
        // loop for row
        for (int i = 0; i < 3; i++) {
            // loop for column(each array)
            for (int j = 0; j < 4; j++) {

                // System.out.println(nums4[i][j]); // all comes in a straight line
                // but if i want after ending of every column print in new line then it is done
                // by concatinating spacing with it
                // so it count space as string and it looks clean

                System.out.print(nums4[i][j] + " ");

            }

            // and only use print instead of println for inner loop so it dont move neew
            // line and use println for row so for
            // every row it comeout and form a matrix

            System.out.println(); // move to next row


            // enhanced for loop = use this as in simple for loop

            for(int n[]: nums4)
            {
                for(int m:n)
                {
                    System.out.print(m+" ");
                }
                System.out.println();
            }
        }





        /**jagged and 3d array( next video)************ */


// it is jagged array when we dont know no of internal array in one big array we have individuallu specify it 
  //or that empty line means  it is jagged array ( new int[3][empty];)

int nums5[][] = new int[3][];
nums5[0]= new int[3];
nums5[1]= new int[2];
nums5[2]= new int[4];

for( int i=0;i<nums5.length;i++)
{
    for( int j=0;j<nums5[i].length;j++)
    {
        nums5[i][j]= (int)(Math.random()*10);
    
    }
}
for(int n[]: nums5)
{
    for(int m:n)
    {
        System.out.print(m+" ");
    }
    System.out.println();
}





    }
}