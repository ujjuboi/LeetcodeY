import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
  public static void main(String[] args) {
    ContainsDuplicate cd = new ContainsDuplicate();
    int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    System.out.println(cd.containsDuplicate(nums));
  }

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> numsSet = new HashSet<>();
    for (int i : nums) {
      numsSet.add(i);
    }
    if (numsSet.size() == nums.length) {
      return false;
    }
    return true;
  }
}
