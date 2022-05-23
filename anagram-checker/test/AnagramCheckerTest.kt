import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class AnagramCheckerTest : StringSpec() {
    init {
        "is 'b' an anagram of 'bac', check for not equal lengths"{
            AnagramChecker().match("b","bac").shouldBeFalse()
        }
        "is 'a' an anagram of 'a', check for equal length string & both string in small-case" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }
        "is 'DoG' an anagram of 'dog', check for uppercase and lowercase equality"{
            AnagramChecker().match("DoG","dog").shouldBeTrue()
        }
        "is 'A' an anagram of 'A', check for equal length string & both string in capital-case"{
            AnagramChecker().match("A","A").shouldBeTrue()
        }
        "is 'A' an anagram of 'aA', check for the same character occurrence but when count is not equal"{
            AnagramChecker().match("A","aA").shouldBeFalse()
        }

    }
}
