public class Main {
    public static void main(String[] args)
    {
        int [] arr={22,13,17,11,10,14,12};
        HeapSort hs=new HeapSort();
        hs.sort(arr);
        hs.printarray(arr);
    }
}