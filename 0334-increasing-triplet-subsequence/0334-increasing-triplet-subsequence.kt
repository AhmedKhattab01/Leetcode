class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var small = Int.MAX_VALUE
        var secondSmall = Int.MAX_VALUE

        for (num in nums) {
            if (num <= small) {
                small = num
            } else if (num <= secondSmall) {
                secondSmall = num
            } else {
                return true
            }
        }

        return false
    }
}