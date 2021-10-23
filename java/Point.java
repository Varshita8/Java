class Point {
int x;  int y;
void setX(int x){
    x=(x>79?79:(x<0?:x));
}
void setY(int y){
    y=(y>24?24:(y<0?0:y));
}
int getX()(return x);
int getY()(return y);
}