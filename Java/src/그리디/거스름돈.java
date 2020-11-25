package 그리디;

public class 거스름돈 {
    public static void main(String[] args) {

        int n = 1260;
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < coinTypes.length; i++) {
            int coin = coinTypes[i];
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
