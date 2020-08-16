import java.util.Arrays;
public class array {
 public static void main(String args[])
 {
     int arr1[] ={1,2,3,4,5};
     int arr2[] =new int[10];
     System.out.println("3rd indexed value of arr1 is : "+arr1[3]+"\n");
      System.out.println("The elements of arr2 is .. : ");
     for (int i=1; i<arr2.length; i++){
             arr2[i]=i;
             System.out.print(arr2[i]*10+" ");            
        }
     System.out.println("\n");
      System.out.println("Some Built-in methods of arrays... \n");
      //CopyOf method - To copy one array into another
     int arr4[] ={1,2,3,4,5};
     String arr5 =Arrays.toString(Arrays.copyOf(arr4, 10));
      System.out.println("* Copying arr4 in arr5 : ");
      System.out.println(arr5+"\n");
      
       //toString method - It returns String representation for contents of arrays
        int intArr[] = { 10, 20, 15, 22, 35 }; 
        System.out.println("* toString method representation: "+Arrays.toString(intArr)+"\n"); 
        
     //To check whether array contains particulr value or not
     int arr3[] ={12,13,14,15,16,17,18};
     boolean b=Arrays.asList(arr3).contains(19);
     System.out.println("* Checks whether 19 is present in arr3 or not : ");
     System.out.println(b);
    
      //equals method - Checks whether 2 arrays are equal or not
      int arr6[] ={5,10,15};
      int arr7[] ={5,11,15};
       System.out.println();
      System.out.println("* Checks arr6 is equal to arr7 or not : ");
      System.out.println(Arrays.equals(arr6, arr7)+"\n");
       
       //fill method - fills paricular value to each index of array
       int arr8[] ={10,20,30,40,50};
       int key =25;
       Arrays.fill(arr8, key);
       System.out.println("* Fills key value to entire array : ");
       System.out.println(Arrays.toString(arr8)+"\n");
       
      //sort method - this method sorts array in ascending arder
      int arr9[] ={15,11,14,17,18,10,19,12};
      Arrays.sort(arr9);
       System.out.println("* Sorts the elements of arr9");
      System.out.println(Arrays.toString(arr9));
      
    } 
 }

OUTPUT:

3rd indexed value of arr1 is : 4

The elements of arr2 is .. : 
10 20 30 40 50 60 70 80 90 

Some Built-in methods of arrays... 

* Copying arr4 in arr5 : 
[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

* toString method representation: [10, 20, 15, 22, 35]

* Checks whether 19 is present in arr3 or not : 
false

* Checks arr6 is equal to arr7 or not : 
false

* Fills key value to entire array : 
[25, 25, 25, 25, 25]

* Sorts the elements of arr0
[10, 11, 12, 14, 15, 17, 18, 19]
BUILD SUCCESSFUL (total time: 0 seconds)
