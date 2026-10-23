
package week5.assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public boolean isInjured() {
        return injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(
            other.battingAverage, this.battingAverage
        );
    }

    @Override
    public String toString() {
        return name;
    }
}

public class FantasyLeagueAutoDraftRankingEngine {

    static String draftAndRank(Player[] players) {
        int count = 0;

        for (Player p : players) {
            if (Player.isDraftable(p.getMatchesPlayed()) ||
                Player.isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                count++;
            }
        }

        Player[] selected = new Player[count];
        int index = 0;

        for (Player p : players) {
            if (Player.isDraftable(p.getMatchesPlayed()) ||
                Player.isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                selected[index++] = p;
            }
        }

        Arrays.sort(selected);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < selected.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }
            result.append(i + 1).append(". ").append(selected[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48, false),
            new Player("Rahul", 7, 55, false),
            new Player("Sameer", 3, 60, false),
            new Player("Dev", 12, 20, true)
        };

        System.out.println(draftAndRank(players));
    }
}
