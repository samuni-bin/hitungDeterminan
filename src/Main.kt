class Main {
    companion object : callBackController {
        var dataA = mutableListOf<Int>()
        @JvmStatic
        fun main(args: Array<String>) {
            var curIndexA = 0

            do {
                println("Masukan data index ke $curIndexA: ")
                var inputA = readLine()
                dataA.add(inputA!!.toInt())
                curIndexA++

            } while (curIndexA < 4)
            println("Data yang Anda Masukkan:")
            println(dataA)
            var controller = Controller()
            controller.hitungDeterminan(dataA, this)

        }

        override fun kirimNilaiBalik(hasil: Int) {
            println("Hasilnya: $hasil")

        }
    }
}