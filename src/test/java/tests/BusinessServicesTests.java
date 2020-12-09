package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class BusinessServicesTests extends TestBase {

    @Test
    @DisplayName("Проверить работу страницы, тарифы для Малого бизнеса и ИП")
    void  successfulOpenTariffPage() {
        step("Open Base Page", () ->
                open("https://sovcombank.ru/business"));
                $(".CookieOffer__buttons").click();

        step("Перейти на страницу 'Подобрать тариф  для бизнеса' ", () ->
                $x("//*[@id='__next']/div/main/section[1]/div/a[2]").click());
                switchTo().window(1);

        step("Проверить наличие на страницы вкладов", () ->
                $("html").findAll("span.Products__item__inner").shouldHaveSize(4));

        step("Перейти во вклад Успех",()->
                $(byText("Успех")).click());

        step("Проверить успешность открытия вкадки", () ->
                $("body").shouldHave(text("Условия")));
    }
}





