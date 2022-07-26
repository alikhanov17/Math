package com.company;

import java.util.*;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();


        MathGame mathGame = new MathGame();
        LinkedList<Rank> linkedList = new LinkedList<>();

        int wh = 1;
        int t = 0;
        int x = 0;



        while (true) {

            System.out.println("[1] oyinni boshlash:");
            System.out.println("[2] reytingni kurish");
            System.out.println("[3] ishtirokchilarni kurish");

            int a = scanner.nextInt();
            if (a == 1) {

                System.out.println("ismingizni kiriting: ");
                String name = scanner.next();


                for (int i = 0; i <5 ; i++) {



                    int num1 = random.nextInt(100);
                    int num2 = random.nextInt(100);
                    int amal = random.nextInt(4);



                    System.out.println(wh + " savol");
           mathGame.Result(num1,num2,amal);

                    int n = scanner.nextInt();
                    if (n == mathGame.res) {
                        t++;
                    } else {
                        x++;
                    }
                    wh++;
                }

                linkedList.add(new Rank(name, t, x));
            } else if (a == 2) {

                for (Rank r : linkedList) {
                    System.out.println("ismi: " +r.getName());
                    System.out.println("tugri javoblar soni: "+r.getT());
                    System.out.println("xato javoblar soni: "+r.getX());
                }

               }
            else if (a==3){
                
linkedList.forEach(rank -> {
    System.out.println(rank.getName()+" "+rank.getT());
});
            }

            }
        }
    }
