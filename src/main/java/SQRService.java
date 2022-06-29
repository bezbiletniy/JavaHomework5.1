public class SQRService {
    public int Calculate(int low, int high) {
        int x = 0;
        for (int i = low; i >= low && i <= high; i++) {
            if (i * i >= 200 && i * i <= 300) {
                x = x + 1;
            }
        }
        return x;
    }
}
