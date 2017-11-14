public class ArrayPractice 
{   
        private int[] array;
        public ArrayPractice()
        {
            array = new int[10];
            initArray();
        }
        private void initArray()
        {
            for(int index = 0; index < array.length; index++)
            {
                array[index] = (int)(Math.random() *6) + 1;
            }
        }
        public int sum()
        {
            int sum = 0;
            for(int index = 0; index < array.length; index++)
            {
                sum += array[index];
            }
            return sum;
        }
        public int[] indexesOfSixes()
        {
            int count = 0;
            for(int index = 0; index < array.length; index++)
            {
                if(array[index] == 6)
                {
                    count++;
                }
            }
            int[] sixes = new int[count];
            count = 0;
            for(int index = 0; index < array.length; index++)
            {
                if(array[index] == 6)
                {
                    sixes[count] = index;
                    count++;
                }
            }
            return sixes;
        }
        public void doubbleArray()
        {
            for(int index = 0; index < array.length; index++)
            {
                array[index] = 2 * array[index];
            }
        }
        @Override
        public String toString()
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