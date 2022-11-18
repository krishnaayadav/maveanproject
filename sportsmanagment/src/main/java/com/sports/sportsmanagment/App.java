package com.sports.sportsmanagment;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;
import com.entity.PlayerDetail;
import com.entity.Sports;
import com.sportsdao.SportsDao;

public class App {
	public static void main(String[] args) {
		// Save two instructors
		Player player = new Player("yadav", "krishna", 28);
		PlayerDetail playerDetail = new PlayerDetail("Mumbai", "kabaddi");
		playerDetail.setPlayer(player);
		player.setPlayerDetail(playerDetail);

		Player player1 = new Player("hemant", "kumar", 32);
		PlayerDetail playerDetail1 = new PlayerDetail("delhi", "Football");
		playerDetail1.setPlayer(player1);
		player1.setPlayerDetail(playerDetail1);

		List<Sports> sportss = new ArrayList<>();
		// create some new sports
		Sports spo = new Sports("kabaddi");
		spo.setPlayer(player);
		sportss.add(spo);
		SportsDao sod = new SportsDao();
		sod.saveSports(spo);

		Sports spor = new Sports("Football");
		spor.setPlayer(player1);
		sportss.add(spor);
		SportsDao soda = new SportsDao();
		soda.saveSports(spor);
	}
}