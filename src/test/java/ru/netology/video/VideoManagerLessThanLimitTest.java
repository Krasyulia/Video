package ru.netology.video;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoManagerLessThanLimitTest {
    VideoManager manager = new VideoManager();
    VideoItems item1 = new VideoItems ("Пила1");
    VideoItems item2 = new VideoItems ("Пила2");
    VideoItems item3 = new VideoItems ("Пила3");
    VideoItems item4 = new VideoItems ("Пила4");

    @BeforeEach
    public void setup () {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
    }

    @Test

    public void shouldFindItemsWhenLessThanLimit() {
        VideoItems[] expected = {item4, item3, item2, item1};
        VideoItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


