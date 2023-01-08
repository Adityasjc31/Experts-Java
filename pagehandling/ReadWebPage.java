package  pagehandling;
import java.io.*;
import java.net.*;

class ReadWebPage
{
    public static void main(String args[]) throws MalformedURLException, IOException 
    {

        BufferedReader br = null;

        try 
        {

            URL url = new URL("https://www.hindikunj.com/2018/09/ekta-hindi.html");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) 
            {
                FileWriter f = new FileWriter("E:\\text.txt",true);
                BufferedWriter bw = new BufferedWriter(f);
                PrintWriter pr = new PrintWriter(bw);
                pr.println(line);
                pr.close();
                bw.close();
                f.close();
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        } 
        finally 
        {
            if (br != null) 
            {
                br.close();
            }
        }
    }
}