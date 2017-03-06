/**
 * Created by volodia on 03.03.17.
 */
class ComplexN {
    private double Re;
    private double Im;
    ComplexN() {
        Re = 0;
        Im = 0;
    }
    ComplexN(double r, double i) {
        Re = r;
        Im = i;
    }
    public ComplexN Add(ComplexN A) {
        this.Re = this.Re + A.Re;
        this.Im = this.Im + A.Im;
        return this;
    }
    public ComplexN Sub(ComplexN A) {
        this.Re = this.Re - A.Re;
        this.Im = this.Im - A.Im;
        return this;
    }
    public void Set(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }
    public double GetReal() {
        double res;
        res = this.Re;
        return res;
    }
    public ComplexN Get() {
        ComplexN res = new ComplexN();
        res.Re = this.Re;
        res.Im = this.Im;
        return res;
    }
    public void CPrint() {
        ComplexN pr = this.Get();
        if(pr.Im >= 0)
            System.out.println(pr.Re + "+i" + pr.Im);
        if(pr.Im < 0)
            System.out.println(pr.Re + "-i" + (-1)*pr.Im);
    }
    public ComplexN Add(ComplexN A, ComplexN B) {
        ComplexN res = A.Add(B);
        return res;
    }
    public ComplexN Sub(ComplexN A, ComplexN B) {
        ComplexN res = A.Sub(B);
        return res;
    }
    public ComplexN Mlt(ComplexN A) {
        this.Re = this.Re * A.Re - this.Im * A.Im;
        this.Im = this.Re * A.Im + this.Im * A.Re;
        return this;
    }
    public ComplexN Mlt(double A) {
        this.Re = this.Re * A;
        this.Im = this.Im * A;
        return this;
    }
    public ComplexN Div(double A) {
        this.Re = this.Re / A;
        this.Im = this.Im / A;
        return this;
    }
    public ComplexN Ult() {
        this.Im = - this.Im;
        return this;
    }
    public ComplexN Mlt(ComplexN A, ComplexN B) {
        ComplexN res = A.Mlt(B);
        return res;
    }
    public double Abs() {
        return Math.sqrt(this.Re * this.Re + this.Im * this.Im);
    }
    public ComplexN Div(ComplexN A) {
        this.Mlt(this ,A.Ult());
        this.Div(A.Abs() * A.Abs());
        return this;
    }
    public ComplexN Div(ComplexN A, ComplexN B) {
        ComplexN res = A.Div(B);
        return res;
    }
}
