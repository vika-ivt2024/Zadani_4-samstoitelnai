package org.example

fun main(args: Array<String>) {
    var nums = arrayOf(1,3,5,6)
    println(nums)
    print("Введите значение: ")
    var  target=readLine()
}
fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val mid = l + (r - l) / 2
        when {
            target < nums[mid] -> r = mid-1
            target > nums[mid] -> l = mid+1
            target == nums[mid] -> return mid
        }
    }
    return l
}
