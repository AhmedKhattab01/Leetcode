class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val foundedVowels = s.filter { it in vowels }.reversed().toCharArray()
        var indexV = 0

        val result = StringBuilder(s)
        for (index in s.indices) {
            if (s[index] in vowels) {
                result[index] = foundedVowels[indexV]
                indexV++
            }
        }

        return result.toString()
    }
}
