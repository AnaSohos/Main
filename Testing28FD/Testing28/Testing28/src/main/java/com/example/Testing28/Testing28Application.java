package com.example.Testing28;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

import static com.example.Testing28.Sequence.seq;



@SpringBootApplication
public class Testing28Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Testing28Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		List < Integer > grup = Arrays.asList(0, 1, 1, 1, 0, 7, 1, 1, 1, 1, 1);
		System.out.println("Максимальное количество единиц подрят является:" + seq(grup));
	}
}