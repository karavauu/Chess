import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Программа на шахматной доске по заданному номеру клетки определяет номера всех клеток, имеющих с ней общую сторону.");

        System.out.print("Введите номер шахматной доски : ");
        int ChessNumber = scanner.nextInt();


        if (ChessNumber % 8 == 1 && ChessNumber != 57 && ChessNumber != 1)
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber - 8) + ", " + (ChessNumber + 8));

        else if (ChessNumber % 8 == 0 && ChessNumber != 64 && ChessNumber != 8)
            System.out.println(("Номера соседних клеток : " + (ChessNumber - 1)) + ", " + (ChessNumber - 8) + ", " + (ChessNumber + 8));

        else if (ChessNumber >= 2 && ChessNumber <= 7)
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber - 1) + ", " + (ChessNumber + 8));

        else if (ChessNumber >= 58 && ChessNumber <= 63)
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber - 1) + ", " + (ChessNumber - 8));

        else if (ChessNumber == 1)
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber + 8));

        else if (ChessNumber == 57)
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber - 8));

        else if (ChessNumber == 8)
            System.out.println(("Номера соседних клеток : " + (ChessNumber - 1)) + ", " + (ChessNumber + 8));

        else if (ChessNumber == 64)
            System.out.println(("Номера соседних клеток : " + (ChessNumber - 1)) + ", " + (ChessNumber - 8));

        else
            System.out.println(("Номера соседних клеток : " + (ChessNumber + 1)) + ", " + (ChessNumber - 1) + ", " + (ChessNumber + 8) + ", " + (ChessNumber - 8))
        ;


    }
}