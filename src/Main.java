import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;

public class Main {
    public static void main(String[] args) {
        TaxDebit debit = new TaxDebit();
        TaxDebitMinusCredit credit = new TaxDebitMinusCredit();

        Company company = new Company("Samsung", debit);
        company.shiftMoney(1000);
        company.payTaxes();

        Company company2 = new Company("LG", credit);
        company2.shiftMoney(1000);
        company2.payTaxes();
    }
}
