import taxes.USNIncome;
import taxes.USNIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Ромашка", new USNIncome());

        company.shiftMoney(10000);
        company.shiftMoney(-3000);
        company.payTaxes();

        company.setTaxSystem(new USNIncomeMinusExpenses());
        company.shiftMoney(20000);
        company.shiftMoney(-5000);
        company.payTaxes();
    }
}
