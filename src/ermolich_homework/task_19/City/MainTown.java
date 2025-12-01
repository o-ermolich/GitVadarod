package ermolich_homework.task_19.City;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTown {
    public static void main(String[] args) {
        first();
    }

    public static void first() {
        Town city1 = new Town(1, "Саратов", 830000, Town.continent.Евразия);
        Town city2 = new Town(2, "Нью-Йорк", 8300000, Town.continent.Северная_Америка);
        Town city3 = new Town(3, "Токио", 14000000, Town.continent.Евразия);
        Town city4 = new Town(4, "Каир", 9500000, Town.continent.Африка);
        Town city5 = new Town(5, "Бразилиа", 3100000, Town.continent.Южная_Америка);
        Town city6 = new Town(6, "Сидней", 5300000, Town.continent.Австралия);
        Town city7 = new Town(7, "Мельбурн", 5100000, Town.continent.Австралия);

        List<Town> towns = List.of(city1, city2, city3, city4, city5, city6, city7);

        //Найти самый густонаселённый город на континенте
        Town.continent selectedContinent = Town.continent.Евразия;

        Optional<Town> mostPopulatedCity = towns.stream()
                .filter(town -> town.getContinent() == selectedContinent)
                .max(Comparator.comparing(Town::getCountPeople));

        if (mostPopulatedCity.isPresent()) {
            System.out.println(mostPopulatedCity.get().getName() +
                    " население " + mostPopulatedCity.get().getCountPeople());
        } else {
            System.out.println("Города не найдены на континенте " + selectedContinent);
        }

        //Найти город с минимальным населением на континенте
        Town.continent selectedContinent1 = Town.continent.Австралия;

        Optional<Town> mostPopulatedCity1 = towns.stream()
                .filter(town -> town.getContinent() == selectedContinent1)
                .min(Comparator.comparing(Town::getCountPeople));

        if (mostPopulatedCity1.isPresent()) {
            System.out.println(mostPopulatedCity1.get().getName() +
                    " население " + mostPopulatedCity1.get().getCountPeople());
        } else {
            System.out.println("Города не найдены на континенте " + selectedContinent1);
        }

        //Найти самый густонаселённый город
        Optional<Town> mostPopulatedCity2 = towns.stream()
                .max(Comparator.comparing(Town::getCountPeople));

        if (mostPopulatedCity2.isPresent()) {
            System.out.println(mostPopulatedCity2.get().getName() +
                    " население " + mostPopulatedCity2.get().getCountPeople());
        } else {
            System.out.println("Города не найдены");
        }

        //Найти город с самым маленьким населением
        Optional<Town> mostPopulatedCity3 = towns.stream()
                .min(Comparator.comparing(Town::getCountPeople));

        if (mostPopulatedCity3.isPresent()) {
            System.out.println(mostPopulatedCity3.get().getName() +
                    " население " + mostPopulatedCity3.get().getCountPeople());
        } else {
            System.out.println("Города не найдены");
        }

        //Найти первый попавшиеся город, у которого население больше 1млн
        Optional<Town> peopleMillion = towns.stream()
                .filter(town -> town.getCountPeople() > 1000000)
                .findFirst();

        if (peopleMillion.isPresent()) {
            System.out.println(peopleMillion.get().getName() +
                    " население " + peopleMillion.get().getCountPeople());
        } else {
            System.out.println("Города не найдены");
        }
        System.out.println("---------------------------");

        //Отобрать города с населением больше 1 млн
        List<Town> millionCities = towns.stream()
                .filter(town -> town.getCountPeople() > 1000000)
                .collect(Collectors.toList());

        if (!millionCities.isEmpty()) {
            for (Town town : millionCities) {
                System.out.println(town.getName() + " население " + town.getCountPeople());
            }
        } else {
            System.out.println("Города не найдены");
        }
        System.out.println("---------------------------");

        //Создать коллекцию из названий городов на основании объектов (map)
        List<String> cityNames = towns.stream()
                .map(Town::getName)
                .collect(Collectors.toList());

        System.out.println("Названия городов:");
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
    }
}
