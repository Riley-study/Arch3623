package HomeWork4.src.Core;

import HomeWork4.src.Interfaces.ICarrierRepo;
import HomeWork4.src.Interfaces.ICashRepo;
import HomeWork4.src.Models.BankAccount;
import HomeWork4.src.Models.Carrier;
import HomeWork4.src.Models.Ticket;
import HomeWork4.src.Models.User;
import HomeWork4.src.Services.CarrierRepository;
import HomeWork4.src.Services.CashRepository;
import HomeWork4.src.Services.UserRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {


CarrierRepository carrierRepository;
CashRepository cashRepository;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    public CarrierRepository getCarrierRepository() {
        return carrierRepository;
    }

    public CashRepository getCashRepository() {
        return cashRepository;
    }



    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException {
        Carrier carrier = carrierRepository.read(1);
        UserRepository userRepository = UserRepository.getClientRepository();
        long cardNumber = userRepository.read(1).getCardNumber();
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        client.getCardNumber();
    }


}
