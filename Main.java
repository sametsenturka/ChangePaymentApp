/**
 *
 * @author Samet Senturk
 * @version 1.4 (Change Payment App)
 *
 *
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How Much Did That Cost?");
        double total = scanner.nextDouble();

        System.out.println("Pay: ");
        double paid = scanner.nextDouble();

        if (paid < total){
            System.out.println("This isn't enough money.");
            System.out.println(total-paid + " TL please!");
        }
        else if (total == paid){
            System.out.println("Thanks! Have a Great Day!");
        }
        else if (total < paid){
            System.out.println("Thanks! Here Is Your Exchange! ");

            int m = (int)(paid - total);

            int ikiyuz = (m/200);
            int yuz = (m - ikiyuz*200)/100;
            int elli = (m - ikiyuz*200 - yuz*100)/50 ;
            int yirmibes = (m - ikiyuz*200 - yuz*100 - elli*50) / 25;
            int on = (m - ikiyuz*200 - yuz*100 - elli*50 - yirmibes*25)/10;
            int bes = (m - ikiyuz*200 - yuz*100 - elli*50 - yirmibes*25 - on*10)/5;
            int bir = (m - ikiyuz*200 - yuz*100 - elli*50 - yirmibes*25 - on*10 - bes*5);

            if (ikiyuz > 0){
                System.out.println(ikiyuz + " 200TL");
            }
            if (yuz > 0){
                System.out.println(yuz + " 100TL");
            }
            if (elli > 0){
                System.out.println(elli + " 50TL");
            }
            if (yirmibes > 0){
                System.out.println(yirmibes + " 25TL");
            }
            if (on > 0){
                System.out.println(on + " 10TL");
            }
            if (bes > 0){
                System.out.println(bes + " 5TL");
            }
            if (bir > 0){
                System.out.println(bir + " 1TL");
            }
        }
    }
}