package Gui.trying;

import java.awt.*;
public class StartupUI
{
    public static void main(String args [])
    {
        EventQueue.invokeLater(() -> 
                {
                    CentralProcessingUnit cpu = new CentralProcessingUnit();
                    cpu.setVisible(true);
                }
            );
    }
}