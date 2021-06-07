package com.javabasic.work13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        System.out.println("Введите строку, содержащую символы AJV:");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String[] stringResult =  {"","","","",""};
        for (int i = 0; i < string.length(); i++) {
            stringResult = addChar(stringResult, upperChar(string.charAt(i)));
        }

        System.out.println("Вывод строки: '"+string+"' кастомным шрифтом");
        System.out.println();
        printResultCaps(stringResult);

    }

    private static void printResultCaps(String[] wordResult){
        for (int i = 0; i < wordResult.length; i++) {
            System.out.println(wordResult[i]);
        }
    }

    private static String[] addChar(String[] word, String[] bigChar){
        for (int i = 0; i < word.length; i++) {
            word[i] = word[i] + bigChar[i] + "   ";
        }
        return word;
    }

    private static String[] getWordFromBigChar(){
        String[] charJ = upperChar('J');
        String[] charA = upperChar('A');
        String[] charV = upperChar('V');
        String[] wordResult = {"","","","",""};
        for (int i = 0; i < wordResult.length; i++) {
            wordResult[i] =  charJ[i]+"   "+charA[i]+"   "+charV[i]+"   "+charA[i];
        }
       return wordResult;
    }

    private static String[] upperChar(Character inputChar){

        String[] charJ = {
                "  +++",
                "    +",
                "    +",
                "+   +",
                " +++ "};

        String[] charA = {
                "  +  ",
                " + + ",
                "+   +",
                "+++++",
                "+   +"};

        String[] charV = {
                "+       +",
                " +     + ",
                "  +   +  ",
                "   + +   ",
                "    +    "};

        String[] charSpace = {
                "         ",
                "         ",
                "         ",
                "         ",
                "         "};

//        String[] bigChar = {"","","","",""};
        String[] bigChar ;

        switch(inputChar)
        {
            case 'J':
                bigChar = charJ;
                break;
            case 'A':
                bigChar = charA;
                break;
            case 'V':
                bigChar = charV;
                break;
            default:
                bigChar = charSpace;
        }
        return bigChar;
    }

}
