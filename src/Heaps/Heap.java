package Heaps;
import java.util.*;
public class Heap {
    public void insertIntoHeap(List<Integer>list, int ele){
        list.add(ele);
        int curr = list.size()-1;
        int parent = curr/2;

        while(curr>1 && list.get(parent)<list.get(curr)){
            Collections.swap(list,curr,parent);
            curr = parent;
            parent = curr/2;
        }
    }
    public void deletefromHeap(List<Integer>list){
        // remove root ele
        if(list.isEmpty()){
            System.out.println("Heap is empty!!");
            return;
        }
        list.set(1,list.getLast());
        list.removeLast();
        int parent = 1;
        int n = list.size();
        while(parent < n){
            int leftChild = 2*parent;
            int rightChild = 2*parent + 1;
            if(leftChild < n && list.get(leftChild)>list.get(parent) && list.get(leftChild) > list.get(rightChild)){
                Collections.swap(list,leftChild,parent);
                parent = leftChild;
            }
            else if(rightChild < n && list.get(rightChild)>list.get(parent) && list.get(rightChild) >= list.get(leftChild)){
                Collections.swap(list,rightChild,parent);
                parent = rightChild;
            }
            else return;
        }
    }
    public static void maxHeapify(List<Integer> list, int n, int i){
       // if(i>=(n/2)+1) return;
        int largest = i;
        int leftChild = 2*largest;
        int rightChild = 2*largest + 1;
        if(leftChild<=n && list.get(largest)<= list.get(leftChild))
            largest = leftChild;
        if(rightChild<=n && list.get(largest)<list.get(rightChild))
            largest = rightChild;
        if(largest != i){
            Collections.swap(list,largest,i);
            maxHeapify(list,n,largest);
        }
    }

    public static void minHeapify(List<Integer> list, int n, int i){
        int smallest = i;
        int leftChild = 2*smallest;
        int rightChild = 2*smallest + 1;

        if(leftChild<=n && list.get(smallest)>=list.get(leftChild)){
            smallest = leftChild;
        }
        if(rightChild<=n && list.get(smallest)>list.get(rightChild))
            smallest = rightChild;

        if(smallest!=i){
            Collections.swap(list,smallest,i);
            minHeapify(list,n,smallest);
        }
    }

    public static void heapSort(List<Integer>list){
        int n = list.size();
        int size=n-1;

        while(size>1){
            Collections.swap(list,1,size);
            size--;

            maxHeapify(list,size,1);
        }

    }
    public static void main(String[] args){
        List<Integer> list =  new ArrayList<>(Arrays.asList(-1,80,70,60,50,40));
        System.out.println(list);
        Heap heap = new Heap();
//        heap.insertIntoHeap(list,70);
//        heap.insertIntoHeap(list,2);
//        System.out.println(list);
//        heap.deletefromHeap(list);
//        System.out.println("After Deletion : "+list);
        int n = list.size()-1;
        for(int i=n/2;i>=1;i--){
            heap.maxHeapify(list,n,i);
            //heap.minHeapify(list,n,i);
        }


        System.out.println("After Max Heapify: "+list);
//        System.out.println("After Min Heapify: "+list);

        heap.heapSort(list);
        System.out.println("After Heapsort: "+list);
    }
}
