class Point {
private int x;
private int y;
public void setX(int x){
this.x=(x>79?79:(x<0?0:x));
}
public void setY(int y){
this.y=(y>24?24:(y<0?0:y));
}
public int getX(){
return x;
}
public int getY(){
return y;
}
}

class Pointdemo
{
 public static void main(String args[])
  {
    Point p1=new Point();
    p1.setX(-22);
    p1.setY(144);
    System.out.println("point x:"+p1.getX());
    System.out.println("point y:"+p1.getY());
  }
}