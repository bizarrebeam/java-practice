public class removeExtraSpaces {
    public static void main(String[] args) {
        String str = "              abc de         fgh               ijk   ";
        str = str.replaceAll("\\s+", " ");
        System.out.println(str.trim());    
    }
}

// pake trim lagi karena kan regex bakal replace semua whitespace,
// termasuk yang di awal dan akhir string
//  jadi biar hasilnya lebih rapih aja