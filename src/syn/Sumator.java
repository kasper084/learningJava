package syn;

public class Sumator extends Thread{
    private int[] arr2sum;
    private int start, end;
    private long sum;

    public Sumator(int[] arr2sum, int start, int end) {
        this.arr2sum = arr2sum;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int currElement = start; currElement <= end; currElement++){
            sum = sum + arr2sum[currElement];
        }
    }

    public long getSum() {
        return sum;
    }
}
