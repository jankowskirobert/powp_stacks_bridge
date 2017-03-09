package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

    /**
     * zbyt dużo tabulacji: były dwie powinna być jedna dla każdego wcięcia
     * które wystąpiło. Kolejno dodanie brakujących klamer dla bloków
     * decyzyjnych oraz pętli.
     */
    public static void main(String[] args) {

        DefaultStacksFactory factory = new DefaultStacksFactory();
        //uporządkowanie wszystkich elementów tablicy w jednej kolumnie
        Stack[] stacks = {
            factory.getStandardStack(),
            factory.getFalseStack(),
            factory.getFIFOStack(),
            factory.getHanoiStack()
        };

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }

        java.util.Random random = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(random.nextInt(20));
        }

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            /**
             * usunięcie tabulatora który mylnie wskazyważ, że ta linia jest
             * częścią pętli while
             */
            System.out.println();
        }

        /**
         * Kombinacja klawiszy shift+alt+'strzałki kierunkowe' powodują dodanie
         * wcięcia lub jego usunięcie
         */
        System.out.println("total rejected is "
                + ((StackHanoi) stacks[3]).reportRejected()
        );

    }

}
