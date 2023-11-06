class Solution {
fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIndexMap = HashMap<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]
        if (numToIndexMap.containsKey(complement)) {
            return intArrayOf(numToIndexMap[complement]!!, i)
        }
        numToIndexMap[nums[i]] = i
    }

    throw IllegalArgumentException("No two elements sum up to the target.")
}

}