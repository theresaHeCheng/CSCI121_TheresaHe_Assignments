import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Code from tutorial at https://www.youtube.com/watch?v=dfhmTyRTCSQ&t=11s&ab_channel=BroCode

public class Calculator implements ActionListener
{
    //Initializing GUI
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, multiButton, divideButton;
    JButton decimalButton, equalButton, deleteButton, clearButton, negButton;
    JPanel panel;
    Font myFont = new Font("Courier New", Font.BOLD,30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    //Calculator constructor
    Calculator()
    {
        //App window
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        //Text box for numbers and calculations
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        //Setting function button labels
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divideButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        deleteButton = new JButton("DEL");
        clearButton = new JButton("CLR");
        negButton = new JButton("(-)");

        //Adding function buttons to functionButtons array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = deleteButton;
        functionButtons[7] = clearButton;
        functionButtons[8] = negButton;

        //Adds ActionListener to function buttons
        for(int i = 0; i < 9; i++)
        {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        //Sets number buttons to numbers and adds ActionListeners
        for(int i = 0; i < 10; i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        //Setting the bounds of the neg, delete, and clear button
        negButton.setBounds(50, 430, 100, 50);
        deleteButton.setBounds(150, 430, 100, 50);
        clearButton.setBounds(250, 430, 100, 50);

        //Panel that'll hold number and function buttons
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.PINK);

        //Adds buttons from left to right
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divideButton);

        //Adding panel and buttons to frame (calculator window)
        frame.add(panel);
        frame.add(negButton);
        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        //Starts calculator app
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Puts number in the text box when pressed
        for(int i = 0; i < 10; i++)
        {
            if(e.getSource() == numberButtons[i])
            {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        //Puts decimal into text box when pressed
        if(e.getSource() == decimalButton)
        {
            textField.setText(textField.getText().concat("."));
        }

        //When pressed, the next number pressed in and then the equal button
        // is pressed, the previous and next value will be added together
        if(e.getSource() == addButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        //When pressed, the next number pressed in and then the equal button
        // is pressed, the previous and next value will be subtracted together
        if(e.getSource() == subButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        //When pressed, the next number pressed in and then the equal button
        // is pressed, the previous and next value will be multiplied together
        if(e.getSource() == multiButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        //When pressed, the next number pressed in and then the equal button
        // is pressed, the previous and next value will be divided together
        if(e.getSource() == divideButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        //When pressed, will show the results of the two previous numbers and the
        //operator
        if(e.getSource() == equalButton)
        {
            num2 = Double.parseDouble(textField.getText());

            switch(operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;
        }

        //Clears the text box entirely
        if(e.getSource() == clearButton)
        {
            textField.setText("");
        }

        //Deletes only on number within the text box
        if(e.getSource() == deleteButton)
        {
            String string = textField.getText();
            textField.setText("");
            textField.setText("");
            for(int i = 0; i < string.length() - 1; i++)
            {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }

        //Turns the number into a negative
        if(e.getSource() == negButton)
        {
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            textField.setText(String.valueOf(temp));
        }
    }
}
