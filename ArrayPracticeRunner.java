 
public class ArrayPracticeRunner {
        public static void main(String[] args)
        {
            ArrayPractice ap = new ArrayPractice();
            int sum = ap.sum();
            System.out.println(sum);
            System.out.println(ap);
            int[] sixes = ap.indexesOfSixes();
            System.out.println(printArray(sixes));
        }
        public static String printArray(int[] array)
        {
            String ret = "[";
            for(int index = 0; index < array.length; index++)
            {
                ret += array[index];
                if(index < array.length - 1)
                {
                    ret += ". ";
                }
            }
            return ret + "]";
        }
    }