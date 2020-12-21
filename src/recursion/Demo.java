package recursion;
//递归
public class Demo {
    public static void main(String[] args) {
        //需求 一个台阶有n个 ，求有几种走法走完

        /**
         *
         * 分析  可分成先走一步或走两步
         * 1 一步 则有 n-1 种走法
         * 2 两步 则有 n-2 种走法
         *
         * 推出递归公式 f(n) = f(n-1)+f(n-2)
         *
         * 找出递归终止条件
         *
         * 假设只剩下1个台阶时，只有一种走法，即f(1) = 1
         * 假设只剩下2个台阶时，有两种走法，就是走一步，在走一步。或者是两步走完。即f(2) = 2;
         *
         * */

        System.out.println(f(6));
    }

    public static int f(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        int ret = f(n-1)+f(n-2);
        System.out.println(ret);
        return ret;
    }

    /**
     * 递归运算分析
     * 当n = 4时
     * f(4)
     *
     * 1 f(4-1) + f(4-2) ---> f(3) + 2  右边的递归条件终止，左边的继续进行递归
     * 2 f(3) 继续进行递归
     * 3 f(3) = f(3-1) + f(3-2) ---> 两边的递归终止 2 + 1
     *
     * 4 f(4) = 2 + 1 + 2 = 5
     *
     *
     *
     * */
}
