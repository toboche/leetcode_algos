val input = listOf(1,2,34,4,5)

input.fold(1){acc, it->
    acc + it * 2
}