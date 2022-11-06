package ru.netology.video;

import ru.netology.repo.VideoRepository;

public class VideoManager {
    private VideoRepository repo;
    private int resultLength;

    public VideoManager(VideoRepository repo, int resultLength) {
        this.repo = repo;
        this.resultLength = resultLength;
    }

    public VideoManager(VideoRepository repo) {
        this(repo, 10);
    }

    public void add (VideoItems item) {
        repo.save(item);
    }

    public VideoItems[] findAll() {
        VideoItems[] all = repo.getItems();
        return all;
    }

    public VideoItems[] findLast() {
        VideoItems[] all = repo.getItems();
        VideoItems[] reversed = new VideoItems[this.resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }

        return reversed;

    }
}

