// jadi ini kita punya dua angka yang binary versionnya
// cukup take 4 bits aja, sedangkan satu byte itu kan ada 8 angka
// nah kita mau jadiin dia satu byte --> 912 gitu
// bahasa kerennya: store two numbers in one byte

public class bitwise {
    public static void main(String[] args) {
        byte a = 9, b = 12;
        byte c;

        c = (byte) (a << 4);
        c = (byte) (c | b); // kalau mau run line ini aja, c harus di set valuenya. biar aman set 0
        
        System.out.println((c & 0b11110000) >> 4);
        System.out.println(c & 0b00001111);
        
    }
}

// jjur gweh jg gapaham aowkoakwo kita coba satu satu

// inget kalau 9 = 1001, 12 = 1100

// line c = (byte) (a << 4);
// output: 10010000 (bner, 9 shift ke kiri)

// nah liat upper bitsnya 0000, jadi tinggal perform OR aja sama 12 jadinya ky merge aja

// line c = (byte) (c | b);
// output: 1100 (bner, emang 12 di kanan)

// nah sekarang tinggal mikirin itu ngeceknya kenapa diprint kaya gitu awkowkojw

// line System.out.println((c & 0b11110000) >> 4); 
// katanya itu buat cek upper 4 bits
//  simply AND everything with one, it returns NILAI YANG SAMA
//  simply AND everything with zero, yh dapet zero lagi
//  jadi ini cuma FOKUS ke upper bits, lower bits di clear aja

// line System.out.println(c & 0b00001111); 
// katanya itu buat cek lower 4 bits
// kenapa diset 0 sama 1 nya juga sama, kali ini terfokus ke lower bits aja
