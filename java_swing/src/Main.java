import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String firstNumber;
        String secondNumber;
        int num1;
        int num2;
        int sum;

        firstNumber = JOptionPane.showInputDialog("Coloque o primeiro número");
        secondNumber = JOptionPane.showInputDialog("Coloque o segundo número");

        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma é " + sum, "resultado", JOptionPane.PLAIN_MESSAGE);
    }
}