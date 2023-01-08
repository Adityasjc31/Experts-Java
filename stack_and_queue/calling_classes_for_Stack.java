package stack_and_queue;

import java.util.*;
public class calling_classes_for_Stack
{
    public static void Stack_0_index_main()
    {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int n = sc.nextInt();
        Stack_0_index ob = new Stack_0_index(n);

        do
        {
            System.out.println("Menu\n1 - To add in Stack\n2 - To extract value from stack\n3 - To see which value is going to be extracted\n4 - Exit");
            System.out.println("Enter your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 : 
                System.out.println("Enter value to be added");
                n=sc.nextInt();
                ob.push(n);
                break;

                case 2 :
                System.out.println("Extacted value : "+ob.pop());
                break;

                case 3:
                System.out.println("Value which will extracted "+ob.top());

                case 4:
                System.out.println("Exited");
                break;

                default : 
                System.out.println("Wrong Choice");
            }
        }
        while(ch!=4);
    }

    public static void Stack__1_index_main()
    {

        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int n = sc.nextInt();
        Stack_1_index ob = new Stack_1_index(n);

        do
        {
            System.out.println("Menu\n1 - To add in Stack\n2 - To extract value from stack\n3 - To see which value is going to be extracted\n4 - Exit");
            System.out.println("Enter your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 : 
                System.out.println("Enter value to be added");
                n=sc.nextInt();
                ob.push(n);
                break;

                case 2 :
                System.out.println("Extacted value : "+ob.pop());
                break;

                case 3:
                System.out.println("Value which will extracted "+ob.top());

                case 4:
                System.out.println("Exited");
                break;

                default : 
                System.out.println("Wrong Choice");
            }
        }
        while(ch!=4);
    }
}