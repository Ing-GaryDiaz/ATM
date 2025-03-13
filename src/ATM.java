public class ATM {
    public int money;
    private final String name;
    public static int totalMoney = 0;
    public static int numATMs = 0;


    public static void averageMoney(){
        System.out.println("Dinero promedio de los cajeros: $ " + totalMoney/numATMs);
    }

    public ATM(int inputMoney, String atmName  ){
        this.money = inputMoney;
        this.name = atmName;
        numATMs += 1;
        totalMoney += inputMoney;


    }

    public void withdrawmoney(int moneyToWithdraw){
        if (moneyToWithdraw <= this.money){
            this.money -= moneyToWithdraw;
            totalMoney -=   moneyToWithdraw;
        }
    }

    public void depositMoney(int moneyToDeposit){
        if (moneyToDeposit > 0){
            this.money += moneyToDeposit;
            totalMoney += moneyToDeposit;
        }

    }

    public void checkBalance(){
        System.out.println( "CAJERO:  " + this.name);
        System.out.println( "SALDO:  " + this.money);

    }
}
