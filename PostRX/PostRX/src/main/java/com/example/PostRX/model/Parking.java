package com.example.PostRX.model;

import lombok.*;

import java.util.Objects;


public class Parking {
        private static Integer place = 20;
        private Integer car = 0;
        private String question;

        // функция
        public static int returnPlace(int res) {
                place = res;
                if (place < 0) {
                        return place = 0;
                }
                return place;

        }

        public Integer getPlace() {
                return place;
        }

        public void setPlace(Integer place) {
                this.place = place;
        }



        public String getQuestion() {
                return question;
        }

        public void setQuestion(String question) {
                this.question = question;
        }

        public Integer getCar() {
                return car;
        }

        public void setCar(Integer car) {
                this.car = car;
        }

        public Parking() {

        }

        public Parking(Integer place) {
                this.place = place;

        }


}