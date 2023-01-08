package prelims;

class Highest extends Record
{
    int ind;
    Highest(int size)
    {
        super(size);
        ind=0;
    }
    
    void find()
    {
        //Finding the highest marks index
        for(int x=0;x<size;x++)
        {
            if(m[ind] < m[x])
            {
                ind=x;
            }
        }
    }
    
    void display()
    {
        //Printing the array elements
        super.display();
        //Printing the student name and marks who got the highest marks
        System.out.println("Name of the student who obtained the highest marks : "+n[ind]);
        System.out.println("Marks obtained by "+n[ind]+" is : "+m[ind]);
    }
}