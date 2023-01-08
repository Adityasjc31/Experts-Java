package tempClass12;

class Number
{
    protected int n;
    Number(int nn){
        n=nn;
    }
    
    int factorial(int a){
        int f=1;
        for(int x=1;x<a;x++){
            f=f*x;
        }
        return f;
    }
    
    void display(){
        System.out.println("Number of terms : "+n);
    }
}