package _2_Loop_in_java.excercise.Bt3;

//Bước 1: Viết mã kiểm tra một số cho trước có phải là số nguyên tố hay không
//
//        Bước 2: Lặp lại việc kiểm tra trên từng số trong khoảng từ 2 tới 100
//
//        Chạy vòng lặp trên các số từ 2 tới 100, kiểm tra mỗi trường hợp có phải là số nguyên tố
//        không bằng mã đã thực hiện ở bước 1. In ra màn hình nếu gặp số nguyên tố.
public class Prime100first {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        boolean check = true;
        while (count < 100) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
            check = true;
        }
    }
}
