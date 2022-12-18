package com.github.homeworkPart1;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LocatorsTest {
    /*
1. Есть ли разница между $("h1 div"); и $("h1").$("div");
может ли привести к тому что, поиск найдёт разные элементы?
Если может - приведите пример, когда.
     */

    @Test
    void locatorsTest() {
        open("https://www.litres.ru/sharl-perro/kot-v-sapogah-i-drugie-skazki-6898476/");
        System.out.println("вариант 1: " + $("li span").getText());
        //System.out.println("вариант 2: " + $("li").$("span").getText());

/*
в 1-м варианте элемент нашелся - Книги
во 2-м варианте: Element not found - NoSuchElementException, пот что у li есть span, но не прямой потомок
см. resources/imgForLocatorsTest.png
 */
    }

}