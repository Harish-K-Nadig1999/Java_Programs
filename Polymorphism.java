class family
{
    void display()
    {
  System.out.println("Details of family members....\n"+" ");
}
}
   class fam_1 extends family
    {
     String A,B,C;
     public fam_1(String A,String B,String C)
     {
         this.A=A;
         this.B=B;
         this.C=C;
     }
      void getDetails()
    {
        System.out.println("First Family..\n"+"The family consits of 3 members :\n"+"**************");
    }
     void getA(){
         System.out.println(A+" is the Father of "+C);
     }   
     void getB(){
         System.out.println(B+" is the Mother of "+C);
     }
     void getC(){
         System.out.println(C+" is the Son of "+A+" and "+B+"\n");
     }
   }
class fam_2 extends family
{
    String X,Y;
    public fam_2(String X,String Y)
     {
         this.X=X;
         this.Y=Y;
      }
      void getDetails()
           {
               System.out.println("Second Family..\n"+"The family consits of 2 members :\n"+"**************");
           }
     void getX(){
         System.out.println(X+" is Husband of "+Y);
     }   
     void getY(){
         System.out.println(Y+" is Wife of "+X);
     }
}
public class main
{
    public static void main(String args[])
    {
        family obj=new family();
        obj.display();
        fam_1 f1=new fam_1("Ram","Sita","kush");
        f1.getDetails();
        f1.getA();
        f1.getB();
        f1.getC();
        
        fam_2 f2=new fam_2("Kumar","Geetha");
        f2.getDetails();
        f2.getX();
        f2.getY();
    }
}
-----------------------------------------
OUTPUT :
run:
Details of family members....
 
First Family..
The family consits of 3 members :
**************
Ram is the Father of kush
Sita is the Mother of kush
kush is the Son of Ram and Sita

Second Family..
The family consits of 2 members :
**************
Kumar is Husband of Geetha
Geetha is Wife of Kumar
BUILD SUCCESSFUL (total time: 0 seconds)

