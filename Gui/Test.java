package Gui;

import java.io.*;
class Test
{
    public static void main(String args[])throws Exception
    {
        FileWriter fw = new FileWriter("phones.bin");
        fw.close();
    }
}