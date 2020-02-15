class Controller () {
    fun hitungDeterminan(dataA: MutableList<Int>,listener: callBackController){
        var hasil: Int = (dataA[0]*dataA[3])- (dataA[1]*dataA[2])
        listener.kirimNilaiBalik(hasil)
    }

}