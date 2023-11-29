package com.github.giandemanincor.javacore.Coverloadingmethods.domain;

public class Anime {

    private String name;

    private String type;

    private int episodes;

    public void init(String type, int episodes) {
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes) {
        this.init(type, episodes);
        this.name = name;
    }

    public void print() {
        System.out.println(this.toString());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
