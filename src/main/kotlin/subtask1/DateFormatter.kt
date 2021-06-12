package subtask1

import java.lang.Exception
import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val daysOfWeekInRussianMap = mapOf(
            "MONDAY" to "понедельник",
            "TUESDAY" to "вторник",
            "WEDNESDAY" to "среда",
            "THURSDAY" to "четверг",
            "FRIDAY" to "пятница",
            "SATURDAY" to "суббота",
            "SUNDAY" to "воскресенье"
        )
        val monthsInRussianMap = mapOf(
            "JANUARY" to "января",
            "FEBRUARY" to "февраля",
            "MARCH" to "марта",
            "APRIL" to "апреля",
            "JUNE" to "июня",
            "JULY" to "июля",
            "AUGUST" to "августа",
            "SEPTEMBER" to "сентября",
            "OCTOBER" to "октября",
            "NOVEMBER" to "ноября",
            "DECEMBER" to "декабря"
        )

        val year: Int = year.toInt()
        val month: Int = month.toInt()
        val day: Int = day.toInt()

        var date: LocalDate
        try {
            date = LocalDate.of(year, month, day)
        } catch (e: Exception) {
            return "Такого дня не существует"
        }

        var dayOfWeekInRussian: String = ""
        daysOfWeekInRussianMap.forEach { (key, value) ->
            if (key == date.dayOfWeek.toString()) dayOfWeekInRussian = value
        }

        var monthInRussian: String = ""
        monthsInRussianMap.forEach { (key, value) ->
            if (key == date.month.toString()) monthInRussian = value
        }
        return "$day $monthInRussian, $dayOfWeekInRussian"
    }
}
