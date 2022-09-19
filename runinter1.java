class first implements Runnable 
{ 
 public void run() 
 { 
   for(int i=1;i<=10;i++) 
   { 
    System.out.print("First : "+i+"   "); 
   } 
 } 
} 
class second implements Runnable 
{ 
 public void run() 
 { 
   for(int i=1;i<=10;i++) 
   { 
   System.out.print("Second : "+i+"   "); 
   } 
 } 
} 
class third implements Runnable 
{ 
 public void run() 
 { 
   for(int i=1;i<=10;i++) 
   { 
   System.out.print("Third : "+i+"   "); 
   } 
 } 
} 
class runinter1
{ 
 public static void main(String arg[]) 
 { 
  first f1=new first(); 
  second s1=new second(); 
  third tr1=new third(); 
  Thread t1=new Thread(f1); 
  Thread t2=new Thread(s1); 
  Thread t3=new Thread(tr1); 
  t1.start(); 
  t2.start(); 
  t3.start(); 
 } 
}