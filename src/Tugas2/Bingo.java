/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
public class Bingo {
    private String name = "BINGO";
    private String clap = "(clap)";
    private String verse = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";

  
    public Bingo() {
    }

  
    private String displayVerse(int claps) {
        String result = "";
        if (claps == 0) {
            result = "BINGO\nBINGO\nBINGO";
        } else if (claps == 1) {
            result = "(clap)INGO\n(clap)INGO\n(clap)INGO";
        } else if (claps == 2) {
            result = "(clap)(clap)NGO\n(clap)(clap)NGO\n(clap)(clap)NGO";
        } else if (claps == 3) {
            result = "(clap)(clap)(clap)GO\n(clap)(clap)(clap)GO\n(clap)(clap)(clap)GO";
        } else if (claps == 4) {
            result = "(clap)(clap)(clap)(clap)O\n(clap)(clap)(clap)(clap)O\n(clap)(clap)(clap)(clap)O";
        } else if (claps == 5) {
            result = "(clap)(clap)(clap)(clap)(clap)\n(clap)(clap)(clap)(clap)(clap)\n(clap)(clap)(clap)(clap)(clap)";
        }
        return result;
    }

    public void sing() {
        System.out.println(verse);
        System.out.println(displayVerse(0));
        System.out.println("And Bingo was his name-o.\n");

        System.out.println(verse);
        System.out.println(displayVerse(1));
        System.out.println("And Bingo was his name-o.\n");

        System.out.println(verse);
        System.out.println(displayVerse(2));
        System.out.println("And Bingo was his name-o.\n");

        System.out.println(verse);
        System.out.println(displayVerse(3));
        System.out.println("And Bingo was his name-o.\n");

        System.out.println(verse);
        System.out.println(displayVerse(4));
        System.out.println("And Bingo was his name-o.\n");

        System.out.println(verse);
        System.out.println(displayVerse(5));
        System.out.println("And Bingo was his name-o.\n");
    }
}
