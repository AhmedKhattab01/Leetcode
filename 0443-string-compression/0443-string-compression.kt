class Solution {
    fun compress(chars: CharArray): Int {
        var previous: Char = chars[0]
        var count = 1

        val finalArray = mutableListOf<Char>()

        for (i in 1 until chars.size) {
            val current = chars[i]

            if (current == previous) {
                count++
            } else {
                finalArray.add(previous)
                if (count > 1) {
                    count.toString().forEach { num ->
                        finalArray.add(num)
                    }
                }
                count = 1
                previous = current
            }
        }

        finalArray.add(previous)
        if (count > 1) {
            count.toString().forEach { num ->
                finalArray.add(num)
            }
        }

        for (i in finalArray.indices) {
            chars[i] = finalArray[i]
        }

        return finalArray.size
    }
}