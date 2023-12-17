package com.github.giandemanincor.javacore.Gassociation.test;

import com.github.giandemanincor.javacore.Gassociation.domain.Player;
import com.github.giandemanincor.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Cafu");
        Player player2 = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Player ---");
        player.print();
        player2.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
