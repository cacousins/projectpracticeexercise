/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpracticeexercise;

/**
 *
 * @author cacousins
 */
public class Book {

    //instance variables
    private String author;
    private String title;
    private String bookID;
    //static variable
    private static int id = 100;

    //constructors
    public Book(String author, String myTitle) {
        this.author = author;
        this.title = myTitle;
        this.bookID = generateBookID();
        this.id++;
    }

    //getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String myAuthor) {
        if (myAuthor.toUpperCase().charAt(0) == 'X') {
            System.out.println("Sorry, no authors whose names start with X are allowed.");
            System.out.println("The author remains as " + this.author + ".");
        } else {
            this.author = myAuthor;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
        Method Name:
            Purpose:
            Accepts:
            Returns:
     */
    private String generateBookID() {
        /*String temp = "";
        temp+=this.author.charAt(2) + id;
        return temp;   */
        return this.author.charAt(2) + "" + id;
    }

    public void displayBookDetails() {
        System.out.println("The book id is: " + this.bookID);
        System.out.println("The title of this book is : " + this.title);
        System.out.println("The author of this book is : " + this.author + "\n");
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + ", "
                + "bookID=" + bookID + '}';
    }

}
