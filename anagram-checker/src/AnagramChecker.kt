class AnagramChecker {
    fun match(word1: String, word2: String): Boolean {
        val counter = IntArray(26) { 0 }
        if (word1.length != word2.length) return false
        var res1 = word1.lowercase()
        var res2 = word2.lowercase()
        (res1.indices).forEach { index ->
            ++counter[res1[index] - 'a']
            --counter[res2[index] - 'a']
        }
        return !counter.any { it != 0 }
    }
}
