import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Age
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("age.dat"));
        int lines = in.nextInt();
        int[] first = new int[lines];
        int[] second = new int[lines];
        for(int i = 0; i<lines; i++)
        {
            
            
            
            
                first[i]=in.nextInt();
            
            
            
                second[i]=in.nextInt();
            
         
        }
        for(int i =0; i<lines; i++)
        {
            int counter = 0;
            //System.out.println(first[i] + " " + second[i]);
            while((second[i]-first[i])/(double)first[i] >= 0.15)
            {
                counter++;
                second[i]++;
                first[i]++;
            }
            System.out.println(counter);
            //System.out.println(first[i] + " " + second[i]);
           
           
        }
    }
}