class FirstNumQuestions {

    fun tests() {
        println(isStringHasTheSameLetters("qwerty 123", "ytrweq 312"))
        println(isOccurStrInLine("asdf aqwer"))
        println(replaceAllSpaceToMacro("   I am cool guy   "))
        println(isPalendromWordContains("tenet"))
    }

    // 1.1
    fun isOccurStrInLine(str: String): Boolean {
        str.forEach { firstLetter ->
            var counting = 0
            str.forEach { secondLetter ->
                if (firstLetter == secondLetter) counting += 1
                if (counting > 1) return false
            }
        }
        return true
    }

    // 1.2
    fun isStringHasTheSameLetters(firstStr: String, secondStr: String): Boolean {
        if (firstStr.length != secondStr.length) return false
        val firstSortStr = firstStr.toCharArray().sort()
        val secondSortStr = secondStr.toCharArray().sort()
        return firstSortStr == secondSortStr
    }

    // 1.3
    fun replaceAllSpaceToMacro(str: String): String {
        return str.trimEnd().trimStart().replace(" ", "%20")
    }

    // 1.4
    fun isPalendromWordContains(str: String): Boolean {
        return str == str.reversed()
    }
}

