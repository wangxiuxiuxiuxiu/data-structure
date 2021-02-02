package tree;

//二叉树 遍历
public class BinaryTree {
    public static void main(String[] args) {
        char array[] = {'A','B','C','D','E','F','G'};

/*
   二叉树

   前序遍历是指，对于树中的任意节点来说，先打印这个节点，然后再打印它的左子树，最后打印它的右子树。
   中序遍历是指，对于树中的任意节点来说，先打印它的左子树，然后再打印它本身，最后打印它的右子树。
   后序遍历是指，对于树中的任意节点来说，先打印它的左子树，然后再打印它的右子树，最后打印这个节点本身。


         A
    B        C

 D    E   F    G



*/

        //前序遍历 A-B-D-E-C-F-G
        //preTree( array, 0);


        //中序遍历 D-B-E-A-F-C-G
       // midTree( array, 0);

        //后序遍历 D-E-B-F-G-C-A
        lastTree( array, 0);


    }

    //前序排序

    public static void preTree(char array[],int index){

        if(array==null||index>=array.length)return ;

        int left = index*2+1;
        int right = index*2+2;

        System.out.println(array[index]);
        preTree(array,left);
        preTree(array,right);

    }
    //中序排序

    public static void midTree(char array[],int index){

        if(array==null||index>=array.length)return ;

        int left = index*2+1;
        int right = index*2+2;

        midTree(array,left);
        System.out.println(array[index]);
        midTree(array,right);

    }

    //中序排序

    public static void lastTree(char array[],int index){

        if(array==null||index>=array.length)return ;

        int left = index*2+1;
        int right = index*2+2;

        lastTree(array,left);
        lastTree(array,right);
        System.out.println(array[index]);

    }

}
