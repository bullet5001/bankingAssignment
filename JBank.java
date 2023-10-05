package bankingAssienment;

public class JBank {
    public static void main(String[] args) {
        char option='y';
        do{
            switch (BankingTransaction.display()) {
                case 'a': BankingTransaction.checkBalance(); option=BankingTransaction.option();break;
                case 'b':BankingTransaction.Deposit();option=BankingTransaction.option();break;
                case 'c':BankingTransaction.withdraw();option=BankingTransaction.option();break;
                case 'd':BankingTransaction.accountSummary();option=BankingTransaction.option();break;
                case 'e':option=BankingTransaction.exit();break;
                default: System.out.println("PLEASE CHOOSE A VALID OPTION");option=BankingTransaction.option();
            }

        }while(option=='y');
    }
}
