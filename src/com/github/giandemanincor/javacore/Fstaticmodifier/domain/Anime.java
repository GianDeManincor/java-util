package com.github.giandemanincor.javacore.Fstaticmodifier.domain;

import java.util.ArrayList;
import java.util.List;

public class Anime {
    private String name;
    private static List<Integer> episodes;

    static {
        System.out.println("Execute inicializer block");
        episodes = new ArrayList<>();
        episodes.addAll(List.of(1, 2, 3, 4, 5));
    }

    public Anime(String name) {
        this.name = name;
        Anime.episodes.forEach(System.out::println);
    }

    public Anime() {
        Anime.episodes.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEpisodes() {
        return episodes;
    }
}
