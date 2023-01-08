class Q7 extends A
{
    public static void main(String args [])
    {
        System.out.println("Menu\n1-Prime Number\n2-Automorphic Number");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            Automorphic.main();
            break;
            case 2:
            Prime.main();
            break;
            default:
            System.out.println("Wrong Input");
        }
    }
}