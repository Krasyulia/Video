package ru.netology.video;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoManagerFiveItemsTest {
    public class VideoManagerTest {
        VideoManager manager = new VideoManager(5);
        VideoItems item1 = new VideoItems("Пила1");
        VideoItems item2 = new VideoItems("Пила2");
        VideoItems item3 = new VideoItems("Пила3");
        VideoItems item4 = new VideoItems("Пила4");
        VideoItems item5 = new VideoItems("Пила5");
        VideoItems item6 = new VideoItems("Пила6");
        VideoItems item7 = new VideoItems("Пила7");
        VideoItems item8 = new VideoItems("Пила8");
        VideoItems item9 = new VideoItems("Пила9");
        VideoItems item10 = new VideoItems("Пила10");
        VideoItems item11 = new VideoItems("Пила11");

        @BeforeEach
        public void setup() {
            manager.save(item1);
            manager.save(item2);
            manager.save(item3);
            manager.save(item4);
            manager.save(item5);
            manager.save(item6);
            manager.save(item7);
            manager.save(item8);
            manager.save(item9);
            manager.save(item10);
            manager.save(item11);
        }


        @Test
        public void shouldFindLastFive() {
            VideoItems[] expected = {item11, item10, item9, item8, item7};
            VideoItems[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }
    }
}
