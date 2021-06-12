package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var str = ""
        var sum = 0
        var arr: ArrayList<LocalDate> = ArrayList<LocalDate>()

        blockA.forEach {
            if(it!!::class == Int::class) {
                if (it is Int)
                    sum = sum + it
            } else if(it::class == String::class) {
                str += it
            } else if(it::class == LocalDate::class) {
                arr.add(it as LocalDate)
            }
        }

        val result = if (blockB == Int::class) {
            return sum
        } else if (blockB == String::class) {
            return str
        } else if(blockB == LocalDate::class) {
            val formattedDate = arr.max()
            return formattedDate!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        } else {}
        return result
    }
}
