package U7T3;
import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        nums.add(55);
        nums.add(45);
        nums.add(20);
        
        int sum = 0;

       	        // use an index-based for loop here to sum up the numbers in nums
        // for (int i = 0; i < nums.size(); i ++) {
        //     sum += nums.get(i);
        // }

        // for(Integer integer : nums) {
        //     sum += integer;
        // }
        // System.out.println(sum);  // TEST: this should print 225

        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");
        // for(int i = words.size() - 1; i >= 0; i --) {
        //     System.out.println(words.get(i));

        // }

        for(int i = 0; i < words.size();i ++) {
            boolean stop = false;
            for(int j = 0; j < words.get(i).length(); j ++) {
                if(words.get(i).substring(j, j + 1).equals("h")) {
                    stop = true;
                }
            }
            if(stop) {
                break;
            }
            System.out.println(words.get(i));
        }
    }

}
