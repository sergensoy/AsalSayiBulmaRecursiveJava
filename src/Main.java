import java.util.Scanner;

public class Main {
    static void isPrimeNumber(int number){
        if (number == 1){
            System.out.println(number + " sayısı ASAL değildir !");
        }else {
            isPrimeNumber(number,1,true);
        }
    }

    static void isPrimeNumber(int number, int tempNumber,boolean isPrime){
        tempNumber++;

        if (tempNumber == number){
            if (number%tempNumber != 0)
                isPrime = false;

            if (isPrime){
                System.out.println(number + " sayısı ASALDIR !");
            }else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }else {
            if (number%tempNumber == 0)
                isPrime = false;

            if (isPrime){
                isPrimeNumber(number,tempNumber,isPrime);
            }else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,run;

        do {
            System.out.print("Sayı giriniz : ");
            number = scan.nextInt();

            isPrimeNumber(number);

            System.out.print("Devam etmek ister misiniz? (Herhangi bir sayı: Evet, 0: Hayır) : ");
            run = scan.nextInt();
        }while (run != 0);
        System.out.println("Güle Güle..");
    }
}