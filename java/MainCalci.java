class Calculator{

int add(int a ,int b){
 int add1=a+b;
return add1;
}
int sub(int a,int b){
int sub1=a-b;
return sub1;
}
int multiple(int a,int b){
int multiple1=a*b;
return multiple1;
}
int div(int a,int b){
int div1=a/b;
return div1;
}
int perc(int a,int b){
int perc1=a%b;
return perc1;
}
}
class MainCalci{
public static void main(String args[]){
Calculator obj=new Calculator();
int add=obj.add(2,3);
int sub=obj.sub(2,3);
 int multiple=obj.multiple(2,3);
 int div=obj.div(2,3);
 int perc=obj.perc(30,20);
System.out.println("addition is: "+add);
System.out.println("subtraction  is: "+sub);
System.out.println("amultiplication is: "+multiple);
System.out.println("division is: "+div);
System.out.println("poercentage is: "+perc);
}
}