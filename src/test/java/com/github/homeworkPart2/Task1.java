package com.github.homeworkPart2;

import com.github.homeworkPart1.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class Task1 extends BaseTest {
    /*
     1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
    Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
    */
    @Test
    void githubHoverMenuTest() {
        step("навести мышь на пункт меню Solutions", () -> {
            $$(".HeaderMenu-link").filter(visible).findBy(text("Solutions")).hover();
        });

        step("в выпадающем меню Solutions кликнуть на Enterprise", () -> {
            $x("//a[.='Enterprise']").click();
        });

        step("проверить заголовок загруженной страницы", () -> {
            $(".col-9-max h1").shouldHave(text("Build like the best"));
        });

    }
}