package org.example

class ReturnFirstOccurrence {
    //Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined


//    function firstRecurringCharacter(input)

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2
    fun firstReccurringCharacter(input: List<Int>): Int? {
        val values = mutableSetOf<Int>()

        input.forEach { item ->
            if (values.contains(item)) {
                return item
            }
            else {
                values.add(item)
            }
        }

        return null
    }
}