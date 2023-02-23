package Unit;

import java.util.ArrayList;

public interface GameInterface {
    String getInfo();
    void step(ArrayList<UnitBaes> comandB);

    default UnitBaes findTarget(int miX, int miY, ArrayList<UnitBaes> aliens){
        double[] lensTarget = new double[aliens.size()];
        for (int i=0;i<aliens.size();i++) {
            lensTarget[i]=Math.sqrt((aliens.get(i).getY() - miY) * (aliens.get(i).getY() - miY) + (aliens.get(i).getX() - miX) * (aliens.get(i).getX() - miX));
        }
        int targetIndex=findMinIndex(lensTarget);
        aliens.get(targetIndex).distance=lensTarget[targetIndex];
        return aliens.get(targetIndex);
    }

   default int findMinIndex(double[] array){
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < array[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    };


}
