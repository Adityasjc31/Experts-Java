package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gr extends JFrame implements ActionListener
{
    JPopupMenu jp;String a="choto or namansh";
    public Gr()
    {
        in();
        PM();
    }

    public void in()
    {
        JButton jb = new JButton("Quit");
        jb.addActionListener(this);
        jb.setMnemonic(KeyEvent.VK_Q);
        jb.setBackground(Color.gray);
        jb.setToolTipText("Close");

        ImageIcon im1 = new ImageIcon("C:/Program Files/Windows Sidebar/Gadgets/RSSFeeds.Gadgeticon.png");

        JButton jb1 = new JButton("Hello");//,im1);
        jb1.setMnemonic(KeyEvent.VK_H);
        jb1.addActionListener(this);

        //ImageIcon im = new ImageIcon("C:/Program Files/Windows Sidebar/Gadgets/SlideShow.Gadget/icon.png");
        JButton jb2 = new JButton("Input");
        jb2.setMnemonic(KeyEvent.VK_I);
        jb2.addActionListener(this);

        JButton jb3 = new JButton("Java Compiler");
        jb3.addActionListener(this);
        jb3.setMnemonic(KeyEvent.VK_C);

        JButton jb4 = new JButton("Java Interpeter");
        jb4.addActionListener(this);
        jb4.setMnemonic(KeyEvent.VK_T);

        JButton jb5 = new JButton("Image");
        jb5.addActionListener(this);
        jb5.setMnemonic(KeyEvent.VK_T);

        cl(jb,jb1,jb2,jb3,jb4,jb5);

        ImageIcon ic = new ImageIcon("C:/Program Files (x86)/Windows Sidebar/Gadgets/PicturePuzzle.Gadget/Images/9.png");
        setIconImage(ic.getImage());
        setTitle("Aditya JFrame");
        setSize(600,100);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void PM()
    {
        jp=new JPopupMenu();

        JMenuItem j1 = new JMenuItem("Maximize");
        j1.addActionListener(this);

        JMenuItem j2 = new JMenuItem("Minimize");
        j2.addActionListener(this);

        JMenuItem j3 = new JMenuItem("Restore");
        j3.addActionListener(this);
        
        JMenuItem j4= new JMenuItem(a);
        j4.addActionListener(this);
        
        addMouseListener(new MouseAdapter()
            {
                public void mouseReleased(MouseEvent e)
                {
                    jp.show(e.getComponent(),e.getX(),e.getY());
                }
            });
        jp.add(j1);
        jp.add(j2);
        jp.add(j3);
        jp.add(j4);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Quit"))
        {
            System.exit(0);
        }
        else if(s.equals("Hello"))
        {
            JOptionPane.showMessageDialog(null,"Hello Friends Chai pilo","",JOptionPane.PLAIN_MESSAGE);
        }
        else if(s.equals("Input"))
        {
            String s1 = JOptionPane.showInputDialog("Write something in the Dialog box .....");
            char ch = s1.charAt(0);
            if(Character.isLetterOrDigit(ch) || Character.isSpaceChar(ch)&&Character.isLetterOrDigit(s1.charAt(1)))
                JOptionPane.showMessageDialog(null,s1);
        }
        else if(s.equals("Java Compiler"))
        {
            UIManager.put("Option.showMessageDialog",new Font("Lucida Console",Font.BOLD,36)
            );
            JOptionPane.showMessageDialog(null,"Usage: java [-options] class [args...]\n"+
                "(to execute a class)\n"+
                "or  java [-options] -jar jarfile [args...]\n"+
                "(to execute a jar file)\n"+
                "where options include:\n"+
                "-d32          use a 32-bit data model if available\n"+
                "-d64          use a 64-bit data model if available\n"+
                "-client       to select the \"client\" VM\n"+
                "-server       to select the \"server\" VM -hotspot      is a synonym for the \"client\" VM  [deprecated]\n"+
                "The default VM is client.\n"+
                "                         \n"+
                "-cp <class search path of directories and zip/jar files> -classpath <class search path of directories and zip/jar files>\n"+
                "A ; separated list of directories, JAR archives, and ZIP archives to search for class files.\n"+
                "-D<name>=<value>\n"+
                "set a system property\n"+
                "-verbose:[class|gc|jni]\n"+
                "enable verbose output-version      print product version and exit -version:<value>\n"+
                "require the specified version to run -showversion  print product version and continue\n"+
                "-jre-restrict-search | -no-jre-restrict-search\n"+
                "include/exclude user private JREs in the version search\n"+
                "-? -help      print this help message\n"+
                "-X            print help on non-standard options -ea[:<packagename>...|:<classname>]\n"+
                "-enableassertions[:<packagename>...|:<classname>]\n"+
                "enable assertions with specified granularity -da[:<packagename>...|:<classname>]\n"+
                "-disableassertions[:<packagename>...|:<classname>]\n"+
                "disable assertions with specified granularity\n"+
                "-esa | -enablesystemassertions\n"+
                "enable system assertions\n"+
                "-dsa | -disablesystemasserions\n"+
                "disable system assertions\n"+
                "-agentlib:<libname>[=<options>] load native agent library <libname>, e.g. -agentlib:hprof\n"+
                "see also, -agentlib:jdwp=help and -agentlib:hprof=help -agentpath:<pathname>[=<options>]\n"+
                "load native agent library by full pathname -javaagent:<jarpath>[=<options>]\n"+
                "load Java programming language agent, see java.lang.instrument\n"+ 
                "-splash:<imagepath> show splash screen with specified image","",JOptionPane.PLAIN_MESSAGE);
        }
        else if(s.equals("Java Interpeter"))
        {
            JOptionPane.showMessageDialog(null,"Usage: java [-options] class [args...] (to execute a class)\n"+
                "or  java [-options] -jar jarfile [args...] (to execute a jar file) where options include:-d32 use a 32-bit data model if available\n"+
                "-d64          use a 64-bit data model if available -client       to select the \"client\" VM\n"+
                "-server       to select the \"server\" VM -hotspot      is a synonym for the \"client\" VM  [deprecated]\n"+
                "The default VM is client.\n"+
                "\n"+
                "-cp <class search path of directories and zip/jar files>\n"+
                "-classpath <class search path of directories and zip/jar files>\n"+
                "A ; separated list of directories, JAR archives,and ZIP archives to search for class files.\n"+
                "-D<name>=<value> set a system property\n"+
                "-verbose:[class|gc|jni]\n"+
                "enable verbose output\n"+
                "-version      print product version and exit-version:<value>\n"+
                "require the specified version to run\n"+
                "-showversion  print product version and continue\n"+
                "-jre-restrict-search | -no-jre-restrict-search\n"+
                "include/exclude user private JREs in the version search-? -help      print this help message\n"+
                "-X            print help on non-standard options\n"+
                "-ea[:<packagename>...|:<classname>]\n"+
                "-enableassertions[:<packagename>...|:<classname>]\n"+
                "enable assertions with specified granularity\n"+
                "-da[:<packagename>...|:<classname>]\n"+
                "-disableassertions[:<packagename>...|:<classname>]\n"+
                "disable assertions with specified granularity-esa | -enablesystemassertions\n"+
                "enable system assertions-dsa | -disablesystemassertions\n"+
                "disable system assertions\n"+
                "-agentlib:<libname>[=<options>]\n"+
                "load native agent library <libname>, e.g. -agentlib:hprof see also, -agentlib:jdwp=help and -agentlib:hprof=help\n"+
                "-agentpath:<pathname>[=<options>]\n"+
                "load native agent library by full pathname -javaagent:<jarpath>[=<options>]\n"+
                "load Java programming language agent, see java.lang.instrument\n"+
                "\n"+
                "-splash:<imagepath> show splash screen with specified image","",JOptionPane.PLAIN_MESSAGE);
        }
        else if(s.equals("Minimize"))
        {
            if(getExtendedState()!=JFrame.ICONIFIED)
            {
                setExtendedState(ICONIFIED);
            }
        }
        else if(s.equals("Restore"))
        {
            if(getExtendedState()!=JFrame.NORMAL)
            {
                setExtendedState(NORMAL);
            }
        }
        else if(s.equals("Maximize"))
        {
            if(getExtendedState()!=JFrame.MAXIMIZED_BOTH)
            {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        }
        else if(s.equals("Image"))
        {
            ImageIcon in = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg");
            JOptionPane.showMessageDialog(null,in,"",JOptionPane.PLAIN_MESSAGE);
        }
        else if(s.equals(a))
        {
            ImageIcon in = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
            JOptionPane.showMessageDialog(null,in,"",JOptionPane.PLAIN_MESSAGE);
        }

        repaint();
    }

    private void cl(JComponent...arg)
    {
        Container pa = getContentPane();
        GroupLayout gl = new GroupLayout(pa);
        pa.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(20)
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
            .addComponent(arg[4])
            .addComponent(arg[5])
        );

        gl.setVerticalGroup(gl.createParallelGroup()
            .addComponent(arg[0])
            .addGap(20)
            .addComponent(arg[1])
            .addComponent(arg[2])
            .addComponent(arg[3])
            .addComponent(arg[4])
            .addComponent(arg[5])
        );
        for(int x=0;x<=5;x++)
        { 
            gl.linkSize(arg[x]);
        }
        pack();
    }

    public static void main(String args [])
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    Gr e = new Gr();
                    e.setVisible(true);
                }
            });
    }
}