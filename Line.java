
 
   public class Line {

      Point begin, end;

      public Line(int x1, int y1, int x2, int y2) {
         begin = new Point(x1,y1);
         end = new Point(y1,y2);
      }

      public Line(Point begin, Point end){
         this.begin = begin;
         this.end = end;
      }

      public Point getBegin() {
         return begin;
      }

      public Point getEnd() {
         return end;
      }

      public void setBegin(Point begin) {
         this.begin = begin;
      }

      public void setEnd(Point end){
         this.end = end;
      }

      public double getLength() {
         int xDifference = begin.getX() - begin.getY();
         int yDifference = end.getX() - end.getY();
         return Math.sqrt( (xDifference * xDifference) + (yDifference * yDifference) );
      }   

      public String toString() {
            return "Line from " + begin + " to " + end;
      }

   }

   