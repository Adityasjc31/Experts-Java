import java.util.*;
class Library
{
    Scanner sc = new Scanner(System.in);
    int acc_num;String title,author;
    void input()
    {
        System.out.println("Enter accession Book Number");acc_num=sc.nextInt();
        System.out.println("Enter Title of the Book");title=sc.nextLine()+sc.nextLine();
        System.out.println("Enter the author Name");author=sc.nextLine();
    }

    void compute()
    {
        System.out.println("Enter the number of days late given");int la=sc.nextInt();
        System.out.println("Fine = "+(la*2));
    }

    void display()
    {
        System.out.println("Accession Number\tTitle\t\t\tAuthor");
        System.out.println(acc_num+"\t\t "+title+"\t"+author);
    }

    public static void main()
    {
        Library l = new Library();
        l.input();
        l.compute();
        l.display();
    }
}