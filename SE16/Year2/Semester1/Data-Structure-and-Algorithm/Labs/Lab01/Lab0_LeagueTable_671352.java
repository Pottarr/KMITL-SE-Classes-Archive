// Theepakorn Phayonrat 67011352

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lab0_LeagueTable_671352 {
    public static void main(String[] args) {
        demo_1();
    }
    static void demo_1() {
        Map<Integer, String> teamNames = Map.of(
            1, "phy", 2, "chem", 3, "bio",
            4, "math", 5, "stat", 6, "com", 7, "kdai"
        );
        List<int[]> results = Arrays.asList(
            new int[] {1, 2, 1, 2}, new int[] {1, 3, 2, 0}, new int[] {1, 4, 0, 0},
            new int[] {1, 5, 0, 1}, new int[] {1, 6, 1, 2}, new int[] {1, 7, 2, 2},
            new int[] {2, 3, 3, 2}, new int[] {2, 4, 0, 1}, new int[] {2, 5, 3, 3},
            new int[] {2, 6, 3, 0}, new int[] {2, 7, 2, 0}, new int[] {3, 4, 1, 0},
            new int[] {3, 5, 1, 0}, new int[] {3, 6, 2, 3}, new int[] {3, 7, 0, 0},
            new int[] {4, 5, 3, 1}, new int[] {4, 6, 0, 0}, new int[] {4, 7, 1, 2},
            new int[] {5, 6, 0, 0}, new int[] {5, 7, 1, 0}, new int[] {6, 7, 1, 0}
        );
        int[][] table = computeTable(results);

        displayTable(table, teamNames);
    }

    static void displayTable(int[][] table, Map<Integer, String> teamNames) {
        System.out.println("Team  MP  GF  GA  Pts ");
        // System.out.println(Arrays.deepToString(table));
        for (int i = 0; i < table.length; i++) System.out.printf("%1$-4s%2$5d%3$4d%4$4d%5$5d%n", teamNames.get(table[i][0]), table[i][1], table[i][2], table[i][3], table[i][4]);
    }

    static int[][] computeTable(List<int[]> matches) {
        int maxTeamId = 7; // { n*(n-1) } / 2 = 21 matches -> n*n - n - 42 = 0 -> n - 7;
        int[][] stats = new int[maxTeamId][5]; // [teamId, MP, GF, GA, Pts]
        for (int i = 0; i < maxTeamId; i++) stats[i][0] = i + 1; // <-- Initializing Team ID

        /* your code - keep in mind that team_id j is at row (j - 1)*/

        for (int[] m : matches) {
            // int teamA = m[0];
            // int teamB = m[1];
            // int aScore = m[2];
            // int bScore = m[3];
            stats[m[0] - 1][1] += 1; // Team A match played increase
            stats[m[0] - 1][2] += m[2]; // Team A goal for
            stats[m[0] - 1][3] += m[3]; // Team A goal against
            // stats[m[0] - 1][4] += m[2]; // Team A points increase
                                    
            stats[m[1] - 1][1] += 1; // Team B match played increase
            stats[m[1] - 1][2] += m[3]; // Team B goal for
            stats[m[1] - 1][3] += m[2]; // Team B goal against
            // stats[m[1] - 1][4] += m[3]; // Team A points increase
            if (Integer.compare(m[2], m[3]) > 0) {
                stats[m[0] - 1][4] += 3;
            } else if (Integer.compare(m[2], m[3]) < 0) {
                stats[m[1] - 1][4] += 3;
            } else {
                stats[m[0] - 1][4] += 1;
                stats[m[1] - 1][4] += 1;
            }
        }

        Arrays.sort(stats, (a, b) -> {
            if (Integer.compare(a[4], b[4]) == 0) { // At first, we sort by Points desc.
                if (Integer.compare(a[2] - a[3], b[2] - b[3]) == 0) { // If Points doesn't work, we will sort by Goal difference desc.
                    if (Integer.compare(a[2], b[2]) == 0) { // If Goal difference doesn't work, we will sort by Goal scored desc.
                        return Integer.compare(a[0], b[0]); // If every data is the same, we will sort by teamId asc.
                    } else {
                        return -Integer.compare(a[2], b[2]);
                    }
                } else {
                    return -Integer.compare(a[2] - a[3], b[2] - b[3]);
                }
            } else {
                return -Integer.compare(a[4], b[4]);
            }
        });
        return stats;
    }
}
