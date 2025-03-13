public class Main {
    public static void main(String[] args) {

        System.out.println("Dinero total en el sistema:  $ "+ATM.totalMoney);
        System.out.println("Numero total de cajeros:  " +ATM.numATMs);

        ATM firstATM = new ATM(1000, "Bancolombia");
        ATM secondtATM = new ATM(500, "NuBank");
        firstATM.withdrawmoney(350);
        secondtATM.withdrawmoney(200);

        firstATM.depositMoney(800);
        secondtATM.depositMoney(800);
        firstATM.checkBalance();
        secondtATM.checkBalance();



        System.out.println("Dinero total en el sistema:  $"+ATM.totalMoney);
        System.out.println("Numero total de cajeros:  " +ATM.numATMs);
        ATM.averageMoney();

    }
}
