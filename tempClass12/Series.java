package tempClass12;

public class Series extends Number
{
    double sum;
    Series(int a){
        super(a);
        sum=0.0;
    }
    
    void calsum(){
        for(int x=1;x<super.n;x++){
            sum += super.factorial(x);
        }
    }
    
    void display(){
        super.display();
        System.out.println("Sum = "+sum);
    }
}