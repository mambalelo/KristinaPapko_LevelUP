package transport;

import java.io.IOException;
import java.util.*;
public class PublicTransportPark  {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Car> parkList = new ArrayList<>();

        parkList.add(new Mercedes("Mercedes-Benz 566 ",2010,2000,16.5));
        parkList.add(new Volvo("Volvo XC 60",2009,1500,14));
        parkList.add(new Audi("Audi Q5",2011,2100,17));
        parkList.add(new Vaz("Vaz 806",2005,1100,21.5));

        System.out.println("====Создан парк общественного транспорта====");
        System.out.println();

        for (Car bus : parkList) {
            System.out.println(bus.getName());
        }


        TransportOperation.calculateTotalPrice((ArrayList<Car>) parkList);
        TransportOperation.sortByFuel((ArrayList<Car>) parkList);

        System.out.println("Для поиска по заданным параметрам введите год выпуска авто");
        int year = scanner.nextInt();
        System.out.println("Введите стоимость авто");
        int prise = scanner.nextInt();
        TransportOperation.searchBusByParameters((ArrayList<Car>) parkList, year, prise);



    }

}
