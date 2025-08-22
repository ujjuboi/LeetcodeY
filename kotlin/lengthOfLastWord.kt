fun main(){
    print(lengthOfLastWord("luffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    var splitArr: List<String> = s.split(" ")
    var lastIndex: Int = splitArr.size-1
    var lastWord: String = ""
    while(lastIndex >= 0){
        if(splitArr.get(lastIndex).isEmpty()){
            lastIndex--
        } else {
            lastWord = splitArr.get(lastIndex)
            break
        }
    }
    return lastWord.length
}