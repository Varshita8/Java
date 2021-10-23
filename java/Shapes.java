interface Shape {
float perimeter(float x);
float area(float m);
float PI=3.14f;
}
class Square implements Shape {
public float perimeter(float x){
return(4*x);
}
public float area(float m){
return(m*m);
}
}
class Circle implements Shape {
public float perimeter(float x){
return(2*PI*x);
}
public float area(float m){
return(PI*m*m);
}
}

class Shapes{
public static void main(String args[])
{
Square sobj=new Square();
System.out.println("Perimeter of square: "+sobj.perimeter(5));
System.out.println("Area of square: "+sobj.area(6));


Circle cobj=new Circle();
System.out.println("Perimeter of circle: "+cobj.perimeter(5));
System.out.println("Area of circle: "+cobj.area(6));

}

}
