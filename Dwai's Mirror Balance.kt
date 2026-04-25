
fun main (){
    val input = readln()
    var count = 0
    var refo = 3
    var refe = 1

    val s = input.substring(0, input.indexOf(' ')).toLong()

    val e = input.substring(input.indexOf(' ')+1, input.length).toLong()

    for (i in s..e){
        if (i.toString().length%2 == 0){
            refe = i.toString().length/2
            if ((i.toString().substring(0,refe)).equals(i.toString().substring(refe,i.toString().length).reversed())){
                count++
            }
        }
        else if (i.toString().length%2 != 0){
            if (i.toString().length == 1){
                count++
            }
            else {
                refo = i.toString().length/2
                if (i.toString().substring(0,refo).equals(i.toString().substring(refo+1,i.toString().length).reversed()))
                    count++
            }
        }
    }

    println(count)
}