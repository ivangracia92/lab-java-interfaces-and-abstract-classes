package Task4;

public class IntArrayList implements iIntList{
    private int[] data;
    private int size;

   public IntArrayList() {
       this.data = new int[10];
       this.size = 0;

   }
    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacity = data.length + data.length / 2;
            int[] newData = new int[newCapacity];
        }
    }
}
