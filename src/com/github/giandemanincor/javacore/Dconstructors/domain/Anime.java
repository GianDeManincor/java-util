package com.github.giandemanincor.javacore.Dconstructors.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String studio;

    public Anime() {
        System.out.println("dentro do construtor sem argumentos");
    }

    public Anime(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public Anime(String name, String type, int episodes, String studio) {
        this(name, type, episodes);
        this.studio = studio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", episodes=" + episodes +
                ", studio='" + studio + '\'' +
                '}';
    }
}
