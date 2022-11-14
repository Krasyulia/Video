package ru.netology.video;

import ru.netology.repo.VideoRepository;

public class VideoManager {

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

    private int resultLength;

    public VideoManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public VideoManager() {
        this(10);
    }


    public VideoItems[] findAll() {
        VideoItems[] all = this.getItems();
        return all;
    }

    public VideoItems[] findLast() {
        VideoItems[] all = this.getItems();
        int reversedLength = all.length < this.resultLength ? all.length : this.resultLength;
        VideoItems[] reversed = new VideoItems[reversedLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }

        return reversed;

    }
}

