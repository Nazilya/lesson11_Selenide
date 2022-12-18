package com.github.homeworkPart2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class Task2 {
/*
2. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
- Откройте https://the-internet.herokuapp.com/drag_and_drop
- Перенесите прямоугольник А на место В
- Проверьте, что прямоугольники действительно поменялись
- В Selenide есть команда $(element).dragAndDrop($(to-element)),
проверьте работает ли тест, если использовать её вместо actions()
Раньше такой тест не работал из-за ошибки в ChromeDriver, но, может быть, уже починили?
 */

    @Test
    void actionsTest() {
        step("открыть URL", () -> {
            open("https://the-internet.herokuapp.com/drag_and_drop");
        });
        step("перетащить квадрат А в квадрат В", () -> {
            $("#column-a").dragAndDropTo("#column-b");
        });
        step("проверить, что элементы поменялись местами", () -> {
            $("#column-a").shouldHave(Condition.text("B"));
            $("#column-b").shouldHave(Condition.text("A"));
        });
    }

}
