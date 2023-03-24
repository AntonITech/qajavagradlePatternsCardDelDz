package ru.netology.delivery.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
public class DataGenerator {

    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        return date;
    }

    public static String generateCity(String locale) {
        return city;
    }

    public static String generateName(String locale) {
        return name;
    }

    public static String generatePhone(String locale) {
        return phone;
    }

    public static class Registration {

        private Registration() {

        }
        public static Registration generateInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new Registration(faker.city().cityName(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber());
        }
    }

        public static UserInfo generateUser(String locale) {
        return user;
        }

    public static class UserInfo {

        String city;
        String data;
        String name;
        String phone;
    }
}
