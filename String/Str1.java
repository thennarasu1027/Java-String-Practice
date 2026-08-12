class Str1
{
   public static void main(String [] args)
{
   String s1 = "hello";
   String s2 = "hello";
 //comparing address
if(s1==s2)
{
  System.out.println("address is same");
}
else
{
  System.out.println("address is notsame");
}
if(s1.equals(s2))
{
  System.out.println("values are same");
}
else
{
 System.out.println("Values are not same");
}
}
}  