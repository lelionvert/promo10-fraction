import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numerateur1 = Integer.parseInt(reader.readLine());
        int denominateur1 = Integer.parseInt(reader.readLine());
        int numerateur2 = Integer.parseInt(reader.readLine());
        int denominateur2 = Integer.parseInt(reader.readLine());

        Fraction fraction1 = new Fraction(numerateur1, denominateur1);
        Fraction fraction2 = new Fraction(numerateur2, denominateur2);

        System.out.println(fraction1.toString() + " x " + fraction2.toString() + " = " + fraction1.multiply(fraction2).toString());
    }
}
