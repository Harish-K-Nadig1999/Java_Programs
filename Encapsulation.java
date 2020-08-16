import java.util.Scanner;

 class Encryption {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String passwd;
    
        public Encryption() {
        this.name = name;
        this.passwd = passwd;
        }
        public void UserName(){
            System.out.println("Enter the User Name : ");
            System.out.println("The User Name is : " +(name = sc.next()));
        }
        private void UserPassword () {
            System.out.println("Enter the Password : ");
            System.out.println("The Entered Password is : "+(passwd = sc.next())+"\n");
            System.out.println("The Encrypted pass word is : ");
            
            //The Entered Password is made Encrypted by converting it into its equivalent ASCII value 
            
            StringBuilder sb=new StringBuilder();
            char[] letters=passwd.toCharArray();
            for(char ch : letters){
                sb.append((byte)ch);
            }
            System.out.println(sb.toString());      
    }
        public void getPass(){
            UserPassword();
        }
}
public class Main {
    public static void main(String args[]){
        Encryption obj = new Encryption();
        obj.UserName();
        obj.getPass();   
    }
}

Output :

Enter the User Name : 
Harish
The User Name is : Harish
Enter the Password : 
javajava
The Entered Password is : javajava

The Encrypted pass word is : 
10697118971069711897
