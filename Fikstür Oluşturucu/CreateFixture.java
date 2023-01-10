import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class CreateFixture {
    Scanner input = new Scanner(System.in);
    LinkedList<String> teams = new LinkedList<>();
    LinkedList<LinkedList<String>> fixture = new LinkedList<>();

    public void enterTeams() {
        System.out.print("Enter The Number Of Teams: ");
        int teamCount = input.nextInt();

        while (teamCount < 2) {
            System.out.print("Enter a Valid Team Number: ");
            teamCount = input.nextInt();
        }

        for (int i = 0; i < teamCount; i++) {
            System.out.print("Enter a Team: ");
            String t = input.next();
            t = t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
            if (!teams.contains(t)) {
                teams.add(t);
            } else {
                System.out.println("\nThis team is already on the list!!!");
                i--;
            }
        }

        printTeams();
        mixList();
    }

    public void printTeams() {
        System.out.println("\nTEAMS");
        for (String team : teams) {
            System.out.println("- " + team);
        }
    }

    public void mixList() {
        Random random = new Random();
        for (int i = 0; i < teams.size() - 1; i++) {
            int rand = random.nextInt(teams.size() - 1);
            String temp = teams.get(rand);
            teams.add(i, teams.get(rand));
            teams.remove(teams.lastIndexOf(temp));
        }
    }

    public void setFixture() {
        int weekCount;
        int i = 0;

        if (teams.size() % 2 == 0) {
            weekCount = (teams.size() - 1) * 2;
        } else {
            weekCount = teams.size() * 2;
        }

        while (i != weekCount) {
            LinkedList<String> week = new LinkedList<>();
            if (i < weekCount / 2) {
                if (teams.size() % 2 == 0) {
                    for (int j = 0; j < (teams.size() - 1) / 2; j++) {
                        week.add(teams.get(j + 1) + " vs. " + teams.get(teams.size() - (j + 1)));
                    }
                    week.add(teams.get(0) + " vs. " + teams.get(teams.size() / 2));
                } else {
                    for (int j = 0; j < teams.size() / 2; j++) {
                        week.add(teams.get(j) + " vs. " + teams.get(teams.size() - (2 + j)));
                    }
                    week.add(teams.getLast() + " vs. " + "BYE");
                }
            } else {
                if (teams.size() % 2 == 0) {
                    for (int j = 0; j < (teams.size() - 1) / 2; j++) {
                        week.add(teams.get(teams.size() - (j + 1)) + " vs. " + teams.get(j + 1));
                    }
                    week.add(teams.get(teams.size() / 2) + " vs. " + teams.get(0));
                } else {
                    for (int j = 0; j < teams.size() / 2; j++) {
                        week.add(teams.get(teams.size() - (2 + j)) + " vs. " + teams.get(j));
                    }
                    week.add(teams.getLast() + " vs. " + "BYE");
                }
            }
            fixture.add(week);
            teams.add((teams.size() % 2 + 1) % 2, teams.getLast());
            teams.remove(teams.size() - 1);
            i++;
        }

        printFixture();
    }

    public void printFixture() {
        for (int i = 0; i < fixture.size(); i++) {
            System.out.println();
            System.out.println("ROUND " + (i + 1) + "\n-------------------------");
            for (int j = 0; j < fixture.get(i).size(); j++) {
                System.out.println(fixture.get(i).get(j));
            }
        }
    }
}
