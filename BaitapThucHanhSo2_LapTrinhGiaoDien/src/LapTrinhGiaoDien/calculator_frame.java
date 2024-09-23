package LapTrinhGiaoDien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator_frame extends JFrame implements ActionListener{

	private TextField tfResult;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnPlus, btnMinus, btnMultiply, btnDivide, btnClear, btnEquals;
    private double num1, num2;
    private char operator;

    public calculator_frame() {
        setLayout(new BorderLayout());

        tfResult = new TextField();
        add(tfResult, BorderLayout.NORTH);

        Panel buttonPanel = new Panel(new GridLayout(4, 4));

        btn7 = new Button("7");
        buttonPanel.add(btn7);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        buttonPanel.add(btn8);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        buttonPanel.add(btn9);
        btn9.addActionListener(this);

        btnDivide = new Button("/");
        buttonPanel.add(btnDivide);
        btnDivide.addActionListener(this);

        btn4 = new Button("4");
        buttonPanel.add(btn4);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        buttonPanel.add(btn5);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        buttonPanel.add(btn6);
        btn6.addActionListener(this);

        btnMultiply = new Button("*");
        buttonPanel.add(btnMultiply);
        btnMultiply.addActionListener(this);

        btn1 = new Button("1");
        buttonPanel.add(btn1);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        buttonPanel.add(btn2);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        buttonPanel.add(btn3);
        btn3.addActionListener(this);

        btnMinus = new Button("-");
        buttonPanel.add(btnMinus);
        btnMinus.addActionListener(this);

        btnClear = new Button("C");
        buttonPanel.add(btnClear);
        btnClear.addActionListener(this);

        btn0 = new Button("0");
        buttonPanel.add(btn0);
        btn0.addActionListener(this);

        btnEquals = new Button("=");
        buttonPanel.add(btnEquals);
        btnEquals.addActionListener(this);

        btnPlus = new Button("+");
        buttonPanel.add(btnPlus);
        btnPlus.addActionListener(this);

        add(buttonPanel, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        String action = evt.getActionCommand();
        if (action.equals("C")) {
            tfResult.setText("");
            num1 = 0;
            num2 = 0;
        } else if (action.equals("+")) {
            num1 = Double.parseDouble(tfResult.getText());
            operator = '+';
            tfResult.setText("");
        } else if (action.equals("-")) {
            num1 = Double.parseDouble(tfResult.getText());
            operator = '-';
            tfResult.setText("");
        } else if (action.equals("*")) {
            num1 = Double.parseDouble(tfResult.getText());
            operator = '*';
            tfResult.setText("");
        } else if (action.equals("/")) {
            num1 = Double.parseDouble(tfResult.getText());
            operator = '/';
            tfResult.setText("");
        } else if (action.equals("=")) {
            num2 = Double.parseDouble(tfResult.getText());
            switch (operator) {
                case '+':
                    tfResult.setText(Double.toString(num1 + num2));
                    break;
                case '-':
                    tfResult.setText(Double.toString(num1 - num2));
                    break;
                case '*':
                    tfResult.setText(Double.toString(num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        tfResult.setText("Error");
                    } else {
                        tfResult.setText(Double.toString(num1 / num2));
                    }
                    break;
            }
        } else {
            tfResult.setText(tfResult.getText() + action);
        }
    }

    public static void main(String[] args) {
        new calculator_frame();
    }


}
