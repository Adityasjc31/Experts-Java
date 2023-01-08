import java.util.Scanner;
class Farketing
{
    static String Item[]={"BRUSH","PEN","COMB","APPLE","BROOM","GLASS","RULER","PENCIL","ERASER","PEPSI","CHIPS","FILE","SURF","CHALK","BAG","WALLET","PURSE","SHOE","TOMATO","POTATO","MANGO","PAINT","MAP","GRAPH","TAPE","ONION","SOAP","CARDS","WATCH","CUP"};
    static String bill[]=new String[100];  
    static int dd=0,ij=-1;
    static int price[]={25,10,30,40,50,60,10,10,5,40,20,50,60,20,1000,500,1100,2300,70,80,100,200,10,15,25,30,15,30,500,40};
    static int stock[]={3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000,3000};
    static String code[]={"A01","A02","A03","A04","A05","A06","A07","A08","A09","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20","A21","A22","A23","A24","A25","A26","A27","A28","A29","A30"};
    static String name,pno; 
    static double amt=0.0,total=0.0;

    public static void main()
    {  Farketing m= new Farketing();
        Scanner sc=new Scanner(System.in);
        int asa=2;

        do
        { 
            System.out.println("Would you like to shop or Modify stock?");
            System.out.println("Enter 1:to shop \nenter 2:to modify stock ");
            int ssss=sc.nextInt();
            if(ssss==1)
            {   System.out.println("\f");
                m.Customer_Details();
                m.shop();

            }
            else if(ssss==2)
            {System.out.println("\f");
                m.modify();
                System.out.println("\f");

            }

            else 
            { System.out.println("\f");
                System.out.println("Sorry you entered wrong code");

            }
            if(ssss!=2)
            {

                
                    
                System.out.println("THANK YOU FOR SHOPPING!! "+name); 
                System.out.println("Would another customer like to shop??");
                System.out.println("Enter 1:yes \nEnter 2:no");
                int xy=sc.nextInt();
                if(xy==1)
                {asa=1;
                    m.init();   
                    continue;}
                else 
                {System.out.println("\f");
                    System.out.println("BYE HAVE A NICE DAY");  break;}
            }

        }while(asa!=0);
    }

    public void init()
    {dd=0;ij=-1;name="";pno="";amt=0;total=0.0;
    }

    public void Print()
    {System.out.println("***********"); 
        System.out.println("Customer Name:"+name+"           Phone number:"+pno);
        System.out.println("***********\n*************");
        System.out.println("   Item code          Item name        Stock         quantity          amount");
        for(int i=0;i<=ij;i++)
        {System.out.println((i+1)+"."+bill[i]);}
        System.out.println("\n*************");
        System.out.println("Total amount="+total);
        System.out.println("Total GST=8%");    
        total+=(0.08*total);
        System.out.println("Amount payable="+total);
        System.out.println("***********"); 
    }

    public static void modify()
    {   Scanner sc=new Scanner(System.in);
        int x=0;
        do
        {System.out.println("Would you like to modify the stock?");
            System.out.println("PRESS 1 FOR YES AND 2 FOR NO");
            int c=sc.nextInt();
            if(c==1)
            {System.out.println("\tITEM MODIFICATION"); 
                System.out.println("***********");   
                System.out.println("Code       Item        Price     Stock");
                for(int ll=0;ll<30;ll++)
                {System.out.println(code[ll]+"    \t  "+Item[ll]+"    \t"+price[ll]+"   \t"+stock[ll] ); 
                }

                System.out.println("Which Item would you like to modify?");
                System.out.println("Please enter item code ");
                String s1=sc.next();
                for(int i=0;i<30;i++)
                {if(code[i].compareToIgnoreCase(s1)==0)
                    {System.out.println("Item:"+Item[i]+"      Price:"+price[i]+"     quantity:"+stock[i]);
                        System.out.println("What would you like to modify?");
                        System.out.println("Press 1 to modify stock quantity");
                        System.out.println("Press 2 to modify item price");
                        int c2=sc.nextInt();
                        switch(c2)
                        {case 1:
                            System.out.println("\fEnter new stock quantity of item");
                            int sq=sc.nextInt();
                            stock[i]=sq;
                            System.out.println("\f");    
                            break;
                            case 2:
                            System.out.println("Enter new price of item");
                            int psadsad=sc.nextInt();
                            price[i]=psadsad;
                            System.out.println("\f");    
                            break;
                            default:
                            System.out.println("Wrong choice");
                            System.out.println("Would you like to try again");
                            System.out.println("Enter 1 for yes or 2 for no");
                            int yyyy=sc.nextInt();
                            if(yyyy==1)
                            {x=0;
                                System.out.println("\f");    
                                continue;

                            }
                            else
                            {break;}
                        }
                    }
                }
            }
            else
            {break;}
        }
        while(x==0);

    }

    public static void Customer_Details()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("                 HELLO AND WELCOME TO AAROH'S SHOP ");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("Dear Customer Please Enter your Details");
        System.out.println("Please enter your name ");
        name=sc.nextLine();
        System.out.println("Please enter your phone number");
        pno=sc.next();

    }

    public static void shop()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tSHOPPING");
        int aata=-11;
        int q,ppp=0;

        do
        { 
            int k=0; 
            if(dd==1)
            {break;}
            System.out.println("Code       Item        Price      Stock");
            for(int ll=0;ll<30;ll++)
            {System.out.println(code[ll]+"    \t  "+Item[ll]+"    \t"+price[ll]+"   \t "+stock[ll] ); 
            }

            System.out.println("Enter Item code");
            String cod=sc.next();
            for(int y=0;y<30;y++)
            { 

                if(cod.equalsIgnoreCase(code[y]))
                { k++;
                    int xq=stock[y];
                    System.out.println("ITEM:"+Item[y]+"\tPrice:"+price[y]+" \tStock:"+stock[y]);
                    System.out.println("Enter quantity to be bought");
                    int cd=sc.nextInt();
                    if (cd<=stock[y])
                    {q=cd;
                        stock[y]-=cd;   
                        ij++;
                    }
                    else if(cd>stock[y]&&stock[y]!=0)
                    {q=stock[y];
                        stock[y]=0;   
                        System.out.println("Sorry we do not have "+cd+" quantity of "+Item[y]);
                        System.out.println("We only have "+xq+" such items \nSo we are giving you the entire stock ");
                        ij++;
                    }
                    else
                    {
                        System.out.println("Sorry "+Item[y]+" is out of stock \nPlease try again with new Item");
                        ppp=1;
                        q=0; 
                    }
                    if(q!=0) 
                    {amt=q*price[y];
                        bill[ij]="    "+code[y]+"\t\t"+Item[y]+"\t\t"+stock[y]+"\t\t"+q+"\t\t"+amt;
                        total+=amt;}       
                    continue;

                }
            }  
            if(k==0){   System.out.println("Sorry !  Wrong code \n Would you like to try again?");
                System.out.println("Enter 1:Yes \nEnter 2:No");
                int al=sc.nextInt();
                if(al==1)
                {System.out.println("\f");
                    continue;}
                else
                {  System.out.println("\f");
                    dd=1;break;}
            }  
            else if(k!=0)
            {System.out.println( "Would you like to buy more items ?");
                System.out.println("Enter 1:Yes \n Enter 2:No");
                int ak=sc.nextInt();
                if(ak==1)
                {System.out.println("\f");
                    continue;}
                else
                {  System.out.println("\f");
                    aata=0;}
            }

            System.out.print("\f");
            Farketing m=new Farketing();   
            m.Print();

        }while(aata!=0);

    }
}