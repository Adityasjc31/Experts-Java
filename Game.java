import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Game extends JFrame implements ActionListener
{
    JLabel smaller,bigger;
    JTextField s,b;
    JButton setValue,gen;
    private int sm,bi;
    public Game()
    {
        setLayout(new FlowLayout());
        smaller = new JLabel("Lower Limit : ");
        s = new JTextField(12);
        bigger = new JLabel("Upper Limit : ");
        b = new JTextField(12);
        add(smaller);
        add(s);
        add(bigger);
        add(b);
        smaller.setFont(new Font("Serif", Font.BOLD, 20));
        bigger.setFont(new Font("Serif", Font.BOLD, 20));
        s.setFont(new Font("Serif", Font.BOLD, 20));
        b.setFont(new Font("Serif", Font.BOLD, 20));
        setValue = new JButton("SET");
        setValue.addActionListener(this);

        gen = new JButton("Generate");
        gen.addActionListener(this);
        setValue.setFont(new Font("Serif", Font.BOLD, 18));
        gen.setFont(new Font("Serif", Font.BOLD, 22));
        add(setValue);
        add(gen);
        setSize(354,203);
        setTitle("Random Generator");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt)
    {
        Object event = evt.getSource();
        if(event==setValue)
        {
            sm = Integer.parseInt(s.getText());
            bi = Integer.parseInt(b.getText());
        }
        else if(event==gen)
        {
            int r = randomRange(sm,bi);
            while(r==lastresult)
            {
                r = randomRange(sm,bi);
            }
            System.out.println("\fPlayer Number : "+r);
            lastresult = r;
        }
    }
    static int lastresult=0;
    public static int randomRange(int sm,int bi)
    {
        int diff = (bi-sm+1);
        int r = (int)((diff*Math.random())+sm);
        return r;
    }
}