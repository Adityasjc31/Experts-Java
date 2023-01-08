class Q6 extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter path");
        String s=sc.nextLine();
        int i=s.lastIndexOf('\\');
        System.out.println("Path : "+(s.substring(0,i+1)));
        int i1=s.lastIndexOf('.');
        System.out.println("File Name : "+(s.substring(i+1,i1)));
        System.out.println("Extension : "+(s.substring(i1+1)));
    }
}