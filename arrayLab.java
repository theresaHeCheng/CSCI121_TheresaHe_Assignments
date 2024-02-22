import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class arrayLab
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Getting initialized array size from user
        System.out.println("How many values would you like to input?");
        int arraySize = 0;
        if(input.hasNextInt())
        {
            arraySize = input.nextInt();
        }

        //Initialize array
        double[] array = new double[arraySize];

        //Input elements into array
        System.out.println("Enter your values.");
        for (int i = 0; i < arraySize; i++) {
            if (input.hasNextDouble())
            {
                array[i] = input.nextDouble();
            }
        }

        System.out.println(Arrays.toString(array));

        JFrame frame = new JFrame();
        frame.setSize(500, 400);

        JLabel text = new JLabel();
        text.setText(Arrays.toString(array));
        JPanel panel = new JPanel();
        panel.add(text);
        frame.add(panel);

        frame.show();
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }
}
