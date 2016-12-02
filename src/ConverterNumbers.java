class ConverterNumbers {

    public static void convertToExp(double number) {
        System.out.printf("%e" + number);
    }

    static void convertInExpToDec(String numberInExp) {
        double convertNumber;
        try {
            convertNumber = Double.parseDouble(numberInExp);
            System.out.printf("%e \n", convertNumber);
        } catch (NumberFormatException t) {
            try {
                convertNumber = Double.valueOf(numberInExp.toUpperCase());
                System.out.println(convertNumber);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number");
            }

        }
    }

}
