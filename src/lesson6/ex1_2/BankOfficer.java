package lesson6.ex1_2;

public class BankOfficer extends Human {
    private String bankName;

    public BankOfficer(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "Имя сотрудника: " + getFirstName() + "\nФамилия сотрудника: " + getLastName() + "\nНазвание банка: " + getBankName();
    }

    @Override
    public void openBankAccount() {
        System.out.println("Выдал кредит");
    }

    @Override
    public int creditSum() {
        return 50000;
    }
}

