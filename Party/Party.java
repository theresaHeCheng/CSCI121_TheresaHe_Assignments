import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*class invitation implements ActionListener
{
    JWindow window;
    public invitation()
    {
        window = new JWindow();
        window.setBackground(new Color(255, 204, 204));
        window.setSize(500, 400);
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Please come to my party!");

        JButton ok = new JButton("OK");
        ok.addActionListener(this);

        panel.add(label);
        window.add(panel);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        window.setVisible(false);
    }
}*/
public class Party
{
    int guests;
    public void setGuests(int g)
    {
        this.guests = g;
    }

    public int getGuests()
    {
        return guests;
    }

    public void displayInvitation()
    {
        //invitation invite = new invitation();
        System.out.println("Please come to my party!");
    }
}
