package HomeWork4.src.Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

int balance;
long card;
long oldCard;


    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public int getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public long getCard() {
        return card;
    }

    public long getOldCard() {
        return oldCard;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public void setOldCard(long oldCard) {
        this.oldCard = oldCard;
    }
}
