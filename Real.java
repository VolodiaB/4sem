/**
 * Created by volodia on 03.03.17.
 */
public class Real extends ComplexN {
    Real() {
        super();
    }
    Real(double r) {
        super(r, 0);
    }
    @Override
    public void CPrint() {
        double pr = this.GetReal();
        System.out.println(pr);

}
}
