public class BankAccount {
    public static String owner;
    private double balance;
    public double getBalance(){ return 0;}

    public String newOwner(){
        return owner;
    }
    public static int sum(int a, int b){

        return a+b;
    }

    public static void main(String[] args) {
        int a = 1; int b = Integer.parseInt(null);
        if ( a == Integer.parseInt(null) || b == Integer.parseInt(null)){
            throw new NumberFormatException("Null not excepted");
        }
        System.out.println(sum(a,b));
    }

}
