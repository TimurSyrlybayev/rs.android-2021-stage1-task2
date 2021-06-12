package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val arr = arrayListOf<Char>()
        var indexT = 0;

        fun checkLetters(index: Int, letter: Char) {
            for(i in index until a.length) {
                if (a[i].isUpperCase() && letter == a[i]) {
                    arr.add(letter)
                    break
                } else if (a[i].isUpperCase() && letter != a[i]) {
//                    arr.add(letter)
                    continue
                } else if(a[i].toUpperCase() == letter) {
                    indexT = i
                    arr.add(letter)
                    continue
                } else {
                    continue
                }
            }
        }

        for(letterInB in b) {
            checkLetters(indexT, letterInB)
        }
        if (arr.joinToString("") == b) {
            return "YES"
        } else {
            return "NO"
        }
    }
}
