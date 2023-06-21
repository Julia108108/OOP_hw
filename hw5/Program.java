package hw5;

import hw5.models.TableModel;
import hw5.presenters.BookingPresenter;
import hw5.presenters.Model;
import hw5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     *
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        //bookingView.changeReservationTable();
        System.out.println("-------------------------------------------");

        bookingView.changeReservationTable(9001, new Date(), 101, "Станислав");

        System.out.println("-------------------------------------------");
        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");
    }

}