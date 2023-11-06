class Solution {
    fun myAtoi(s: String): Int {
    val trimmed = s.trimStart()

    if (trimmed.isEmpty()) {
        return 0
    }

    var sign = 1
    var startIndex = 0
    if (trimmed[0] == '-' || trimmed[0] == '+') {
        sign = if (trimmed[0] == '-') -1 else 1
        startIndex = 1
    }

    var result = 0L // Use Long to handle potential overflow

    for (i in startIndex until trimmed.length) {
        if (!trimmed[i].isDigit()) {
            break
        }

        result = result * 10 + (trimmed[i] - '0')

        // Check for overflow
        if (result > Int.MAX_VALUE) {
            return if (sign == -1) Int.MIN_VALUE else Int.MAX_VALUE
        }
    }

    return (sign * result).toInt()
    }
}