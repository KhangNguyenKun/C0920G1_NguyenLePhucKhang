package _4_Class_and_Object_in_java.excercise.bt1;

//Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
//
//        Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
//
//        Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
//
//        Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
//
//        Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
//
//        Vẽ sơ đồ UML cho lớp StopWatch và cài đặt lớp.
//
//        Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.

//public class Stopwatch {
//    private long startTime;
//    private long endTime;
//
//    public Stopwatch(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
//    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }
//    public long start(){
//         this.startTime = System.currentTimeMillis();
//    }
//    public long end(){
//         this.endTime =System.currentTimeMillis();
//    }
//    public long start(){
//        return
//    }
//}






















//public class Stopwatch {
//    private long startTime;
//    private long endTime;
//
//    public Stopwatch() {
//        this.startTime = System.currentTimeMillis();
////        this.endTime = System.currentTimeMillis();
//    }
//    public long getStartTime() {
//        return startTime;
//    }
//    public void setStartTime(long startTime){
//        this.startTime = startTime;
//    }
//    public long getEndTime(){
//        return endTime;
//    }
//    public void setEndTime(long endTime){
//        this.endTime= endTime;
//    }
//    public void start(){
//        this.startTime = System.currentTimeMillis();
//    }
//    public void stop(){
//        this.endTime = System.currentTimeMillis();
//    }
//    public long getElapsedTime(){
//        return this.endTime - this.startTime;
//    }
//
//    public static void main(String[] args) {
//        Stopwatch s = new Stopwatch();
//        s.start();
//        int a=0;
//        for (int x = 0; x <1000000 ;x++){
//            for (int y =0 ; y < 1000000 ; y++){
//                a += 1;
//            }
//        }
//        s.stop();
//        System.out.println(s.getStartTime());
//        System.out.println(s.getEndTime());
//        System.out.println(s.getElapsedTime());
//    }
//}
