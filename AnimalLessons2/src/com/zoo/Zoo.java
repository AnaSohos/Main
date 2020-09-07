package com.zoo;

import com.zoo.animal.*;

public class Zoo {
    public static void main(String[] args) {

        Cats cat = new Cats("Жози", 3, "Серебристый табби", "Сфинкс", " Изобретательная ", true);
        Cats cat2 = new Cats();
        cat2.say();
        cat2.play();
        System.out.println("Меня зовут: " + cat.getName() + " Мой возраст: " + cat.getAge() + " Мой окрас: " +
            cat.getColor() + " Моя порода: " + cat.getKind() + " Мой характер: " + cat.getCharacter() +
            " Домашняя ли я: " + cat.isDomestic());
        cat.say();
        cat.play();
        cat.contrive();
        cat.stretching();
        cat.sharpenClaws();
        System.out.println();

        Dogs dog = new Dogs("Мурз", 10, "Белая", "Хаски", " я душка ", true);

        System.out.println("Меня зовут: " + dog.getName() + " Мой возраст: " + dog.getAge() + " Мой окрас: " +
            dog.getColor() + " Моя порода: " + dog.getKind() + " Мой характер: " + dog.getCharacter() +
            " Моя тренированность: " + dog.isTrained());
        dog.say();
        dog.play();
        dog.contrive();
        dog.bathe();
        dog.gnawSlippers();
        System.out.println();

        Foxs fox = new Foxs("Огонек ", 5, "Чернобурая ", "Дикая канадская лисица ", " хитрый ");

        System.out.println("Меня зовут: " + fox.getName() + " Мой возраст: " + fox.getAge() + " Мой окрас: " +
            fox.getColor() + " Моя порода: " + fox.getKind() + " Мой характер: " + fox.getCharacter());
        fox.say();
        fox.play();
        fox.contrive();
        fox.hunts();
        fox.protectTerritory();
        System.out.println();

        Panthers panther = new Panthers("Багира ", 4, "с пятнышками ", "Ирбис", "злюка ", true);

        System.out.println("Меня зовут: " + panther.getName() + " Мой возраст: " + panther.getAge() + " Мой окрас: " +
            panther.getColor() + " Моя порода: " + fox.getKind() + " Мой характер: " + panther.getCharacter() +
            " Моя успешность в охоте: " + panther.isSuccessfulPredator());

        panther.say();
        panther.play();
        panther.contrive();
        panther.walkAtNight();
        panther.markBoundaries();
        System.out.println();

        Rabbits rabit = new Rabbits(" Бонни ", 1, " серый ", " Ризен ", "Я весь на понтах ", 20);
        System.out.println("Меня зовут: " + rabit.getName() + "Мой возраст: " + rabit.getAge() + "Мой характер: " +
            rabit.getCharacter() + "Мой окрас: " + rabit.getColor() + " Мой прыжок в см: " +
            rabit.getJumpHeight());
        rabit.say();
        rabit.play();
        rabit.contrive();
        rabit.jump();
        rabit.eatGreens();
        System.out.println();

        Raccoons raccon = new Raccoons("Роналд ", 1, " темно серый ", "енот-полоскун", " Я веселый ");
        System.out.println("Меня зовут: " + raccon.getName() + " Мой возраст: " + raccon.getAge() + " Мой окрас: " +
            raccon.getColor() + " Моя порода: " + raccon.getKind() + " Мой характер: " + raccon.getCharacter());
        raccon.say();
        raccon.play();
        raccon.rinse();
        raccon.contrive();
        raccon.steal();
        System.out.println();

        Wolfs wolf = new Wolfs("Самуил ", 6, "дымчатый ", "серый волк", " Я свободолюбивый ");
        System.out.println("Меня зовут: " + wolf.getName() + " Мой возраст: " + wolf.getAge() + " Мой окрас: " +
            wolf.getColor() + " Моя порода: " + wolf.getKind() + " Мой характер: " + wolf.getCharacter());
        wolf.say();
        wolf.play();
        wolf.contrive();
        wolf.gatherInFlock();
        wolf.howl();
        System.out.println();
    }

}