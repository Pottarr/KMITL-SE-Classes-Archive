import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab0 {
    public static void main(String[] args) {
        Lab0.demo_1();
    }

    static void demo_1() {
        int n = 3;
        int [] data = {10, 90, 70, 100, 150, 210};
        List<int[]> beams = new ArrayList<>();
        for (int i = 0; i < 2*n; i+=2) {
            beams.add(new int[] {data[i],data[i+1]});
        }
        // List<int[]> merged = mergeBeams(beams);
        // for (int[] beam : merged) { 
        //     System.out.println(Arrays.toString(beam));
        // }
        for (int[] x : beams) {
            System.out.println(Arrays.toString(x));
        }
    }

    // static List<int[]> mergeBeams {
        // Will complete later...
    // }
}
