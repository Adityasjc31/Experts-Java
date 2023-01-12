public class ObjectPassing
{
   int i,j;
   public ObjectPassing(int i,int j)
   {
       this.i=i;
       this.j=j;
   }
   
   public boolean compare(ObjectPassing obj)
   {
        if (obj.i == i && obj.j == j)
        {
            return true;
        }
        return false;
   }
   
   public static void main(String[] args) 
   {
      ObjectPassing obj = new ObjectPassing(45, 55);
      ObjectPassing obj1 = new ObjectPassing(45, 55);
      if (obj.compare(obj1)) 
      {
         System.out.println("Equal");
      } 
      else
      {
         System.out.println("Not Equal");
      }
   }
}