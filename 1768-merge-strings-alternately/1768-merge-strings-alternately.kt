class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val minLen = minOf(word1.length, word2.length)
        val result = StringBuilder()

        for (i in 0 until minLen) {
            result.append(word1[i])
            result.append(word2[i])
        }

        result.append(word1.substring(minLen))
        result.append(word2.substring(minLen))

        return result.toString()
    }
}