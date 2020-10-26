package _2_Loop_in_java.excercise.Bt2;

//        Bước 1: Khai báo biến số nguyên numbers và nhập cho nó một giá trị từ bàn phím để lưu số lượng số nguyên tố cần in ra.
//        Bước 2: Khai báo biến count và gán cho nó giá trị 0, biến này để đếm xem số lượng lượng số nguyên tố cần in ra đã bằng numbers hay chưa.
//        Bước 3: Khai báo biến N và gán cho giá trị 2, biến này để kiểm tra xem các giá trị nó nhận được có phải là số nguyên tố không,
//        mỗi lần lặp giá trị của biến sẽ được tăng lên 1.
//        Bước 4: Trong khi count < numbers thì:
//        Kiểm tra xem N có phải là số nguyên tố không. Nếu N là số nguyên tố thì in ra giá trị của N và tăng giá trị của count lên 1
//        Giá trị của N tăng lên 1 để kiểm tra số tiếp theo
public class prime20 {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;
        boolean check =false;
        while (count < numbers) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(N);
                count++;
            }
            N++;
            check =false;
        }
    }
}
