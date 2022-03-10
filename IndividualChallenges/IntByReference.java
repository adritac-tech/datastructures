public class IntByReference {
    private int value;

    // Hack: create IntByReference, swapToLowHighOrder and toString methods
    public IntByReference(int value){
        this.value = value;
    }

    public int swapToLowHighOrder(int a, int b) {
        if(a > b){
            return a;
            return b;
        }
        else if(a < b){
            int newA = b;
            int newB = a;
            return newA;
            return newB;
        }
        else{
            return a;
            return b;
        }
    }
    //need to modify swapToLowHighOrder to change the IntByReference object and not compare two ints
    public String toString(int a, int b){

    }
    //error: idk what the toString should do

    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: " + a + " " + b);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

    // static main method that provides some simple test cases
    public static void main(String[] ags) {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }
}
