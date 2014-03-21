package algorytm1;

import javax.swing.*;

/**
 * Suma liczb od 1 do n
 */
public class Main {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Podaj liczbę: ");
        if(message == null) {
            JOptionPane.showMessageDialog(null, "Nie podałeś liczby");
            System.exit(-1);
        }

        try {
            int N = Integer.parseInt(message);
            int S = 0;
            int L = N;

            while(L > 0) {
                S += L;
                L -= 1;
            }

            JOptionPane.showMessageDialog(null, "S wynosi: " + S);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Błąd przy parsowaniu",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }
}
