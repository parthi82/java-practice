 
 public class Point {
     
    private int x, y;  // private member variables of point class 

    public Point(int x, int y) {  //constructor 
        this.x = x;
        this.y = y;
    }

    public Point() {  //default constructor(no-arguments)
       x = 0;
       y = 0;
    }

    public int getX(){
       return x;
    }

    public int getY(){
       return y;
    }

    public void setX(int x){
       this.x = x;
    }

    public void setY(int y){
       this.y = y;
    }

    // toString() to describe itself
    public String toString(){
        return "(" + x + "," + y + ")";
    }


 }