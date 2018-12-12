
object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        for(a <- 0 until nums.length; b<- a+1 until nums.length) {
                var sum = nums(a) + nums(b)
                if(sum == target)
                    return Array(a,b)
        }
        return Array(0,0)
    }
}
