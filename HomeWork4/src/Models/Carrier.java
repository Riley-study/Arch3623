package HomeWork4.src.Models;

/**
 * Модель перевозчика
 */
public class Carrier {
    int id;
    long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
