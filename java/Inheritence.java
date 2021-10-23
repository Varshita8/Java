class SuperClass
{
 int a;
}

class SubClass extends SuperClass
{ 
 int b;
}

class Inheritence
{
  public static void main(String[]args)
 {
  SuperClass supc=new SuperClass();
  SubClass subc=new SubClass();
  supc.a=10;
  subc.a=20;
  subc.b=30;
  System.out.println(supc.a+" "+subc.a+" "+subc.b);
 }
}
