public class Main {



    /*
    1. First we need to create an object out of the main method
    2. Then after, we can access those in our main method
     */
    public static void main(String[] args) {

        //Step 2 - accessing object in main method

        Pen pen = new Pen(); //created a Pen object called pen

        pen.setColor("Blue"); //while accessing any properties and function of an object, we use . operator
        System.out.println(pen.color); //Changing color of a pen

        pen.setTip(5);
        System.out.println(pen.tip); //changing tip of a pen

        pen.color = "Yellow"; //Also call like this
        System.out.println(pen.color);

    }


}

    //Step 1 - creating an object

    class Pen{

        String color; //Properties of a pen class
        int tip; //Properties of a pen class

        void setColor(String newColor){ //Function of a pen class, which can change its color later
            color = newColor;
        }

        void setTip(int newTip){ //Function of a pen class, which can change its color later
            tip = newTip;
        }
    }
