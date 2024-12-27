public class Another {
    String str = "This is a second class";
    String empty;
    //can't be changed
    final int x = 10;
    int init;

    //constructor
    public Another(int y) {
        init = y;
    }


    // Static method
    static void StaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method: must be called by creating an object Another object = new Another();
    public void PublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

}
