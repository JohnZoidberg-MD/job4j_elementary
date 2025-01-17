package test.java.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.DummyBot;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, Умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknowBot() {
        String in = "Сколько будет 2 + 2 ?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}