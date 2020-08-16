import java.util.*;
public class Phone_Book 
{
  private ArrayList<String> Numbers =new ArrayList<String>();
  int size = Numbers.size();
  public void Display()
  {
        System.out.println("Your Contact List has "+Numbers.size()+ " contacts :");
        System.out.println(Numbers);
  }
    public void  addList(String item)
    {
        System.out.println();
        Numbers.add(item);
    }
    public void updateList(int position, String item)
    {
        System.out.println();
        System.out.println("Contact List updated ");
        Numbers.set(position,item);
    }
    public void removeList(int position)
    {
        System.out.println();
        System.out.println("One contact deleted ");
        Numbers.remove(position);
    }
    public static void main(String[] args) 
    {
        Phone_Book object =new Phone_Book();
        object.addList("ABCD - 9881111111");
        object.addList("LMNO - 8313333333");
        object.addList("WXYZ - 9115555555");
        object.Display();
        object.addList("HIJK - 8089999998");
        object.Display();
        object.updateList(0,"ABCD - 7081100009");
        object.Display();
        object.removeList(0);
        object.Display();
        object.removeList(0);
        object.Display();
    }}

OUTPUT :

Your Contact List has 3 contacts :
[ABCD - 9881111111, LMNO - 8313333333, WXYZ - 9115555555]

Your Contact List has 4 contacts :
[ABCD - 9881111111, LMNO - 8313333333, WXYZ - 9115555555, HIJK - 9739999999]

Contact List updated 
Your Contact List has 4 contacts :
[ABCD - 9881100000, LMNO - 8313333333, WXYZ - 9115555555, HIJK - 9739999999]

One contact deleted 
Your Contact List has 3 contacts :
[LMNO - 8313333333, WXYZ - 9115555555, HIJK - 9739999999]

One contact deleted 
Your Contact List has 2 contacts :
[WXYZ - 9115555555, HIJK - 9739999999]

BUILD SUCCESSFUL (total time: 0 seconds)
