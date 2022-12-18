package com.github.homeworkPart1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    String baseUrl = "https://github.com";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    void setUp() {
        open(baseUrl);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }


    @AfterEach
    public void tearDown() {
        closeWindow();
    }

}
