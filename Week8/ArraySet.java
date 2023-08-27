package Tool;


public class ArraySet<T> implements Iset<T>{
    T[] data;
    int nextFreeSpace = 0;

    public ArraySet(int size){
        data = new T[size];
    }

    
    public boolean add(T elt){
        if (!contains(elt)){
            data[nextFreeSpace] = elt;
            nextFreeSpace += 1;
            return true;
        }
        else{
            return false;
        }
    }

    public void clear(){
        for (int x = 0; x < size(); x++){
            data[x] = null;
        }
    }

    public boolean contains(T elt){
        for (int x = 0; x < size(); x++){
            if (data[x] == elt){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        if (nextFreeSpace == 0){
            return true;
        }
        return false;
    }

    public boolean remove(T elt){
        if (contains(elt)){

        }
        else{
            return false;
        }

    }

    public int size(){
        return nextFreeSpace;
    }
}
