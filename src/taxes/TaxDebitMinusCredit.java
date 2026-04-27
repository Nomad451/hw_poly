package taxes;

// УСН доходы минус расходы — налог 15% от разницы доходов и расходов.
public class TaxDebitMinusCredit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * 0.15);
        return Math.max(tax, 0);
    }
}
