package com.kwater;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {

        int[] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};

        //定义三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //定义数组管理三个对象
        Block[] blockArr = {b1,b2,b3};

        //要查找的值
        int number = 23;

        //调用方法
        int index = getIndex(blockArr,arr,number);

        System.out.println(index);


    }
    public static int getIndex(Block[] blockArr,int[] arr,int number){
        //获取块的索引
        int blockIndex = getBlockIndex(blockArr, number);

        if(blockIndex == -1){
            return -1;
        }

        //获取块的开始索引和结束索引
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //进行查找
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }

        return -1;

    }



    public static int getBlockIndex(Block[] blockArr,int number){

        for (int i = 0; i < blockArr.length; i++) {
            if(number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class Block{
    int max;
    int startIndex;
    int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
