package com.btcag.bootcamp.Aufgaben3.QueueList;

public class QueueList implements Methoden {
    int maxLength = 5;
    int[] queueList = new int[maxLength];

    public static int[] doubleSize(int[] queueList) {
        int[] temp = new int[queueList.length * 2];
        System.arraycopy(queueList, 0, temp, 0, queueList.length);
        return temp;
    }


    @Override
    public int popFront() {
        int temp = queueList[0];
        for (int i = 0; i < queueList.length - 1; i++) {
            queueList[i] = queueList[i + 1];
        }
        return temp;
    }

    @Override
    public int popLast() {
        int temp = -1;
        for (int i = queueList.length - 1; i >= 0; i--) {
            if (queueList[i] != 0) {
                temp = queueList[i];
                queueList[i] = 0;

            }
        }
        return temp;
    }


    @Override
    public int pushLast(int i) {
        if (queueList[queueList.length - 1] != 0) {
            queueList = doubleSize(queueList);
        }

        for (int j = queueList.length - 1; j >= 0; j--) {
            if (queueList[j] != 0) {
                queueList[j + 1] = i;
                return i;
            } else if (queueList[j] == 0 && j == 0) {
                queueList[j] = i;
                return i;
            }
        }

        return -1;
    }

    @Override
    public int pushFront(int i) {
        if (queueList[queueList.length - 1] != 0) {
            queueList = doubleSize(queueList);
        }

        int temp = -1;

        if (queueList[0] != 0) {
            for (int j = queueList.length - 2; j >= 0; j--) {
                queueList[j + 1] = queueList[j];
            }
        }
        queueList[0] = i;
        if (queueList[0] != 0) {
            temp = queueList[0];
        }

return temp;
    }


    @Override
    public int get(int i) {
        return queueList[i];
    }

    public void printQueueList() {
        for (int i : queueList) {
            System.out.print(i + " ");

        }
    }

}
