package class17.hm;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String author;
    String title;
    String genre;
    int date;

    Book (String firstAuthor, String firstTitle, String firstGenre, int firstDate) {
        author = firstAuthor;
        title = firstTitle;
        genre = firstGenre;
        date = firstDate;
    }

    Book(String firstAuthor, String firstTitle, int firstDate){
            author=firstAuthor;
            title=firstTitle;
            date=firstDate;
    }

    void printInfo(){
        if(date<1950){
            System.out.println(author+" published a new book " +title+" in "+date);
        }else{
            System.out.println(author+" published a new book " +title+" in "+date+" , genre is "+genre);
        }
    }

    public static void main(String[] args) {
        Book firstBook=new Book("Antoine de Saint-Exupéry", "The Little Prince", "Novella", 1943);
        firstBook.printInfo();

        Book secondBook=new Book("Ernest Hemingway","The Old Man and the Sea",1952);
        secondBook.printInfo();
    }

    }
