package ua.pt.ies.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class WeatherForecastApp {
    private static Scanner sc = new Scanner(System.in);
    
    private static IpmaApiClient client = new IpmaApiClient();

    public static void  main(String[] args) {
        System.out.println("Hello World");
        int op = 0;
        boolean loop = true;

        while(loop) {
            System.out.println("--==[ IPMA API Client ]==--");
            System.out.println("  List available cities");
            System.out.println("  Get city forecast");
            System.out.println("  Quit");
            System.out.print(" Choose an option: ");
            
            try {
                op = sc.nextInt();
                sc.nextLine();
    
                switch(op) {
                    case 1:
                        client.displayCities();
                        break;
                    case 2:
                        System.out.print("Enter city name: ");
                        String cityName = sc.nextLine();
                        client.displayCityForecast(cityName);
                        break;
                    case 3:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option!");
                sc.nextLine();
            }

        }
    }
}