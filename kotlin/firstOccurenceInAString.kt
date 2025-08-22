fun main(){
    print(strStr("mississippi", "issip"))
}

fun strStr(haystack: String, needle: String): Int {
    var index: Int = -1
    if(haystack.contains(needle)){
        for(x in 0..haystack.length){
            if(haystack.get(x) == needle.get(0)){
                index = x
                var tempStr: String = ""
                while(needle.contains(tempStr) && tempStr.length < needle.length){
                    tempStr += haystack.get(index)
                    index += 1
                }
                if(tempStr.equals(needle)){
                    return x
                } else {
                    tempStr = ""
                    index = x
                }
            } else {
                continue
            }
        }
    }
    return index
}