public class Charac
{
  public static void main(String s[])
  {
     acad a1=new acad();
     a1.print();
   }

}
class acad
{
  int a;
  char c;

   acad()
{
   a=65;
   c=65;
}

void print()
{
for(int i=65;i<=90;i++)
{
   System.out.println(a+"-"+c);
   a++;
   c++;
}
}

}

