class Base {
Base() throws Exception {
System.out.println("Base constructor");
throw new Exception("Exception in Base");
}
}

class Derived extends Base {
Derived() throws Exception {
try {
System.out.println("Derived constructor");
} catch (Exception e) {
System.out.println("Caught exception in Derived constructor: " + e.getMessage());
}
}
}

public class Exercise2 {
public static void main(String[] args) {
try {
Derived d = new Derived();
} catch (Exception e) {
System.out.println("Caught exception in main: " + e.getMessage());
}
}
}