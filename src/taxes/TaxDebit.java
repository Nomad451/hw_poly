package taxes;

// УСН доходы — налог 6% от доходов
public class TaxDebit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (debit * 0.06);
        return Math.max(tax, 0);
    }
}
