package thread;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    Father father = new Father(bankAccount);
    Mother mother = new Mother(bankAccount);

    // 아버지가 먼저 입금한다 (만원)
    father.start();
    // 어머니가 장을 보기위해 출금한다
    mother.start();



  } // end of main
}
