package com.zoo;

import com.zoo.animal.Cats;
import com.zoo.animal.Dogs;
import com.zoo.animal.Foxs;
import com.zoo.animal.Panthers;
import com.zoo.animal.Rabbits;
import com.zoo.animal.Raccoons;
import com.zoo.animal.Wolfs;

public class Zoo {
    public static void main(String[] args) {

        Cats cat = new Cats();
        cat.setName("Мурз");
        System.out.print("Мое имя: ");
        System.out.println(cat.getName());
        cat.say();
        cat.play();
        cat.contrive();
        cat.stretching();
        cat.sharpenClaws();
        System.out.println();

        Dogs dog = new Dogs();
        dog.setName("Андерсон");
        System.out.print("Мое имя: ");
        System.out.println(dog.getName());
        dog.say();
        dog.play();
        dog.contrive();
        dog.bathe();
        dog.gnawSlippers();
        System.out.println();

        Foxs fox = new Foxs();
        fox.setName("Рыжий");
        System.out.print("Мое имя: ");
        System.out.println(fox.getName());
        fox.say();
        fox.play();
        fox.contrive();
        fox.hunts();
        fox.protectTerritory();
        System.out.println();

        Panthers panther = new Panthers();
        System.out.print("Мое имя: ");
        panther.setName("Шерхан");
        System.out.println(panther.getName());
        panther.say();
        panther.play();
        panther.contrive();
        panther.walkAtNight();
        panther.markBoundaries();
        System.out.println();

        Rabbits rabit = new Rabbits();
        System.out.print("Мое имя: ");
        rabit.setName("Рональд");
        System.out.println(rabit.getName());
        rabit.say();
        rabit.play();
        rabit.contrive();
        rabit.jump();
        rabit.eatGreens();
        System.out.println();

        Raccoons raccon = new Raccoons();
        System.out.print("Мое имя: ");
        raccon.setName("Гарик");
        System.out.println(raccon.getName());
        raccon.say();
        raccon.play();
        raccon.rinse();
        raccon.contrive();
        raccon.steal();
        System.out.println();

        Wolfs wolf = new Wolfs();
        System.out.println("Мое имя: ");
        wolf.setName("Доминик");
        System.out.print(wolf.getName());
        wolf.say();
        wolf.play();
        wolf.contrive();
        wolf.gatherInFlock();
        wolf.howl();
        System.out.println();
    }

}