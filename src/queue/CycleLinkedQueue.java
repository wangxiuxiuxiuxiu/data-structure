package queue;

//使用链表实现循环队列
public class CycleLinkedQueue {

    //头结点
    public Node head;
    //尾节点
    public Node tail;
    public int count;
    public int cap;

    CycleLinkedQueue(int cap){
        this.cap = cap;
        this.count = 0;
    }

    //入队
    public void enQueue(){

        Node newNode = new Node(99);
        //队列为空
        if(this.count==0){
            head = newNode;
            tail = newNode;//头尾指针指向新节点
        }else {
            //尾指针的下一节点指向新节点
            tail.next = newNode;
            tail = newNode;//尾节点指向新的节点
        }
        ++count;
    }

    //出队
    public boolean outQueue() {
        if (this.count == 0)
            return false;
        this.head = this.head.next;
        this.count -= 1;
        return true;
    }


    public static void main(String[] args) {
        CycleLinkedQueue cycleLinkedQueue = new CycleLinkedQueue(20);

        for (int i=0;i<cycleLinkedQueue.cap;i++){
            cycleLinkedQueue.enQueue();
            System.out.println("入队--数量："+cycleLinkedQueue.count);
        }

        for (int i=0;i<10;i++){
            cycleLinkedQueue.outQueue();
            System.out.println("出队--数量："+cycleLinkedQueue.count);
        }

    }


}
//节点
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


