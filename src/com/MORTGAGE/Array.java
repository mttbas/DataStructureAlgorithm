package com.MORTGAGE;

public class Array {
    private int[] items; // i have an array of integer called items. items are not initialized yet.
    // to initialize an array we need to know the length.
    private int count; // we need another field to keep track of the number  of items in this array.
    // we cannot trust i<items.length. because this is the memory you are allocating. initially we
    // allocate memory for 50 items but we want to insert 2 items only. so any time we insert
    // a new item we need to keep track of the number of items inserted.

    public Array(int length) { // in constructor we give : length as parameter
       items = new int[length]; // here we initialize the Array based on length given.
    }

    public void insert (int item){
        // if array is full, resize it.
        if (items.length == count){
            //create a new array ( twice the size)
            int[] newItems = new int[count*2];
            //copy all the items
            for (int i=0; i<count;i++)
                newItems[i]=items[i];
            //set them in the new array
            items=newItems;
        }
        // add the new item at the end
        items[count++] = item;
    }

    public void print(){
        for (int i=0; i<count; i++)
            System.out.println(items[i]);
    }


    public void removeAt(int index){
       // validate the index
        if (index <0 || index >=count)
            throw new IllegalArgumentException();
            // System.out.println("please enter a valid index"); we can not print an error message
            // on the console. because the class might be used in an application
            // with a graphical USER INTERFACE. so here we need to throw an EXCEPTION. because it is
            // a programming ERROR when someone passing an invalid index.
        // shift items to the left to fill the HOLE.
        for (int i = index; i< count; i++)
            items[i]=items[i+1];
        count--;
        // remove it from the list if it is not in the range.
    }


    public int indexOf(int item) {
        // runtime complexity of this method is O(n). because in the worst case if we have 1000 and our
        // item is at the end this loop repeats until we get to the one needed.
        // if we find it, return INDEX
        for (int i=0; i<count;i++)
            if (items[i]==item)
                return item;
            return -1;
        // otherwise return -1
    }
}
