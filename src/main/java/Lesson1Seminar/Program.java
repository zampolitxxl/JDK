package Lesson1Seminar;

import org.example.GameWindow;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {

         ServerWindow serverWindow =   new ServerWindow();
         new ChatClientWindow(serverWindow);
        System.out.println("Method Program is over" );




        }
    }
