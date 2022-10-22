public class TestInitialValues {
  public static void main(String[] args) {
    int x; // x is undefined -- Java does not give a default value to a local variable
    
    InitialValues iv = new InitialValues();
    System.out.println(iv.toString());
  }
}

class InitialValues {
  private int x;
  private double y;
  private boolean z;
  private String s;
  private CoordinatePoint p;

  public InitialValues() {
  }
  
  public String toString() {
    String result = "";
    result += "x: " + x + "\n";
    result += "y: " + y + "\n";
    result += "z: " + z + "\n";
    result += "s: " + s + "\n";
    result += "p: " + p + "\n";
    return result;
  }
}