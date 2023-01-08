package school;

class Array_Market extends Reaiter
{
    protected static boolean b=true;
    protected static int n=30;
    protected static int in,d;
    protected static String []print=new String[30],printbill=new String[30];
    protected static double bill;
    protected static boolean lm=true;
    protected static String name,ph_no,address;
    protected static String tp="";
    protected static double t2=-1;
    protected static int p=-1;
    protected static String password;
    protected static String item[] = {
            "Chips","Chocolate","Shirt","Pen","Paper",
            "Pencil","Spices","Beverages","Wheat Flour","Cookware",
            "Sugar","Perfumes","Shampoo","Soap","Detergent",
            "School Bag","T-Shirt","Jeans","Jogger","Vegetables",
            "Fruits","Dry Fruits","Garments","Baggage","Books",
            "Milk","Toys","Shoes","Socks","Rice"
        };
    protected static double item_price[] = {
            10 ,10   ,499 ,11.5,3  ,
            5  ,49   ,99  ,199 ,699,
            499,99   ,25  ,10  ,40 ,
            99 ,899  ,699 ,999 ,50 ,
            159,299.5,99  ,9999,500,
            25 ,99   ,5999,499 ,699
        };
    protected static int item_quantity[] = {
            10000   ,10000  ,50000   ,90000   ,1000000,
            800000  ,900000 ,440550  ,458626  ,565145,
            100505  ,4361210,4739162 ,40253621,14363462,
            1009656 ,915565 ,43585   ,65474   ,544487,
            151585  ,4651987,445612  ,65214545,45446451,
            44646486,5421558,54547361,54644454,5465444
        };
    protected static String item_code[] = {
           "A0","A1","A2","A3","A4","A5",
           "A6","A7","A8","A9","A10","A11",
           "A12","A13","A14","A15","A16",
           "A17","A18","A19","A20","A21"
           ,"A22","A23","A24","A25","A26"
           ,"A27","A28","A29"
        };
}