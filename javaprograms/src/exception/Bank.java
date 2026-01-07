package exception;

public class Bank {
    private int accnumber;
    private String accountholder;
    private double balance;
    public Bank(String accountholder,int accnumber,double balance){
        this.balance=balance;
        this.accnumber=accnumber;
        this.accountholder=accountholder;
    }
    public void deposit(double amount){
        try{
            if(amount<0){
                throw new IllegalArgumentException("Deposit amount be positive");
            }
            balance+=amount;

        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Transaction done");
        }
    }
    public void withdraw(double amount) throws Exception {
//        try{
            if(amount<0){
                throw new IllegalArgumentException("Amount is less than 0");
            }
            else if(amount>balance){
                throw new InsufficientBalanceArgument("Insufficient balance in your account");
            }
            balance-=amount;
//        }
//        catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//
//        }
//        catch (InsufficientBalanceArgument e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Withraw request closed");
//        }

    }



    public static void main(String[] args) {
        Bank b=new Bank("garima",8797897,90);
       try{

           b.withdraw(999);
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
//        b.deposit(8);
//        b.deposit(6);
        System.out.println(b.balance);
    }
}
