import java.util.*;
public class Vector_program 
{
 public static void main(String args[])
 {
     Vector v=new Vector();
     for(int i=0;i<10;i++)
     {
         v.addElement(i);
     }
     System.out.println("The Vector Capacity is...  :"+v.capacity());
     System.out.println(v);
     System.out.println("Adding New Element Hello");
     v.addElement("Hello");
     System.out.println(v); 
     System.out.println("The Vector Capacity is...  :"+v.capacity());
 }
}

OUTPUT :

The Vector Capacity is...  :10
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Adding New Element Hello
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, Hello]
The Vector Capacity is...  :20

BUILD SUCCESSFUL (total time: 0 seconds)
