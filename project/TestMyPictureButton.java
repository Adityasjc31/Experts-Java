package project;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
class TestMyPictureButton extends JFrame
{
    public TestMyPictureButton()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        MyPictureButton p1 = new MyPictureButton("expPic1.jpg",180,200);
        add(p1);
        pack();
    }
}