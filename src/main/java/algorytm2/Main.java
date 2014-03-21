package algorytm2;

/**
 * Suma liczb od 1 do 5
 */
public class Main {
    public static void main(String[] args) {
        int s = 0;
        int i = 1;

        do{
            s += i;
            i++;
        } while(i <= 5);

        System.out.println("s = " + s);
    }
}