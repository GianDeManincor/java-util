package com.github.giandemanincor.javacore.Einicializerblock.domain;

import java.util.ArrayList;
import java.util.List;

public class Anime {
    private String name;
    private final List<Integer> episodes;

    {
        episodes = new ArrayList<>();
        episodes.addAll(List.of(1, 2, 3, 4, 5));
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEpisodes() {
        return episodes;
    }
}
