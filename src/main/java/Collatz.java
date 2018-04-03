public class Collatz {
    public static void findCollatzSequence(Number newNumber, long value){
        newNumber.maxSequenceLength++;
        if (value == 1)
            return;
        else if (value % 2 == 0){
            findCollatzSequence(newNumber, value / 2);
        }
        else if (value % 2 != 0){
            findCollatzSequence(newNumber, value * 3 + 1);
        }
    }

    public static void compareCollatzNumber(Number newNumber, Number maxNumber){
        if (newNumber.maxSequenceLength > maxNumber.maxSequenceLength){
            maxNumber = newNumber;
        }
    }
}
