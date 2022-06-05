package Hesaplamalar;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input=new Scanner(System.in);
        System.out.println("Bugun hava kac derece? :");
        sicaklik=input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsin!");
        }
        if ((sicaklik>=5) && (sicaklik<=10)){
            System.out.println("Sinemaya gidebilirsin!");
        }
        if ((sicaklik>10)&&(sicaklik<15)){
            System.out.println("Sinemaya ve piknige gidebilirsin!");
        }
        if ((sicaklik>=15) && (sicaklik<=25)){
            System.out.println("Piknige gidebilirsin!");
        }if (sicaklik>25){
            System.out.println("Yuzmeye gidebilirsin");
        }
    }
}
