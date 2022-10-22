class ShadowedFieldExample {
  private int x;
  private static int y;

  public ShadowedFieldExample(int initialX) {
    x = initialX;
  }

  // A local variable is a parameter of a method or a variable 
  // declared inside a method.
  // When a a local variable has the same name as a field of the 
  // class, then using that name (x in this example) indicates the 
  // local variable, not the field. The field is "shadowed" (hidden).
  public void method() {
    int x = 10;

    x = 15;
  }

  public int getX() { return x; }

  // Goal of this method is to assign the parameter to the field. 
  // But this method isn't successful because the x field is shadowed.
  public void setXBad(int x) {
    x = x; // assigns the value of local variable x to local variable x
  }

  public void setX(int x) {
    this.x = x; // assigns the value of local variable x to field x
  }
  // this.x means the x field of the object that called the method
  

  // We cannot use "this" in a static method, since a static method 
  // is not called through an object. 
  // Instead, to overcome shadowing in a static method, use the 
  // syntax ClassName.staticFieldName
  public static void setY(int y) {
    ShadowedFieldExample.y = y;
  }
}

public class TestShadowedFieldExample {
  public static void main(String[] args) {
    ShadowedFieldExample s = new ShadowedFieldExample(5);
    System.out.println(s.getX()); // 5
    s.method();
    System.out.println(s.getX()); // 5
    s.setXBad(20);
    System.out.println(s.getX()); // 5
    s.setX(20);
    System.out.println(s.getX()); // 20
    
  }
}