package Gui.trying;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.*;

public class HideUnhide
{
    public static void hide(String file)throws Exception
    {
        Path p = Paths.get(file);
        DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
        Files.setAttribute(p, "dos:hidden", true);
        //         System.out.println(dos.isHidden());
    }

    public static void unhide(String file)throws Exception
    {
        Path p = Paths.get(file);
        DosFileAttributes dos = Files.readAttributes(p, DosFileAttributes.class);
        Files.setAttribute(p, "dos:hidden", false);
        //         System.out.println(dos.isHidden());
    }
}