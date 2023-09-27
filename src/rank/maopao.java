package rank;

public class maopao {
    public static int[] maopao(int a[]) {
        int len = a.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] >=a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
//    这是一个冒泡排序的改进版
public static int[] maopao2(int a[]) {
    int len = a.length;
    for (int i = len - 1; i > 0; i--) {
        int num=0;
        for (int j = 0; j < i; j++) {
            if (a[j] >a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                num++;
            }

        }
        if(num==0){
            break;
        }
    }
    return a;
}

    public static void main(String[] args) {
        maopao ma=new maopao();
        int[] maopao = ma.maopao2(new int[]{2, 5, 1});
        for (int i : maopao) {
            System.out.println(i);
        }
    }
}
