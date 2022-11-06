package ru.netology.repo;

import ru.netology.video.VideoItems;

public class VideoRepository {
    private VideoItems[] items = new VideoItems[0];
    public void save(VideoItems item) {
        VideoItems[] tmp = new VideoItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }
    public VideoItems[] getItems() {
        return items;
    }
}
