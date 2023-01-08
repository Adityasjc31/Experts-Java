class movieMagic extends A
{
    int year;
    String title;
    float rating;
    public movieMagic()
    {
        year=0;
        title="";
        rating=0.0f;
    }
    
    void accept()
    {
        System.out.println("Enter the year of release : ");
        year=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter title off the movie");
        title=sc.nextLine();
        System.out.println("Enter rating of "+title);
        rating=sc.nextFloat();
    }
    
    void display()
    {
        float r=rating;
        if(r>0.0 && r<=2.0)
        {
            System.out.println("Flop");
        }
        else if(r>2.0 && r<=3.4)
        {
            System.out.println("Semi - Hit");
        }
        else if(r>3.4 && r<=4.5)
        {
            System.out.println("Hit");
        }
        else
        {
            if(r>4.5 && r<5.0)
            {
                System.out.println("Super Hit");
            }
        }
    }
}