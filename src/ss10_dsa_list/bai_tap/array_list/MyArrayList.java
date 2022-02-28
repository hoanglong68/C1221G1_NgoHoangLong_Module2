package ss10_dsa_list.bai_tap.array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

    }

    //trả về số lượng phần tử trong mảng
    public int size() {
        return this.size;
    }

    //xoá tất cả phần tử trong mảng
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phương thức thêm 1 phần tử vào myArrayList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        size++;
        elements[size] = element;
        return true;
    }

    //phương thức tăng kích thước của myArrayList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //thêm vào phần tử tại vị trí index
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //lấy phần tử về tại vị trí index
    public E get(int index) {
        return (E) elements[index];
    }

    //phương thức lấy chỉ số index trong mảng của phần tử nhập vào
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //phương thức kiểm tra 1 phần tử có trong mảng hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }
// xoá 1 phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
