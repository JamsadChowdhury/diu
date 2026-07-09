abstract class Shape{
  
  abstract void draw();
}
class Rectangle extends Shape{
  
  void draw(){
    
  System.out.println("drawing rectangle");
}
public static void main(String args[]){
  
  Shape S; 
  S = new Rectangle(); 
  S.draw();
}
}
