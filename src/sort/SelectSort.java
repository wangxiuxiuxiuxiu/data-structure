package sort;

//选择排序
public class SelectSort {

    /**
     * 思路
     * 将数据分为两个区间，一个已排序好的区间，一个未排序好的
     * 初始化已排序好的区间，默认只有一个元素，
     * 每次从未排序好的区间中找到最小的值，交换数据
     *
     *
     *
     * */
    public static void main(String[] args) {

        int arr[] = {9,5,3,47,66,88,1,20,3};
        select(arr,arr.length);
        for (int key:arr
             ) {
            System.out.println(key);
        }
    }
    public static int [] select(int[] arr,int n){

        for (int i=0;i<n-1;i++){
            int min = i;
            //找出未排序区间最小值
            for (int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    //记录找到小于值的坐标
                    min = j;
                }

            }
            if(i!=min){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return  arr;
    }
}
