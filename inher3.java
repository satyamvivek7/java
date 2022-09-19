import java.util.*;
class abc
{
    int n;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("enter a no=");
        n=sc.nextInt();
    }
}
class abcd extends abc
{
    void output()
    {
       System.out.println("the no is="+n);
    }
}
public class inher3
{
  public static void main(String arg[])
  {
      abcd s1=new abcd();
      s1.input();
      s1.output();
  }  
}
