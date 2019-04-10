import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TicTacToe implements ActionListener
{

    JButton b[] = new JButton[9];
    JFrame jf;
    JPanel jp;
    JLabel turn,l1;
    int n = 1;
    Font f1 = new Font("AquaBase",Font.BOLD+Font.ITALIC,23);
    TicTacToe()
    {
        jf = new JFrame("Tic Tac Toe Game.");
        jf.setVisible(true);
        jf.setSize(600,600);
        jf.setLayout(null);

        jp = new JPanel();
        jp.setBounds(50,100,400,400);
        jf.add(jp);

        turn = new JLabel("\nPlayer 1 Turn");
        turn.setBounds(20,20,400,50);
        turn.setFont(f1);
        jf.add(turn);

        l1 = new JLabel("\nPlayer 1 Symbol = 'X'  Player 2 Symbol = 'O'");
        l1.setBounds(0,4,500,50);
        jf.add(l1);

        GridLayout gl = new GridLayout(3,3);
        jp.setLayout(gl);

        for(int i=0;i<b.length;i++)
        {
            b[i] = new JButton(" ");
            b[i].setSize(new Dimension(10,10));
            b[i].setBorder(BorderFactory.createLineBorder(new Color(236,100,230),3));
            jp.add(b[i]);

            b[i].addActionListener(this);

        }
    }





    public static void main(String args[])
    {
        new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(n%2 != 0)
        {
            JButton jb = (JButton)e.getSource();
            if(jb.getLabel() == " ")
            {
                jb.setLabel("X");
                n++;

            }
            turn.setText("Player 2 Turn");

        }
        else
        {
            JButton jb = (JButton)e.getSource();
            if(jb.getLabel() == " " ) {
                jb.setLabel("O");
                n++;

            }
            turn.setText("Player 1 Turn");
        }

        if(b[0].getLabel() == "X" && b[1].getLabel() == "X" &&b[2].getLabel() == "X" ||
           b[3].getLabel() == "X" && b[4].getLabel() == "X" &&b[5].getLabel() == "X" ||
           b[6].getLabel() == "X" && b[7].getLabel() == "X" &&b[8].getLabel() == "X" ||
           b[0].getLabel() == "X" && b[3].getLabel() == "X" &&b[6].getLabel() == "X" ||
           b[1].getLabel() == "X" && b[4].getLabel() == "X" &&b[7].getLabel() == "X" ||
           b[2].getLabel() == "X" && b[5].getLabel() == "X" &&b[8].getLabel() == "X" ||
           b[0].getLabel() == "X" && b[4].getLabel() == "X" &&b[8].getLabel() == "X" ||
           b[2].getLabel() == "X" && b[4].getLabel() == "X" &&b[6].getLabel() == "X" )
        {
            JOptionPane.showMessageDialog(null,"Player 1 Wins The Game");
            n = 1;


            for(int i = 0;i<b.length;i++)
            {
                b[i].setLabel(" ");
            }
            turn.setText("Player 1 Turn");
        }
        else if(b[0].getLabel() == "O" && b[1].getLabel() == "O" &&b[2].getLabel() == "O" ||
                b[3].getLabel() == "O" && b[4].getLabel() == "O" &&b[5].getLabel() == "O" ||
                b[6].getLabel() == "O" && b[7].getLabel() == "O" &&b[8].getLabel() == "O" ||
                b[0].getLabel() == "O" && b[3].getLabel() == "O" &&b[6].getLabel() == "O" ||
                b[1].getLabel() == "O" && b[4].getLabel() == "O" &&b[7].getLabel() == "O" ||
                b[2].getLabel() == "O" && b[5].getLabel() == "O" &&b[8].getLabel() == "O" ||
                b[0].getLabel() == "O" && b[4].getLabel() == "O" &&b[8].getLabel() == "O" ||
                b[2].getLabel() == "O" && b[4].getLabel() == "O" &&b[6].getLabel() == "O")
        {
            JOptionPane.showMessageDialog(null,"Player 2 Wins The Game");
            n = 1;


            for(int i = 0;i<b.length;i++)
            {
                b[i].setLabel(" ");
            }
            turn.setText("Player 1 Turn");
        }
        else
        {
            if(n == 10)
                JOptionPane.showMessageDialog(null,"The Game Is Draw");

            turn.setText("Player 1 Turn");
        }
        if(n == 10)
        {
            n = 1;


            for(int i = 0;i<b.length;i++)
            {
                b[i].setLabel(" ");
            }
        }

    }
}
