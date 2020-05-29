/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpracticeexercise;

import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class MyLibrary {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t Welcome To The HLSCC Library");
        System.out.println("\t\t\t=================================");
        System.out.println("");

        //create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("How many books do you want to checkout ? ");
        int numberOfBooks = input.nextInt();

        //flush the buffer or stream
        input.nextLine();

        Book[] library = new Book[numberOfBooks];
        //create variables to accept author and title
        String author, title;

        for (int i = 0; i < library.length; i++) {
            System.out.print("What is the author's name? ");
            author = input.nextLine();

            System.out.print("What is the title of the book? ");
            title = input.nextLine();

            //Book library = new Book(author, title);
            library[i] = new Book(author, title);
        }

        /* for (int i = 0; i < library.length; i++) {
        System.out.println("From The Getter");
        System.out.println("Title " + library[i].getTitle()
        + " and Author " + library[i].getAuthor());
        }*/
        //loop to print the library        
        for (int i = 0; i < library.length; i++) {
            library[i].displayBookDetails();
        }

        //close the stream
        input.close();

    }

}
