
package convertidor_alura;

/**
 *
 * @author TheNurseProgramer
 */
public class Moneda {
    private String name;
    private String abb;
    private double value_mxn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbb() {
        return abb;
    }

    public void setAbb(String abb) {
        this.abb = abb;
    }

    public double getValue_mxn() {
        return value_mxn;
    }

    public void setValue_mxn(double value_mxn) {
        this.value_mxn = value_mxn;
    }

    public Moneda(String name, String abb, double value_mxn) {
        this.name = name;
        this.abb = abb;
        this.value_mxn = value_mxn;
    }
    public double convertTomxn (double money){
        return money * this.value_mxn;
    }
    public double convertReverse (double money){
        return money / this.value_mxn;
    }
}
