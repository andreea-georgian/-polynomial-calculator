import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class View{
    JFrame frame = new JFrame("Polynom Calculator");
    JPanel panel1 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JPanel panel121 = new JPanel();
    JPanel panel122 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel31 = new JPanel();
    JPanel panel32 = new JPanel();
    JPanel panel = new JPanel();

    JLabel calculator = new JLabel("Polynomial Calculator");
    JLabel firstL = new JLabel("First Polynomial = ");
    JLabel secondL = new JLabel("Second Polynomial = ");
    JLabel resultL = new JLabel("Result: ");
    JTextField firstTF = new JTextField();
    JTextField secondTF = new JTextField();
    JTextField resultTF = new JTextField();

    JButton multiplicate = new JButton("Multiplicate");
    JButton divide = new JButton("Divide");
    JButton addd = new JButton("Add");
    JButton substract = new JButton("Substract");
    JButton integrate = new JButton("Integrate");
    JButton derivate = new JButton("Derivate");

    JButton nr1 = new JButton("1");
    JButton nr2 = new JButton("2");
    JButton nr3 = new JButton("3");
    JButton nr4 = new JButton("4");
    JButton nr5 = new JButton("5");
    JButton nr6 = new JButton("6");
    JButton nr7 = new JButton("7");
    JButton nr8 = new JButton("8");
    JButton nr9 = new JButton("9");
    JButton nr0 = new JButton("0");

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton inmultire = new JButton("*");
    JButton putere = new JButton("^");
    JButton punct = new JButton(".");
    JButton x = new JButton("x");
    JButton del = new JButton("del");

    public View () {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(340, 400);
        frame.setLocation(600, 200);
        panel.setLayout(new GridLayout(3, 1));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel11.setLayout(new BoxLayout(panel11, BoxLayout.X_AXIS));
        panel12.setLayout(new GridLayout(1, 2));
        panel121.setLayout(new GridLayout(3, 1));
        panel122.setLayout(new GridLayout(3, 1));
        panel2.setLayout(new GridLayout(3, 2));
        panel3.setLayout(new GridLayout(1, 2));
        panel31.setLayout(new GridLayout(3, 3));
        panel32.setLayout(new GridLayout(3, 3));

        panel1.setBackground(new Color(243, 177, 240, 198));
        panel11.setBackground(new Color(243, 177, 240, 198));
        panel121.setBackground(new Color(243, 177, 240, 198));
        panel122.setBackground(new Color(243, 177, 240, 198));
        multiplicate.setBackground(new Color(234, 255, 255));
        divide.setBackground(new Color(234, 255, 255));
        addd.setBackground(new Color(234, 255, 255));
        substract.setBackground(new Color(234, 255, 255));
        integrate.setBackground(new Color(234, 255, 255));
        derivate.setBackground(new Color(234, 255, 255));
        nr1.setBackground(new Color(255, 255, 187));
        nr2.setBackground(new Color(255, 255, 187));
        nr3.setBackground(new Color(255, 255, 187));
        nr4.setBackground(new Color(255, 255, 187));
        nr5.setBackground(new Color(255, 255, 187));
        nr6.setBackground(new Color(255, 255, 187));
        nr7.setBackground(new Color(255, 255, 187));
        nr8.setBackground(new Color(255, 255, 187));
        nr9.setBackground(new Color(255, 255, 187));
        nr0.setBackground(new Color(255, 255, 187));
        plus.setBackground(new Color(196, 255, 196));
        minus.setBackground(new Color(196, 255, 196));
        inmultire.setBackground(new Color(196, 255, 196));
        putere.setBackground(new Color(196, 255, 196));
        punct.setBackground(new Color(196, 255, 196));
        x.setBackground(new Color(196, 255, 196));
        del.setBackground(new Color(243, 177, 240));

        resultTF.setEditable(false);

        panel11.add(calculator);
        panel121.add(firstL);
        panel121.add(secondL);
        panel121.add(resultL);
        panel122.add(firstTF);
        panel122.add(secondTF);
        panel122.add(resultTF);
        panel12.add(panel121);
        panel12.add(panel122);

        panel2.add(addd);
        panel2.add(substract);
        panel2.add(multiplicate);
        panel2.add(divide);
        panel2.add(derivate);
        panel2.add(integrate);

        panel31.add(nr1);
        panel31.add(nr2);
        panel31.add(nr3);
        panel31.add(nr4);
        panel31.add(nr5);
        panel31.add(nr6);
        panel31.add(nr7);
        panel31.add(nr8);
        panel31.add(nr9);
        panel32.add(nr0);
        panel32.add(plus);
        panel32.add(minus);
        panel32.add(inmultire);
        panel32.add(putere);
        panel32.add(punct);
        panel32.add(x);
        panel32.add(del);

        panel1.add(panel11);
        panel1.add(panel12);
        panel3.add(panel31);
        panel3.add(panel32);
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        frame.add(panel);

        frame.setVisible(true);
    }

    void addNr1Listener (ActionListener nr1Listener) {nr1.addActionListener(nr1Listener);}
    void addNr2Listener (ActionListener nr2Listener) {nr2.addActionListener(nr2Listener);}
    void addNr3Listener (ActionListener nr3Listener) {nr3.addActionListener(nr3Listener);}
    void addNr4Listener (ActionListener nr4Listener) {nr4.addActionListener(nr4Listener);}
    void addNr5Listener (ActionListener nr5Listener) {nr5.addActionListener(nr5Listener);}
    void addNr6Listener (ActionListener nr6Listener) {nr6.addActionListener(nr6Listener);}
    void addNr7Listener (ActionListener nr7Listener) {nr7.addActionListener(nr7Listener);}
    void addNr8Listener (ActionListener nr8Listener) {nr8.addActionListener(nr8Listener);}
    void addNr9Listener (ActionListener nr9Listener) {nr9.addActionListener(nr9Listener);}
    void addNr0Listener (ActionListener nr0Listener) {nr0.addActionListener(nr0Listener);}

    void addAdddListener (ActionListener adddListener) {addd.addActionListener(adddListener);}
    void addSubstractListener (ActionListener substractListener) {substract.addActionListener(substractListener);}
    void addMultiplicateListener (ActionListener multiplicateListener) {multiplicate.addActionListener(multiplicateListener);}
    void addDivideListener (ActionListener divideListener) {divide.addActionListener(divideListener);}
    void addDerivateListener (ActionListener derivateListener) {derivate.addActionListener(derivateListener);}
    void addIntegrateListener (ActionListener integrateListener) {integrate.addActionListener(integrateListener);}

    void addPlusListener (ActionListener plusListener) {plus.addActionListener(plusListener);}
    void addMinusListener (ActionListener minusListener) {minus.addActionListener(minusListener);}
    void addInmultireListener (ActionListener inmultireListener) {inmultire.addActionListener(inmultireListener);}
    void addPutereListener (ActionListener putereListener) {putere.addActionListener(putereListener);}
    void addPunctListener (ActionListener punctListener) {punct.addActionListener(punctListener);}
    void addXListener (ActionListener xListener) {x.addActionListener(xListener);}
    void addDelListener (ActionListener delListener) {del.addActionListener(delListener);}

    void addFirstListener(MouseListener firstListener) {firstTF.addMouseListener(firstListener);}
    void addSecondListener(MouseListener secondListener) {secondTF.addMouseListener(secondListener);}
}
