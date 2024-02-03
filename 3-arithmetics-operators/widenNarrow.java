public class widenNarrow {
    public static void main(String[] args) {
        // they're already in order (secara group yeah)
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10.0;
        char c = 10;
        boolean bl = true;

        // inget, cuma bisa smaller to bigger
        //  alias SMALLER on RHS
        // kalau ga, typecast dgn cara tulis ulang datatype LHS di RHS
        // kaya s = (short) i

        // c = b; inget kalau char takes 2 byte, byte yh cm 1 byte
        // c = i; inget kalau int takes 4 byte, char cm 2 byte
        
    }
}
