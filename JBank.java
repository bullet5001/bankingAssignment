package bankingAssienment;

public class JBank {
    public static void main(String[] args) {
        char op='y';
        do{
            switch (BankingTransaction.display()) {
                case 'a': BankingTransaction.checkBalance(); op=BankingTransaction.option();break;
                case 'b':BankingTransaction.Deposit();op=BankingTransaction.option();break;
                case 'c':BankingTransaction.withdraw();op=BankingTransaction.option();break;
                case 'd':BankingTransaction.accountSummary();op=BankingTransaction.option();break;
                case 'e':op=BankingTransaction.exit();break;
                default: System.out.println("PLEASE CHOOSE A VALID OPTION");op=BankingTransaction.option();
            }

        }while(op=='y');
    }
}
