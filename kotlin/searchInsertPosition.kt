fun main(){
    print(searchInsert(intArrayOf(1, 2, 3, 5, 10), 6))
}
fun searchInsert(nums: IntArray, target: Int): Int {
    for(x in 0..nums.size){
        if(nums[x] == target){
            return x
        } else {
            if(nums[x] > target){
                return x
            }
        }
    }
    return 0
}