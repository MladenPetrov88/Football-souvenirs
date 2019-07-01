import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int boughtSouvenirs = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (souvenirs.equals("flags")) {
            if (country.equals("Argentina")){
                price = boughtSouvenirs * 3.25;
            } else if (country.equals("Brazil")){
                price = boughtSouvenirs * 4.20;
            } else if (country.equals("Croatia")){
                price = boughtSouvenirs * 2.75;
            } else if (country.equals("Denmark")) {
                price = boughtSouvenirs * 3.10;
            }
        }

        if (souvenirs.equals("caps")) {
            if (country.equals("Argentina")){
                price = boughtSouvenirs * 7.20;
            } else if (country.equals("Brazil")){
                price = boughtSouvenirs * 8.50;
            } else if (country.equals("Croatia")){
                price = boughtSouvenirs * 6.90;
            } else if (country.equals("Denmark")) {
                price = boughtSouvenirs * 6.50;
            }
        }

        if (souvenirs.equals("posters")) {
            if (country.equals("Argentina")){
                price = boughtSouvenirs * 5.10;
            } else if (country.equals("Brazil")){
                price = boughtSouvenirs * 5.35;
            } else if (country.equals("Croatia")){
                price = boughtSouvenirs * 4.95;
            } else if (country.equals("Denmark")) {
                price = boughtSouvenirs * 4.80;
            }
        }

        if (souvenirs.equals("stickers")) {
            if (country.equals("Argentina")){
                price = boughtSouvenirs * 1.25;
            } else if (country.equals("Brazil")){
                price = boughtSouvenirs * 1.20;
            } else if (country.equals("Croatia")){
                price = boughtSouvenirs * 1.10;
            } else if (country.equals("Denmark")) {
                price = boughtSouvenirs * 0.90;
            }
        }

        if (!souvenirs.equals("flags") && !souvenirs.equals("caps") && !souvenirs.equals("posters") && !souvenirs.equals("stickers")){
            System.out.println("Invalid stock!");
        } else if (!country.equals("Argentina") && !country.equals("Brazil") && !country.equals("Croatia") && !country.equals("Denmark")){
            System.out.println("Invalid country!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", boughtSouvenirs, souvenirs, country, price);
        }
    }
}
