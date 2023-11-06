class Solution {
    fun reverseWords(s: String): String {
        val words = s.split(Regex("\\s+")).toTypedArray()
        val builder = StringBuilder()

        for (i in words.size - 1 downTo 0) {
            builder.append(words[i])
            if (i > 0) builder.append(" ")
        }

        return builder.toString().trim()
    }
}