package project1;
class Boxes
{
    int length;
    int breadth;
    int height;
    Boxes (int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
}
public class Box {
    public static void main(String[] args) {
 Boxes b=new Boxes(5,4,3);
  int volume=b.length*b.breadth*b.height;
        System.out.println(volume);
    }
}

