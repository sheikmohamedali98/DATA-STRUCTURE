package Array;

public class Array {
    private int[] array;
    private int count;

    public Array(int size) {
        array = new int[size];
    }

    public void  insert(int element){
        if(count == array.length){
            int[] newArray = new int[2*count];
            for(int row = 0;row<count;row++){
                newArray[row] = array[row];
            }
            array = newArray;
        }
        array[count++] = element;
    }
    public void remove(int index){
        if(index<0 || index>=count){
            throw  new IllegalArgumentException();
        }
        for(int row = index;row<count;row++){
            array[row] = array[row+1];
        }
        count--;
    }
    public void update(int index,int element){
        for(int row = 0;row<count;row++){
            if(row == index){
                array[row] = element;
            }
        }

    }
    public boolean contains(int element){
        for(int row =0;row<count;row++){
            if(array[row] == element){
                return true;
            }
        }
        return false;
    }
    public int indexOf(int element){
        for(int row = 0;row<count;row++){
            if(array[row] == element){
                return row;
            }
        }
        return -1;
    }

    public void printArray() {
        for (int row = 0; row < count; row++) {
            System.out.print(array[row] + " ");
        }
    }

}
