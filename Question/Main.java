/*
Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for
each operation whose real and imaginary parts are entered by the user
 */
class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        r = real;
        i = img;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex difference(Complex a, Complex b){
        return new Complex((a.real - b.real),(a.img - b.img));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) - (a.img * b.real)));
    }

    public void printComplex(){
        if(real == 0 && img != 0){
            System.out.println(img+"i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        }else {
            System.out.println(real+"+"+img+"i");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c,d);
        Complex f = Complex.difference(c,d);
        Complex g = Complex.product(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();

    }
}