import java.io.*;
import java.util.*;

public class Nonrepeating {
    public static int number_digit(List<Integer> arr) {
        int nonRepeating = 0;
        for (int elem = 0;elem < arr.size() ; elem++) {
            boolean repeat = false;
            for(int checkelem = 0;checkelem < arr.size() ; checkelem++)  {
                if (arr.get(checkelem) == arr.get(elem) && elem != checkelem) {
                    repeat = true;
                    break;
                }
            }
            nonRepeating = repeat ? 0 : arr.get(elem);
            if(!repeat){
                break;
            }
        }
        return nonRepeating;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> li = new ArrayList<Integer>();
        li.add(2);
        li.add(4);
        li.add(4);
        li.add(2);
        li.add(3);
    }
}