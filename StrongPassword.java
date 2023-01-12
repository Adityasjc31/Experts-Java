import java.util.Scanner;

public class StrongPassword {
    static String numbers = "0123456789";
    static String lower_case = "abcdefghijklmnopqrstuvwxyz";
    static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String special_characters = "!@#$%^&*()-+";

    public static int minimumNumber(int n, String password) {
        int nums = 1;
        int smallAlphas = 1;
        int capitalAlphas = 1;
        int specialCharacters = 1;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(numbers.indexOf(ch + "") > -1)
            {
                nums =0;
            }
            else if(lower_case.indexOf(ch + "") >  -1)
            {
                smallAlphas=0;
            }
            else if (upper_case.indexOf(ch + "") >  -1) 
            {
                capitalAlphas=0;
            }
            else if (special_characters.indexOf(ch + "") > -1) 
            {
                specialCharacters=0;
            }
        }
        int required =  nums+smallAlphas+capitalAlphas+specialCharacters;
        if (n< 6) {
            if (required < (6-n)) {
                return 6-n;
            }
        }
        return required;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of password : ");
        int n = sc.nextInt();
        System.out.print("Enter password : ");
        String password = sc.next();
        System.out.println("Number of characters to be added : "+minimumNumber(n, password));
        sc.close();
    }
}
