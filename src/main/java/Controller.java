import java.awt.event.*;

public class Controller {
    View theView;
    Model theModel;
    RemainderMessage rm;
    private int select = 0;
    private String numar = new String();
    private Monomial m = new Monomial();
    private int coef = 0;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addNr0Listener(new Listener0());
        this.theView.addNr1Listener(new Listener1());
        this.theView.addNr2Listener(new Listener2());
        this.theView.addNr3Listener(new Listener3());
        this.theView.addNr4Listener(new Listener4());
        this.theView.addNr5Listener(new Listener5());
        this.theView.addNr6Listener(new Listener6());
        this.theView.addNr7Listener(new Listener7());
        this.theView.addNr8Listener(new Listener8());
        this.theView.addNr9Listener(new Listener9());

        this.theView.addAdddListener(new AdddListener());
        this.theView.addSubstractListener(new SubstractListener());
        this.theView.addMultiplicateListener(new MultiplicateListener());
        this.theView.addDivideListener(new DivideListener());
        this.theView.addDerivateListener(new DerivateListener());
        this.theView.addIntegrateListener(new IntegrateListener());

        this.theView.addDelListener(new DelListener());
        this.theView.addPlusListener(new PlusListener());
        this.theView.addMinusListener(new MinusListener());
        this.theView.addInmultireListener(new InmultireListener());
        this.theView.addPutereListener(new PutereListener());
        this.theView.addPunctListener(new PunctListener());
        this.theView.addXListener(new XListener());

        this.theView.addFirstListener(new FirstListener());
        this.theView.addSecondListener(new SecondListener());
    }

    public void lastElement () {
        if (!numar.equals("")) {
            if (coef == 1)
                m.setGrad(Integer.parseInt(numar));
            else {
                m=new Monomial();
                m.setCoef(Integer.parseInt(numar));
                m.setGrad(0);
                if (select == 2) theModel.getP2().monomial.add(m);
                else theModel.getP1().monomial.add(m);
            }
        }
        else
            if (coef == 1)
                m.setGrad(1);
        numar = new String();
        coef = 0;
    }

    class Listener0 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '0');
            else theView.firstTF.setText(theView.firstTF.getText() + '0');
            numar = numar + '0';
        }
    }
    class Listener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '1');
            else theView.firstTF.setText(theView.firstTF.getText() + '1');
            numar = numar + '1';
        }
    }
    class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '2');
            else theView.firstTF.setText(theView.firstTF.getText() + '2');
            numar = numar + '2';
        }
    }
    class Listener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '3');
            else theView.firstTF.setText(theView.firstTF.getText() + '3');
            numar = numar + '3';
        }
    }
    class Listener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '4');
            else theView.firstTF.setText(theView.firstTF.getText() + '4');
            numar = numar + '4';
        }
    }
    class Listener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '5');
            else theView.firstTF.setText(theView.firstTF.getText() + '5');
            numar = numar + '5';
        }
    }
    class Listener6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '6');
            else theView.firstTF.setText(theView.firstTF.getText() + '6');
            numar = numar + '6';
        }
    }
    class Listener7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '7');
            else theView.firstTF.setText(theView.firstTF.getText() + '7');
            numar = numar + '7';
        }
    }
    class Listener8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '8');
            else theView.firstTF.setText(theView.firstTF.getText() + '8');
            numar = numar + '8';
        }
    }
    class Listener9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '9');
            else theView.firstTF.setText(theView.firstTF.getText() + '9');
            numar = numar + '9';
        }
    }
    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (numar.equals(""))
                m.setGrad(1);
            else
                m.setGrad(Integer.parseInt(numar));
            numar = new String();
            coef = 0;
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '+');
            else theView.firstTF.setText(theView.firstTF.getText() + '+');
        }
    }
    class MinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int ok = 0;
            if (select == 2) {
                if (theView.secondTF.getText().equals(""))
                    ok = 1;
            }
            else if (theView.firstTF.getText().equals(""))
                ok = 1;
            if (ok == 0) {
                if(numar.equals("")) {
                    m.setGrad(1);
                }
                else
                    m.setGrad(Integer.parseInt(numar));
                coef = 0;
            }
            numar = "-";
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '-');
            else theView.firstTF.setText(theView.firstTF.getText() + '-');
        }
    }
    class InmultireListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '*');
            else theView.firstTF.setText(theView.firstTF.getText() + '*');
        }
    }
    class PutereListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '^');
            else theView.firstTF.setText(theView.firstTF.getText() + '^');
        }
    }
    class PunctListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) theView.secondTF.setText(theView.secondTF.getText() + '.');
            else theView.firstTF.setText(theView.firstTF.getText() + '.');
        }
    }
    class XListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m = new Monomial();
            if (select == 2) {
                theView.secondTF.setText(theView.secondTF.getText() + 'x');
                theModel.getP2().monomial.add(m);
            }
            else {
                theView.firstTF.setText(theView.firstTF.getText() + 'x');
                theModel.getP1().monomial.add(m);
            }
            if (numar.equals(""))
                m.setCoef(1);
            else
                if (numar.equals("-"))
                    m.setCoef(-1);
                else
                    m.setCoef(Integer.parseInt(numar));
            numar = new String();
            coef = 1;
        }
    }
    class DelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (select == 2) {
                theView.secondTF.setText("");
                theModel.getP2().monomial.clear();
            }
            else {
                theView.firstTF.setText("");
                theModel.getP1().monomial.clear();
            }
        }
    }
    class AdddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            String text = theModel.adunareP().afisare();
            theView.resultTF.setText(text);
        }
    }
    class SubstractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            String text = theModel.scadereP().afisare();
            theModel.getP2().inversare();
            theView.resultTF.setText(text);
        }
    }
    class DerivateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            if (select == 2) {
                Polinom res = theModel.getP2().derivare();
                theView.resultTF.setText(res.afisare());
            }
            else {
                Polinom res = theModel.getP1().derivare();
                theView.resultTF.setText(res.afisare());
            }
        }
    }
    class IntegrateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            if (select == 2) {
                Polinom res = theModel.getP2().integrare();
                theView.resultTF.setText(res.afisare());
            }
            else {
                Polinom res = theModel.getP1().integrare();
                theView.resultTF.setText(res.afisare());
            }
        }
    }
    class MultiplicateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            String text = theModel.inmulireP().afisare();
            theView.resultTF.setText(text);
        }
    }
    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lastElement();
            Model m = theModel.impartireP();
            theView.resultTF.setText(m.getP1().afisare());
            if (m.getP2().afisare().isEmpty())
                rm = new RemainderMessage("0");
            else
                rm = new RemainderMessage(m.getP2().afisare());
        }
    }
    class FirstListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {lastElement(); select = 1;}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
    class SecondListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {lastElement(); select = 2;}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }
}
