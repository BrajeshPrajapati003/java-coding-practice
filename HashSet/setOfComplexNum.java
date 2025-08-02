import java.util.HashSet;
public class setOfComplexNum {
    public static void main(String[] args) {
        HashSet<Complex> hs = new HashSet<Complex>();
        hs.add(new Complex(10, 20));
        hs.add(new Complex(20, 30));
        hs.add(new Complex(30, 40));
        hs.add(new Complex(40, 50));
        hs.add(new Complex(50, 60));

        System.out.println("Hash Set of Compex Numbers: ");
        for(Complex c: hs){
            c.printComplex();
        }
    }
}

class Complex{
    int re;
    int img;
    Complex(int r, int i){
        this.re = r;
        this.img = i;
    }
    void printComplex(){
        System.out.println("Complex Number: "+ re + " + " + img + "i");
    }
}
