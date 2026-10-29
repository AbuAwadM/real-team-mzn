import members.member0
import members.member1
import members.member2
import members.member3

val membersList = listOf(member0, member1, member2, member3)

fun main() {
    println("===== MZN TEAM DIRECTORY =====")
    for (member in membersList) {
        println("Name: ${member.name}, University: ${member.university}, Age: ${member.age}, Role: ${member.role}")
    }
}
