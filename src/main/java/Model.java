public class Model {
    private Polinom p1 = new Polinom();
    private Polinom p2 = new Polinom();

    public Polinom getP1() {
        return p1;
    }

    public void setP1(Polinom p1) {
        this.p1 = p1;
    }

    public Polinom getP2() {
        return p2;
    }

    public void setP2(Polinom p2) {
        this.p2 = p2;
    }

    public Polinom adunareP() {
        Polinom res = new Polinom();
        int i = 0, j = 0;

        while (i < p1.monomial.size() && j < p2.monomial.size()) {
            while (i < p1.monomial.size() && p1.monomial.get(i).getGrad() > p2.monomial.get(j).getGrad()) {
                res.monomial.add(p1.monomial.get(i));
                i++;
            }
            while (i < p1.monomial.size() && j < p2.monomial.size() && p1.monomial.get(i).getGrad() < p2.monomial.get(j).getGrad()) {
                res.monomial.add(p2.monomial.get(j));
                j++;
            }
            if (i < p1.monomial.size() && j < p2.monomial.size() && p1.monomial.get(i).getGrad() == p2.monomial.get(j).getGrad()) {
                res.adunare(p1.monomial.get(i), p2.monomial.get(j));
                i++; j++;
            }
        }
        while (i < p1.monomial.size()) {
            res.monomial.add(p1.monomial.get(i));
            i++;
        }
        while (j < p2.monomial.size()) {
            res.monomial.add(p2.monomial.get(j));
            j++;
        }

        return res;
    }

    public Polinom scadereP() {
        Polinom res;
        p2.inversare();

        res = this.adunareP();

        return res;
    }

    public Polinom inmulireP() {
        Polinom res = new Polinom();

        for (int i = 0; i < p1.monomial.size(); i++)
            for (int j = 0; j < p2.monomial.size(); j++) {
                res.inmultire(p1.monomial.get(i), p2.monomial.get(j));
            }

        res.reducere();
        return res;
    }

    public Model impartireP() {
        Polinom cat = new Polinom();
        Polinom pol1 = p1, pol2 = p2;
        Polinom rest = new Polinom();
        Model model = new Model();

        if (p1.monomial.get(0).getGrad() < p2.monomial.get(0).getGrad()) {
            pol1 = p2; pol2 = p1;
        }
        while (!pol1.monomial.isEmpty() && !pol2.monomial.isEmpty() && pol1.monomial.get(0).getGrad() >= pol2.monomial.get(0).getGrad()) {
            cat.impartire(pol1.monomial.get(0), pol2.monomial.get(0));
            rest.monomial.clear();
            for (Monomial m : pol2.monomial)
                rest.inmultire(m, cat.monomial.get(cat.monomial.size()-1));
            model.setP1(pol1); model.setP2(rest);
            pol1 = model.scadereP();
            while (!pol1.monomial.isEmpty() && pol1.monomial.get(0).getCoef() == 0)
                pol1.monomial.remove(0);
        }
        model.setP1(cat); model.setP2(pol1);
        return model;
    }
}
