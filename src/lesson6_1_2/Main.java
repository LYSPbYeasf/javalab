package lesson6_1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Карина", "Смирнова", "Сбербанк");
        BankOfficer bankOfficer = new BankOfficer("Марк", "Васильев", "Отделение 187 Сбербанк");
        System.out.println("Клиент");
        System.out.println(client.getAllInfo());
        client.openBankAccount();
        System.out.println("Сумма кредита: " + client.creditSum());
        System.out.println("Служащий банка");
        System.out.println(bankOfficer.getAllInfo());
        bankOfficer.openBankAccount();
        System.out.println("Сумма кредита: " + bankOfficer.creditSum());
    }
}
