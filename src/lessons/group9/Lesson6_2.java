//package lessons.group9;
//
//interface Poet {
//    default void write() {
//        System.out.println("Poet's default method");
//    }
//}
//
//interface Writer {
//    default void write() {
//        System.out.println("Writer's default method");
//    }
//}
//
//public class Lesson6_2 implements Poet, Writer{
//   
//    public static void main(String args[]){
//    	Lesson6_2 john = new Lesson6_2();
//        john.write();  // which write method to call, from Poet
//                       // or, from Writer
//    }
//}