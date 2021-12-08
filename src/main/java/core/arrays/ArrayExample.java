package core.arrays;

public class ArrayExample {

    public int[] gameMenuItems = {1, 2, 3, 4, 5};

    public int getGameMenuItems(int position) {
        return gameMenuItems[position];
    }

    public void setGameMenuItems(int position, int value) {
        if(value < 1 || value > 5 || position > 5){
            System.out.println("Wrong input values");
        } else {
            this.gameMenuItems[position] = value;
        }
    }

    public void switchMenuOptions(int menuValue1, int menuValue2) {
        int arrPos1 = 0, arrPos2 = 0;
        for (int i = 0; i < gameMenuItems.length; i++) {
            if (gameMenuItems[i] == menuValue1) {
                arrPos1 = i;
            } else if (gameMenuItems[i] == menuValue2) {
                arrPos2 = i;
            }
        }
        gameMenuItems[arrPos1] = menuValue2;
        gameMenuItems[arrPos2] = menuValue1;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        for (int element: arrayExample.gameMenuItems) {
            System.out.println(element);
        }
        System.out.println();
        arrayExample.switchMenuOptions(1,3);
        for (int element: arrayExample.gameMenuItems) {
            System.out.println(element);
        }
    }
}
