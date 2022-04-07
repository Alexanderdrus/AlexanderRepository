package JAVA2.DOM5;

public class app2 {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        int size = 10000000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        System.out.println("Время работы первого метода: " + (System.currentTimeMillis() - startTime) + " ms.");
    }


    public static void secondMethod() {
        int size = 10000000;
        float[] arr1 = new float[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        long startTimeDivision = System.currentTimeMillis();
        float[] leftHalf = new float[5000000];
        float[] rightHalf = new float[5000000];
        System.arraycopy(arr1, 0, leftHalf, 0, 5000000);
        System.arraycopy(arr1, 5000000, rightHalf, 0, 5000000);
        System.out.println("Время разбивки массива на две части: " + (System.currentTimeMillis() - startTimeDivision) + " ms.");
        final Thread left = new Thread (new Runnable() {
            @Override
            public void run() {
                long startTimeLefthalf = System.currentTimeMillis();
                for (int i = 0; i < leftHalf.length; i++) {
                    leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Время просчета левой части: " + (System.currentTimeMillis() - startTimeLefthalf) + " ms.");
            }
        });
        left.start();
        final Thread right = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTimeRighthalf = System.currentTimeMillis();
                for (int i = 0; i < rightHalf.length; i++) {
                    rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Время просчета правой части: " + (System.currentTimeMillis() - startTimeRighthalf) + " ms.");
            }
        });
        right.start();
        try {
            right.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long startTimeMerged = System.currentTimeMillis();
        float[] mergedArray = new float[10000000];
        System.arraycopy(leftHalf, 0, mergedArray, 0, 5000000);
        System.arraycopy(rightHalf, 0, mergedArray, 5000000, 5000000);
        System.out.println("Время склейки: " + (System.currentTimeMillis() - startTimeMerged) + " ms.");
        System.out.println("Общее время работы второго метода: " + (System.currentTimeMillis() - startTime) + " ms.");

    }

}
