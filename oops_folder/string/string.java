package string;
//if you want characters like name (bunch of characters ), then string is used and it always in double quotes("")
public class string {
    public static void main(String[] args) {
        String name = new String("navin");
        System.out.println(name.hashCode());
        // string pnly support + operator for concatenation not any other 
        System.out.println("hello" + name.charAt(0));
         System.out.println("hello" + name.codePointAt( 2));

         // to concatenate two strings 
         String name1 = new String("reddy");
         System.out.println("hello"+name);
         System.out.println(name.concat(name1));
    }
}
