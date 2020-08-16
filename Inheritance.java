import java.util.Scanner;
class food
{
    void make_coffee(){
        System.out.println("1) coffee ");}
    void cool_drinks(){
        System.out.println("2) cooldrinks ");}
}
    class Veg extends food
    {
        void tea(){
            System.out.println("Tea avilable in all Indian hotels");
        }
    }
    class southh_indian extends Veg
     {
       void Idli(){
         System.out.println("Idli is raedy");
       } 
       void Dosa(){
          System.out.println("Dosa is ready"); 
       } 
     }
     class north_indian extends Veg
     {
         void parota(){
         System.out.println("north idian parota");
       } 
       void vegitable_bath(){
          System.out.println("special veg bath"); 
       }   
    }
    class nonveg extends food
    {
        void biriyani(){
          System.out.println("Biriyani available in all non veg hotels");   
        }}
      class italian extends nonveg
      {
         void chicken(){
             System.out.println("Special Italian chicken"); 
         }
         void soup(){
             System.out.println("Italian soup"); 
         }
        }
      class mexican extends nonveg
      {
        void manchuri(){
         System.out.println("mexican manchuri...");    
      }
    }
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        food f=new food();
        System.out.println("Commonly Available everywhere :"); 
        f.make_coffee();
        f.cool_drinks();     
        System.out.println("Try Other variety :"); 
        System.out.println("Choose Veg or nonveg :"); 
        String s=sc.next();
        if("veg".equals(s))
        {
        System.out.println("Try North Indian or South Indian Dishes\n(For NORTH INDIAN type north for SOUTH INDIAN type south)");
        String s1=sc.next();
        if("north".equals(s1)){   
        System.out.println("********");
        north_indian ni=new north_indian();
        ni.parota();
        ni.vegitable_bath();}
        else
        {
            southh_indian si=new southh_indian();
            si.Dosa();
            si.Idli();
        }
        }
        else
        {
            System.out.println("Try out Mexican or Italian"); 
            System.out.println("Try Mexican or Italian Dishes\n(For MEXICAN tyoe mex for ITALIAN type ita)");
        String s2=sc.next();
        if("ita".equals(s2)) {  
        System.out.println("********");
        italian it=new italian();
        it.soup();
        it.chicken();}
        else{
        mexican m=new mexican();
        m.manchuri();
        }
        }   
    }
}

Output 1):
Commonly Available everywhere :
1) coffee 
2) cooldrinks 
Try Other variety :
Choose Veg or nonveg :
veg
Try North Indian or South Indian Dishes
(For NORTH INDIAN type north for SOUTH INDIAN type south)
south
Dosa is ready
Idli is raedy

Output 2):
Commonly Available everywhere :
1) coffee 
2) cooldrinks 
Try Other variety :
Choose Veg or nonveg :
veg
Try North Indian or South Indian Dishes
(For NORTH INDIAN type north for SOUTH INDIAN type south)
north
********
north idian parota
special veg bath

Output 3):
Commonly Available everywhere :
1) coffee 
2) cooldrinks 
Try Other variety :
Choose Veg or nonveg :
nonveg
Try out Mexican or Italian
Try Mexican or Italian Dishes
(For MEXICAN tyoe mex for ITALIAN type ita)
mex
mexican manchuri...

Output 4):
Commonly Available everywhere :
1) coffee 
2) cooldrinks 
Try Other variety :
Choose Veg or nonveg :
nonveg
Try out Mexican or Italian
Try Mexican or Italian Dishes
(For MEXICAN tyoe mex for ITALIAN type ita)
ita
********
Italian soup
Special Italian chicken
