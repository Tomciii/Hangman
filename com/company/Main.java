package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    // HangMan
    // Snake
    // Lottery

    // - User Input Driven
    // - You gotta guess the right characters to win hangman
    // - There's a certain amount of allowed mistakes
    // - Win / Lose -> Play again -> or Quit game

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the HangMan game!");
        Scanner scan = new Scanner(System.in);

        String input = "";
        Random random = new Random();
        int mistakesCount = 0;
        int maxMistakes = 10;
        boolean match;
        boolean wonGame;
        boolean lostGame;
        boolean checkPlayAgain = false;
        Renderer renderer = new Renderer();

        FileReader fileReader = new FileReader("words.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] possibleWords = readLines("words.txt");
        bufferedReader.close();

        String chosenWord = possibleWords[random.nextInt(possibleWords.length)];
        String secretword = returnSecretWord(chosenWord);

        do
        {

            System.out.println(secretword);

            System.out.println("Guess a character, bro!");
            input = scan.nextLine().toLowerCase();

            match = checkInput(input, chosenWord);

            if (match == true)
            {
                secretword = updateWord(input, secretword, chosenWord);
            }
            else
            {
                mistakesCount++;
            }

            renderer.drawHangman(mistakesCount);

            wonGame = checkWin(chosenWord, secretword);
            lostGame = checkLoss(maxMistakes, mistakesCount);

            System.out.println("Mistakes: " + mistakesCount);

            if (lostGame || wonGame)
            {
                checkPlayAgain = checkPlayAgain(lostGame, wonGame, scan, chosenWord);
            }

            if (checkPlayAgain == true)
            {
                lostGame = false;
                wonGame = false;
                checkPlayAgain = false;
                chosenWord = possibleWords[random.nextInt(possibleWords.length)];
                secretword = returnSecretWord(chosenWord);
                mistakesCount = 0;
            }

        } while (!input.equals("quit"));
    }

    private static boolean checkPlayAgain(boolean lostGame, boolean wonGame, Scanner scan, String word)
    {
        if (lostGame)
        {
            System.out.println("You've lost the game!");
        }
        else if (wonGame)
        {
            System.out.println("You've won the game!");
        }
        System.out.println("The secret word was: " + word);
        String input;
        do
        {
            System.out.println("Do you wanna play again? Y/N");
            input = scan.nextLine().toLowerCase();

            if (input.equals("n"))
            {
                System.exit(0);
            }

        } while (!input.equals("y"));

        if (input.equals("y"))
        {
            System.out.println("Let's Play Again!");
            return true;
        }

        System.exit(0);
        return false;
    }

    private static boolean checkLoss(int mistakesCount, int maxMistakes)
    {
        if (mistakesCount == maxMistakes)
        {
            return true;
        }
        return false;
    }

    private static String updateWord(String input, String secretWord, String chosenWord)
    {
        char inputChar;
        try
        {
            inputChar = input.charAt(0);
        }
        catch (Exception e)
        {
            inputChar = ' ';
        }

        String result = "";

        for ( int i = 0; i < chosenWord.length(); i++)
        {
            if (inputChar == chosenWord.charAt(i))
            {
                result += inputChar;
            }
            else
            {
                result += secretWord.charAt(i);
            }
        }

            return result;
    }

    private static boolean checkWin(String secretWord, String chosenWord)
    {
        if (secretWord.equals(chosenWord))
        {
            return true;
        }
        return false;
    }

    private static boolean checkInput(String input, String secretWord)
    {
        char inputChar = input.charAt(0);

        for (int i = 0; i < secretWord.length(); i++)
        {
            if (secretWord.charAt(i) == inputChar)
            {
                return true;
            }
        }

        return false;
    }

    private static String returnSecretWord(String chosenWord)
    {
        String result = "";

         for (int i = 0; i < chosenWord.length(); i++)
         {
             result += "_";
         }

        return result;
    }

    public static String[] readLines(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }
}