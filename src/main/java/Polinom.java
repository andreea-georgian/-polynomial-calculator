import java.util.*;

public class Polinom {
    List<Monomial> monomial = new ArrayList<>();

    public void adunare(Monomial m1, Monomial m2) {
        this.monomial.add(new Monomial(m1.getCoef() + m2.getCoef(), m1.getGrad()));
    }

    public void inmultire(Monomial m1, Monomial m2) {
        this.monomial.add(new Monomial(m1.getCoef() * m2.getCoef(), m1.getGrad() + m2.getGrad()));
    }

    public void impartire(Monomial m1, Monomial m2) {
        this.monomial.add(new Monomial(m1.getCoef() / m2.getCoef(), m1.getGrad() - m2.getGrad()));
    }

    public void inversare() {
        for(Monomial m : this.monomial) {
            m.setCoef(-1 * m.getCoef());
        }
    }

    public String afisare() {
        String text = new String();
        for (Monomial m: monomial){
            if (m.getCoef() > 0){
                if (!text.equals(""))
                    text += '+';
                if (m.getCoef() != 1 || m.getGrad() == 0)
                    text += String.valueOf((m.getCoef()));
            }
            else {
                if (m.getCoef() != -1 || m.getGrad() == 0)
                    text += String.valueOf((m.getCoef()));
                else
                    text += '-';
            }

            if (m.getGrad() != 0) {
                text += 'x';
                if (m.getGrad() != 1)
                    text += '^' + String.valueOf(m.getGrad());
            }
        }
        return text;
    }

    public void reducere() {
        monomial.sort(Comparator.comparing(Monomial::getGrad).reversed());
        for (int i = 1; i < monomial.size(); i++) {
            if (monomial.get(i).getGrad() == monomial.get(i-1).getGrad()) {
                monomial.get(i-1).setCoef(monomial.get(i-1).getCoef() + monomial.get(i).getCoef());
                monomial.remove(i);
                i--;
            }
        }
    }

    public Polinom derivare()  {
        Polinom res = new Polinom();

        for (Monomial m : monomial) {
            if (m.getGrad() != 0)
                res.monomial.add(new Monomial(m.getCoef() * m.getGrad(), m.getGrad() - 1));
        }

        return res;
    }

    public Polinom integrare() {
        Polinom res = new Polinom();

        for (Monomial m : monomial) {
            res.monomial.add(new Monomial(m.getCoef() / (m.getGrad() + 1), m.getGrad() + 1));
        }

        return res;
    }
}
