package Chapter4.T4;

//        4. Which of the following compile? (Choose all that apply)
//        A. public void moreA(int... nums) {}
//        B. public void moreB(String values, int... nums) {}
//        G. public void moreG(String[] values, int[] nums) {}

public class T4 {

        public void moreA(int... nums) {}
        public void moreB(String values, int... nums) {}
        //public void moreC(int... nums, String values) {}
        //public void moreD(String... values, int... nums) {}
        //public void moreE(String[] values, ...int nums) {}
        //public void moreF(String... values, int[] nums) {}
        public void moreG(String[] values, int[] nums) {}
}
