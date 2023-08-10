public class Main {
    public static void main(String[] args) {

        Rook rook = new Rook();
        rook.moves();

        Queen queen = new Queen();
        queen.moves();

        King king = new King();
        king.moves();
    }
}

interface chessPieces{

    void moves();
}

class Queen implements chessPieces{
    public void moves(){
        System.out.println("Queen :- 360 Direction");
    }
}

class King implements chessPieces{
    public void moves(){
        System.out.println("King :- 360 Direction by 1 step everytime");
    }
}

class Rook implements chessPieces{
    public void moves(){
        System.out.println("Left, Right, Up, Down");
    }
}