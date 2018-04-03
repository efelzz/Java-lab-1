public class Main {
    public static void main(String args []){
        Number maxNumber = new Number(0);
        for (int i = 1; i <= 1000000; i++){
            Number newNumber = new Number(i);
            Collatz.findCollatzSequence(newNumber, i);
        }
        System.out.print(maxNumber.maxSequenceLength);
    }
}
