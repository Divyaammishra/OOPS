public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(34, 54));
        System.out.println(calculator.sum((float) 4.5, (float)5.6));
        System.out.println(calculator.sum(4, 56, 67));
        
    }
}

class Calculator{

    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}