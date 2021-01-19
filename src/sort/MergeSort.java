package sort;


//归并排序
public class MergeSort {

    /**
     *
     * 思想：
     分而治之(divide - conquer);每个递归过程涉及三个步骤
     第一, 分解: 把待排序的 n 个元素的序列分解成两个子序列, 每个子序列包括 n/2 个元素.
     第二, 治理: 对每个子序列分别调用归并排序MergeSort, 进行递归操作
     第三, 合并: 合并两个排好序的子序列,生成排序结果.
     *
     *
     *
     * 推出递归公式
     *
     * f(l..r) = f_merge(f(l..p),f(p+1..r))
     *
     *
     *
     *
     * */
    public static void main(String[] args) {

        int arr[] = {99,66,3,5,4,7,8,63,55,66,22,55};
        sort(arr,0,arr.length-1);
        for (int key:arr

             ) {
            System.out.println(key);
        }

    }
    public static int[] sort(int[] arr,int l,int r){
        int mid = (l+r)/2;
        //终止条件
        if(l>=r)return arr;

        sort(arr,l,mid);//左子序列
        sort(arr,mid+1,r);//右子序列
        //归并
        mergeSort(arr,l,mid,r);
        return arr;
    }
    public  static int[] mergeSort(int[] arr,int l,int mid,int r){

       /* 1 定义一个临时数组
       *  2 使用两个指针分别指向左右子列 的第一个元素
       *  3 比较这两个元素，如果左边小于右边，将小于的元素放进临时数组中，左列表向右移动一位，
       *    继续比较，否则将右子列的元素放进临时数组，右子列表向右移动一位。
       *  4 继续上述比较过程，直到其中一个子数组中的所有数据都放入临时数组中，再把另一个数组中的数据依次加入到临时数组的末尾，
       *    这个时候，临时数组中存储的就是两个子数组合并之后的结果了。最后再把临时数组 tmp 中的数据拷贝到原数组中。
       *
       *
       *
       * */

        int [] temp = new int[arr.length];
        int i = l;//临时数组下标
        int j = mid+1;//右数组第一个下标
        int index = l;//临时数组角标

        while (l<=mid&&j<=r){
            if(arr[l]<arr[j]){
                temp[i++] = arr[l++];
            }else {
                temp[i++] = arr[j++];
            }
        }
        //将剩余左列追加到临时数组
        while (l<=mid){
            temp[i++] = arr[l++];
        }

        //将剩余右列追加到临时数组
        while (j<=r){
            temp[i++] = arr[j++];
        }
        // 把新数组中的数覆盖nums数组
        while (index<=r){
            arr[index] = temp[index++];
        }



        return arr;
    }


}
