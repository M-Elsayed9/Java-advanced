public class TestDefaultConstructor {
  public static void main(String[] args) {
    Test1 test1 = new Test1(); // works; uses the default constructor

    Test2 test2 = new Test2(); // doesn't compile!
  }
}

class Test1 {
  private int x;
  
  // Java provides a no-arg constructor here. 
  // This Java-provided constructor is known as a default constructor.
  // Java provides a class with a default constructor if - and only if -
  // the programmer has not written any constrctors at all in the class.
  // A default constructor does not really do anything, but it allows us
  // to say "new Test1()".
}

class Test2 {
  private int x;
  
  public Test2(int x) {
    this.x = x;
  }

  // Since this class has a programmer-written constructor, Java doesn't
  // provide this class with a default constructor. 
}