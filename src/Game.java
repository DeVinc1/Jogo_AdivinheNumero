import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {

      
}
    public static int definirComecoIntervalo() {
        /* Manipulando matematicamente o resultado de Math.random() para atender um intervalo */
        return (int) ((Math.random() * (50 - 0)) + 0);
    }

    public static int definirFinalIntervalo() {
        return (int) ((Math.random() * (100 - 51)) + 51);
    }

}