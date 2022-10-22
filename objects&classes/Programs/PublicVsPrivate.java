public class PublicVsPrivate {
  public static void main(String[] args) {
    NonnegativeInt c1 = new NonnegativeInt(14);
    NonnegativeIntBad c2 = new NonnegativeIntBad(22);
    // the following line doesn't compile, since x is private in 
    // the PositiveInt class
    // c1.x = -8; 
    c2.x = -8; // bad!
    System.out.println(c1.getX());
    System.out.println(c2.x); 

    c1.setX(-5);
    System.out.println(c1.getX()); // 5
  }
}

class NonnegativeInt {
  private int x;
  
  public NonnegativeInt(int x) {
    if (x < 0) {
      this.x = Math.abs(x);
    } else {
      this.x = x; 
    }
  }

  public int getX() { return x; }

  public void setX(int x) {
    this.x = Math.abs(x);
  }
}

class NonnegativeIntBad {
  public int x;
  
  public NonnegativeIntBad(int x) {
    if (x < 0) {
      this.x = Math.abs(x);
    } else {
      this.x = x; 
    }
  }
}