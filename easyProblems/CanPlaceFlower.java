package easyProblems;

public class CanPlaceFlower {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        CanPlaceFlower cp = new CanPlaceFlower();
        int[] flowerbed = {1,0,0,1,0,1,0,0,0,0};
        int n = 1;
        System.out.println(cp.canPlaceFlowers(flowerbed, n));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0){
            return true;
        }
        for(int i=0; i<flowerbed.length; i++){
            if(n > 0 && flowerbed[i] == 0){
                if(i == 0){
                    if(flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if(i == flowerbed.length-1){
                    if(flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        if(n == 0){
            return true;
        } else {
            return false;
        }
    }
}
