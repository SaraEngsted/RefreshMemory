package Grass;

import java.util.Scanner;

public class Grass {

    public int cutGrassIfMaxIs (double grassMaxHeight, double currentGrassHeight) {

        double grassGrowthPrDay = 0.8;
        int days = 0;

        for (int i = 0; i < grassMaxHeight; i++) {
            if (currentGrassHeight < grassMaxHeight) {
                currentGrassHeight = currentGrassHeight + grassGrowthPrDay;
                days++;
            }
        }
        return days;

    }

}
