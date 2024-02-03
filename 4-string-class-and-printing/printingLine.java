public class printingLine {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("sum " + x + y );
    }
}

// remember programming takes order very seriously

// kali ini karena dari kiri ke kanan, si str ini harus dioperasikan
// dengan kanannya kan, nah karena str cuma dukung concatenation, 
// jadinya diconcatenate

// beda kalau dibikin X+y+sum, nanti dia bakal dijumlahin dulu
// baru diconcatenate

// kecuali memang intend untuk penjumlahan, biar aman pake kurung aja