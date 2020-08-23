package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.animal.Cats;
import com.zoo.animal.Dogs;
import com.zoo.animal.Foxs;
import com.zoo.animal.Panthers;
import com.zoo.animal.Rabbits;
import com.zoo.animal.Raccoons;
import com.zoo.animal.Wolfs;

public class Zoo {
	public static void main(String[] args) {

		Animal cat = new Cats();
		cat.say();
		cat.getName();
		System.out.print("��� ���: ");
		cat.setName("������");
		System.out.println(cat.getName());

		Animal dog = new Dogs();
		dog.say();
		dog.getName();
		System.out.print("��� ���: ");
		dog.setName("�������");
		System.out.println(dog.getName());

		Animal fox = new Foxs();
		fox.say();
		fox.getName();
		System.out.print("��� ���: ");
		fox.setName("�����");
		System.out.println(fox.getName());

		Animal panther = new Panthers();
		panther.say();
		panther.getName();
		System.out.print("��� ���: ");
		panther.setName("������");
		System.out.println(panther.getName());

		Animal rabit = new Rabbits();
		rabit.say();
		rabit.getName();
		System.out.print("��� ���: ");
		rabit.setName("������");
		System.out.println(rabit.getName());

		Animal raccon = new Raccoons();
		raccon.say();
		raccon.getName();
		System.out.print("��� ���: ");
		raccon.setName("������");
		System.out.println(raccon.getName());

		Animal wolf = new Wolfs();
		wolf.say();
		wolf.getName();
		System.out.print("��� ���: ");
		wolf.setName("��� ");
		System.out.println(wolf.getName());

	}

}
