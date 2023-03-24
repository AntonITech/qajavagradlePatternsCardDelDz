package ru.netology.delivery.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.delivery.data.DataGenerator;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;

class DeliveryTest {

    private static Faker faker;

    @BeforeAll
    static void setUpAll() {
        faker = new Faker(new Locale("ru"));
    }

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    private void printTestData(String name, String phone, String city) {
    }

    @Test
    void shouldGenerateTestData() {
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().phoneNumber();
        String city = faker.country().countryCode2();
    }

    @Test
    @DisplayName("Should successful plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {
        var validUser = DataGenerator.generateUser("ru");
        var daysToAddForFirstMeeting = 4;
        var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 7;
        var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        var generateCity = DataGenerator.generateCity("");
        var generateName = DataGenerator.generateName("");
        var generatePhone = DataGenerator.generatePhone("");
        // TODO: добавить логику теста в рамках которого будет выполнено планирование и перепланирование встречи.
        // Для заполнения полей формы можно использовать пользователя validUser и строки с датами в переменных
        // firstMeetingDate и secondMeetingDate. Можно также вызывать методы generateCity(locale),
        // generateName(locale), generatePhone(locale) для генерации и получения в тесте соответственно города,
        // имени и номера телефона без создания пользователя в методе generateUser(String locale) в датагенераторе
    }
}