package com.zoo;

import com.zoo.animal.*;

public class Zoo {
    public static void main(String[] args) {

        Cats cat = new Cats("Жози", 3, "Сфинкс", "Серебристый табби", true);

        System.out.println("Меня зовут: " + cat.getName() + " Мой возраст: " + cat.getAge() + " Моя порода: " +
            cat.getBreed() + " Мой окрас: " + cat.getColor() + " Домашняя ли я: " + cat.isDomestic());
        cat.say();
        cat.play();
        cat.contrive();
        cat.stretching();
        cat.sharpenClaws();
        System.out.println();

        Dogs dog = new Dogs("Мурз", 10, "Хаски", "Белая", true);

        System.out.println("Меня зовут: " + dog.getName() + " Мой возраст: " + dog.getAge() + " Моя порода: " +
            dog.getBreed() + " Мой окрас: " + dog.getColor() + " Моя тренированность: " + dog.isTrained());
        dog.say();
        dog.play();
        dog.contrive();
        dog.bathe();
        dog.gnawSlippers();
        System.out.println();

        Foxs fox = new Foxs("Огонек ", 5, "Дикая канадская лисица ", "Чернобурая ", true);


        System.out.println("Меня зовут: " + fox.getName() + " Мой возраст: " + fox.getAge() + " Моя порода: " +
            fox.getKind() + " Мой окрас: " + fox.getColor() + " Моя успешность в охоте: " + fox.isSuccessfulPredator());
        fox.say();
        fox.play();
        fox.contrive();
        fox.hunts();
        fox.protectTerritory();
        System.out.println();

        Panthers panther = new Panthers("Багира ", 4, "Злюка ", "с пятнышками ", true);

        System.out.println("Меня зовут: " + panther.getName() + " Мой возраст: " + panther.getAge() + " Мой характер: " +
            panther.getCharacter() + " Мой окрас: " + panther.getColor() + " Моя успешность в охоте: " + panther.isSuccessfulPredator());

        panther.say();
        panther.play();
        panther.contrive();
        panther.walkAtNight();
        panther.markBoundaries();
        System.out.println();

        Rabbits rabit = new Rabbits("Бонни ", 1, " Я весь на понтах ", "серый ", 20);
        System.out.println("Меня зовут: " + rabit.getName() + " Мой возраст: " + rabit.getAge() + " Мой характер: " +
            rabit.getCharacter() + " Мой окрас: " + rabit.getColor() + " Мой прыжок в см: " + rabit.getJumpHeight());
        rabit.say();
        rabit.play();
        rabit.contrive();
        rabit.jump();
        rabit.eatGreens();
        System.out.println();

        Raccoons raccon = new Raccoons("Роналд ", 1, " Я веселый ", " темно серый ", true);
        System.out.println("Меня зовут: " + raccon.getName() + " Мой возраст: " + raccon.getAge() + " Мой характер: " +
            raccon.getCharacter() + " Мой окрас: " + raccon.getColor() + " Есть ли успех в охоте " + raccon.isSuccessfulPredator());
        raccon.say();
        raccon.play();
        raccon.rinse();
        raccon.contrive();
        raccon.steal();
        System.out.println();

        Wolfs wolf = new Wolfs("Самуил ", 6, " Я свободолюбивый ", "дымчатый ", true);
        System.out.println("Меня зовут: " + wolf.getName() + " Мой возраст: " + wolf.getAge() + " Мой характер: " +
            wolf.getCharacter() + " Мой окрас: " + wolf.getColor() + " Есть ли успех в охоте " + wolf.isSuccessfulPredator());
        wolf.say();
        wolf.play();
        wolf.contrive();
        wolf.gatherInFlock();
        wolf.howl();
        System.out.println();
    }

}