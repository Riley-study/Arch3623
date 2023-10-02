package HomeWork4.src.Core;

import HomeWork4.src.Interfaces.ITicketRepo;
import HomeWork4.src.Models.Ticket;
import HomeWork4.src.Services.TicketRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {

    TicketRepository ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    public TicketRepository getTicketRepo() {
        return ticketRepo;
    }


    /**
     * Метод получения билетов из базы данных
     *
     * @param //routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
    public List<Ticket> getTickets(int route) throws RuntimeException {
       TicketRepository ticketRep = TicketRepository.getTicketRepository();
        return ticketRep.readAll(route);
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        if(ticket.getValid()){
            return true;
        } else {
            return false;
        }
    }


}
