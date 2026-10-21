
package week5.class_problems;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getCodingScore() {
        return codingScore;
    }

    double getCompositeScore() {
        return cgpa * 10 + codingScore * 0.5;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(
            other.getCompositeScore(),
            this.getCompositeScore()
        );
    }

    @Override
    public String toString() {
        return name + " (" + getCompositeScore() + ")";
    }
}

public class PlacementDriveRankingEngine {

    static String shortlistAndRank(Candidate[] candidates) {
        int count = 0;

        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.getCgpa()) ||
                Candidate.isEligible(c.getCgpa(), c.getCodingScore())) {
                count++;
            }
        }

        Candidate[] shortlisted = new Candidate[count];
        int index = 0;

        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.getCgpa()) ||
                Candidate.isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted[index++] = c;
            }
        }

        Arrays.sort(shortlisted);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < shortlisted.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }

            result.append(i + 1)
                  .append(". ")
                  .append(shortlisted[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
