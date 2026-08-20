class ArrayDemo {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 7, 1, 7, 1},
            {1, 7, 7, 1, 1},
            {7, 1, 7, 7, 1}
        };

        for (int[] ar : arr) {
            for (int ay : ar) {
	        //logic check
                // Check whether the number is even
                if (ay % 2 == 0) {
                    System.out.print("Even");
	            break;
 }
 }
 }
 }
}