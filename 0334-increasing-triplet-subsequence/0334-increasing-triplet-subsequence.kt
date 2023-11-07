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
                // If we find a number greater than both small and secondSmall, we have found a triplet
                return true
            }
        }

        return false

    }
}