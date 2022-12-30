package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Computers computer1 = new Computers("Samsung1", 16, 1000, "Windows", "white");
        Computers computer2 = new Computers("Asus1",4, 500, "OS", "black");
        Computers computer3 = new Computers("Samsung2",8, 750, "Windows", "black");
        Computers computer4 = new Computers("HP1",16, 500, "OS", "white");

        Set<Computers> listComps = new HashSet<>();
        listComps.add(computer1);
        listComps.add(computer2);
        listComps.add(computer3);
        listComps.add(computer4);

        Map<Integer, String> characters = new HashMap<>();
        characters.put(1, "0");
        characters.put(2, "0");
        characters.put(3, "0");
        characters.put(4, "0");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Если хотите добавить характеристику в фильтр поиска - нажмите 1;\nЕсли хотите посмотреть результаты поиска - нажмите 0");
        Integer current = scanner.nextInt();
        while (current == 1) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет");
            Integer needCharact = scanner.nextInt();
            if (needCharact == 1){
                System.out.println("Задайте значение для данного критерия");
                String value = scanner.next();
                characters.put(1, value);
            }else if (needCharact == 2){
                System.out.println("Задайте значение для данного критерия");
                String value = scanner.next();
                characters.put(2, value);
            }else if (needCharact == 3){
                System.out.println("Задайте значение для данного критерия");
                String value = scanner.next();
                characters.put(3, value);
            }else if (needCharact == 4){
                System.out.println("Задайте значение для данного критерия");
                String value = scanner.next();
                characters.put(4, value);
            }
            System.out.println("Если хотите добавить характеристику в фильтр поиска - нажмите 1;\nЕсли хотите посмотреть результаты поиска - нажмите 0");
            current = scanner.nextInt();
        }

        System.out.println("Start process...");
        for (var entry : listComps) {
            //System.out.println(entry.toString());
            if (((Integer.parseInt(characters.get(1)) <= entry.getOsu()) || characters.get(1).equals("0")) &&
                    ((Integer.parseInt(characters.get(2)) <= entry.getJD()) || characters.get(2).equals("0")) &&
                    ((characters.get(3).equals(entry.getOs())) || characters.get(3).equals("0")) &&
                    ((characters.get(4).equals(entry.getColor())) || characters.get(4).equals("0"))){
                System.out.println("Вам подходит: " + entry);
            }
        }
    }
}