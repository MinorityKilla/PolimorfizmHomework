package taxes;

public class USNIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        int tax = profit * 15 / 100;
        return Math.max(tax, 0);
    }
}
