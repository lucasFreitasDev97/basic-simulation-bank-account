import java.util.Scanner;

public class AccountTerminal{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("CREATE ACCOUNT BANK");
        System.out.println("===================");

        System.out.println("Insert name: ");
        String name = scanner.nextLine();

        System.out.println("Insert agency: ");
        String agency = scanner.nextLine();

        System.out.println("Insert account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Insert balance: ");
        double balance = scanner.nextDouble();

        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

        System.out.println("===================");
        System.out.println("   ACCOUNT STATUS   ");
        System.out.println("===================");
        System.out.println("Hello " + name + ", thank you for make a account in our bank! your agency is " + agency + ", account " + accountNumber + " and your balance ($" + balance +  ") is ready for withdraw");
    }
}
