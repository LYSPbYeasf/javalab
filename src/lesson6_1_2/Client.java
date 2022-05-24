package lesson6_1_2;

public class Client extends Human {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
    @Override
    public String getAllInfo() {
        return "Имя клиента: " + getFirstName() + "\nФамилия клиента: " + getLastName() + "\nНазвание банка: " + getBankName();
    }

    @Override
    public void openBankAccount() {
        System.out.println("Создал запрос на открытие кредита");
    }

    @Override
    public int creditSum() {
        return 70000;
    }
}
