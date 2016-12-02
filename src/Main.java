import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        double n = 222586.2236;
        System.out.printf("%e", n);
        System.out.println("");
        String nu = "2.225862e+05";
        ConverterNumbers.convertInExpToDec(nu);
    }
}
