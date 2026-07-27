public class Bank{
  public static void main(String[] args) {
    Account A1 = new Account("Akshat", 472, 1000); 
    A1.display();
    A1.withdraw(500); 
    A1.deposit(100); 
    A1.withdraw(30000); 
    A1.checkBalance();
    A1.display();
  }
}


class Account{
  int ac; 
  String n ; 
  double mon; 

  Account(String name, int acc_no, double money){
    ac = acc_no;
    n = name;
    mon = money; 
  }

  public void withdraw(int x){
     
    if(x>mon){
      System.out.println("Sufficient Balance");
      return ;
    }
    mon = mon - x;
    System.out.println("Debited " + x);

  }

  public void deposit(int x){
    mon = mon +x ; 
    System.out.println("Credited " + x + " amount");
  }

  public void checkBalance(){
    System.out.println("Balance : " + mon);
  }

  public void display(){
    System.out.println("Name " + n);
    System.out.println("Account number : " + ac);
    System.out.println("Balance : " + mon);
  }

}
