
// Creating a Project on Library Management System using java ..

import java.util.Scanner;

class Library{

    String [] books;   // Attributes/Properties
    int no_of_books;

    Library(){
        books = new String [100];  //Create Constructor ..
        no_of_books=0;
    }

    void addBook(String book){
        books[no_of_books]=book;
        no_of_books+=1;
        System.out.println("Book Added Successfully ..");
    }

    void issueBook(String book){

        for(int i=0 ; i<=books.length; i++){
            if(books[i]==book){
                books[i]=null;
                System.out.println("Your book has been issued ..");
                break;
            }
            else{
                System.out.println(book + " is not available in library ..");
                break;
            }
        }}

    void returnBook(String book){

        books[no_of_books]=book;
        no_of_books+=1;
        System.out.println("Book return Successfully ..");
    }

    void ShowBook(){
        for(String book : books){
            if(book == null){
                continue;
            }
            System.out.println(book);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Library obj = new Library();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Public Library (:");

        while (true) {
            System.out.println("\nChoose the above\n\n1 - Add Book\n2 - Issue Book\n3 - Return Book\n4 - Show Books\n\nPress 0 for Exit\n");
            System.out.print("Your Selection :");
            int slc = inp.nextInt();
            if (slc == 1) {
                System.out.println("Enter the name of book which u wanna add in Library :");
                String b_name = inp.next();
                b_name = b_name.toLowerCase();
                obj.addBook(b_name);
            }
            else if (slc == 2) {
                System.out.println("Enter the name of book which u wanna issue from Library :");
                String b_name = inp.next();
                b_name = b_name.toLowerCase();
                obj.issueBook(b_name);
            }
            else if (slc ==3){
                System.out.println("Enter the name of book which u wanna return in Library :");
                String b_name = inp.next();
                b_name = b_name.toLowerCase();
                obj.returnBook(b_name);
            }
            else if (slc ==4){
                obj.ShowBook();
            }
            else if(slc==0){
                break;
            }
            else
            {
                System.out.println("Select the Correct input");
            }
        }

    }
}
                                                //*----COMPLETE----*
