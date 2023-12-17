package com.github.giandemanincor.javacore.Gassociation.test;

import com.github.giandemanincor.javacore.Gassociation.domain.Player;
import com.github.giandemanincor.javacore.Gassociation.domain.Team;

public class TeamTest {
    public static void main(String[] args) {
        // unidirectional relation one to one
        Player player = new Player("Neymar");
        Team team = new Team("Seleção Brasileira");

        player.setTeam(team);
        player.print();
    }
}
