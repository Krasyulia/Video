package ru.netology.video;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repo.VideoRepository;

import static org.junit.jupiter.api.Assertions.*;

public class VideoManagerTest {
    VideoRepository repo = new VideoRepository();
    VideoManager manager = new VideoManager(repo);
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
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
    }


    @Test

    public void shouldFindAllItems() {
        VideoItems[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        VideoItems[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastTen() {
        VideoItems[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        VideoItems[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
