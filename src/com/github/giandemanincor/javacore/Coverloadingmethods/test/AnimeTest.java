package com.github.giandemanincor.javacore.Coverloadingmethods.test;

import com.github.giandemanincor.javacore.Coverloadingmethods.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Hata", "TV", 4);
        anime.print();
    }
}
