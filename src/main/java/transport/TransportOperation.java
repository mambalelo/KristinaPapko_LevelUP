package transport;

import java.util.ArrayList;
import java.util.Collections;

public class TransportOperation {


    public static void printPublicTransportPark(ArrayList<Car> parkList) {
        for (Car v : parkList){
            System.out.println(v);
        }

    }

        // Вычисление общей стоимости автопарка
    static void calculateTotalPrice(ArrayList<Car> parkList){

        int price = 0;
        for (Car p: parkList){
            price += p.getPrice();
        }
        System.out.println();
        System.out.println("====Общая стоимость автопарка " + price + " рублей====");


    }
        // Сортировка списка по расходу топлива
    static void sortByFuel (ArrayList<Car> parkList){
        Collections.sort(parkList,new SortByFuel());
        System.out.println();
        System.out.println("====Список отсортирован по расходу топлива авто====");
        printPublicTransportPark(parkList);
        System.out.println();

    }

        // Поиск по заданным параметрам
    static void searchBusByParameters (ArrayList<Car> parkList, int releaseYear, int prise){
        boolean car = false;

        System.out.println("====Отображен список автобусов, с годом выпуска " + releaseYear + " и стоимостью " + prise  + " рублей====");

        for (Car s: parkList){
            if (s.getReleaseYear() == releaseYear && s.getPrice() == prise){
                System.out.println(s);
                car = true;
            }
        }

        if (!car)
            System.out.println("Автобус(ы) с такими параметрами не найден(ы)");

    }









}
