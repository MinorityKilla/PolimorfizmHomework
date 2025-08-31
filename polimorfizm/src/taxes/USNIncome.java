package taxes;

public class USNIncome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = debit * 6 / 100;
        return Math.max(tax, 0);
    }
}
