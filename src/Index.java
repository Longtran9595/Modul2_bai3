public class Index {

    //    Xóa phần tử
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 0;

        size = adElement(arr, 10, size);
        size = adElement(arr, 4, size);
        size = adElement(arr, 6, size);
        size = adElement(arr, 7, size);
        size = adElement(arr, 8, size);
        size = adElement(arr, 6, size);

        System.out.println("Array after adding elements");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        deleteElement(arr, 7, size);
        System.out.println("Array after deleting elements");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        adElement(arr, 99, 3);
        System.out.println("Array after replace element");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        insertElement(arr, 888, 4);
        System.out.println("Array after insert element");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static int adElement(int[] arr, int adElement, int size) {
        arr[size] = adElement;
        size++;
        return size;
    }

    public static int searchElement(int[] arr, int Element, int size) {
        for (int i = 0; i < size; i++) {
            if (Element == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int deleteElement(int[] arr, int Element, int size) {
        int index = searchElement(arr, Element, size);
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    public static int insertElement(int[] arr, int Element, int index) {
        if (index >= 0 && index < arr.length) {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[index] = Element;
        return arr.length;
    }
}
