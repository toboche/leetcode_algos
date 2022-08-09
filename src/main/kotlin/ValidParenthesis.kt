import java.util.*

class ValidParenthesis {
    fun isValid(s: String): Boolean {
        val deque = LinkedList<Char>()

        s.forEach{ char ->
            when(char){
                '(' -> deque.push(char)
                '{' -> deque.push(char)
                '[' -> deque.push(char)
                ')' -> {
                    if(deque.isEmpty() || deque.pop() != '('){
                        return false
                    }
                }
                '}' -> {
                    if(deque.isEmpty() || deque.pop() != '{'){
                        return false
                    }
                }
                ']' -> {
                    if(deque.isEmpty() || deque.pop() != '['){
                        return false
                    }
                }
                else -> throw Exception("bad input")
            }
        }
        return deque.isEmpty()
    }
}