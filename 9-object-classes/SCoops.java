public class SCoops {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        // setiap kotak dari array diisi dgn class Subject yang puny properti  masing masing
        subs[0] = new Subject("23-2-DDP2", "DDP-2", 105);
        subs[1] = new Subject("23-2-MD2", "MD-2", 100);
        subs[2] = new Subject("23-1-ALN", "Aljabar Linier", 100);
        
        for (Subject sub : subs) {
            System.out.println(sub);
        }
    }
}
