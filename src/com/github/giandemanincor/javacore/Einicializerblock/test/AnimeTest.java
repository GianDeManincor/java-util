package com.github.giandemanincor.javacore.Einicializerblock.test;

import com.github.giandemanincor.javacore.Einicializerblock.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Gian");
        System.out.println(anime.getName());
        System.out.println(anime.getEpisodes());
    }
}
