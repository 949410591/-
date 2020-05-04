package TestThreadSafe;

import java.io.ObjectInputStream;
import java.util.Objects;

public class TestTreadsafe {
    public static void main(String[] args) {
        Account a1 = new Account("949410591",10000);
        Thread t1 = new MyThread(a1);
        Thread t2 = new MyThread(a1);
        t1.start();
        t2.start();


    }
}




//自定义线程类
class MyThread extends Thread{
    Account account;


    public MyThread() {
    }

    public MyThread(Account account) {
        this.account = account;

    }


    @Override
    public void run() {


        account.withdraw(5000);
        System.out.println(
                Thread.currentThread().getName() +
                        " 对账户"+this.account.getAccountNum()+
                        " 取款5000成功 " +
                        "账户余额：" +
                        this.account.getBalence());



        }

}




//银行账户类
class Account{
    String accountNum;
    double balence;

    public Account(String accountNum, long balence) {
        this.accountNum = accountNum;
        this.balence = balence;
    }

    public Account() {
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum='" + accountNum + '\'' +
                ", balence=" + balence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balence == account.balence &&
                Objects.equals(accountNum, account.accountNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum, balence);
    }


    public void withdraw(double money){


        synchronized (this){
            double before = this.getBalence();
            double after = before - money;
            //模拟延迟

            //把最后的取款操作同时进行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalence(after);


        }

    }



}