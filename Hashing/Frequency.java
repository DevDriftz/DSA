import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println("\nFrequency Map:");
        System.out.println(map);

        int maxFreq = 0;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("\nMost frequent element: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}
