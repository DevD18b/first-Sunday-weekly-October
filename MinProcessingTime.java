import java.util.List;
import java.util.*;

public class MinProcessingTime {
    // n processor each heaving 4 cores.
    // given processingTime --> [8,10]
    // tasks --> [2,2,3,1,8,7,4,5];
    // each processor is allowed to take only one task.
    // there for there are only n*4 task available.

    // i need to assign the task in a way that total time of completion is minimum
    // possible.

    public static int solver(List<Integer> processingTime, List<Integer> task) {

        Collections.sort(processingTime);
        Collections.sort(task);
        int j = 0;
        int minPossibleTime = Integer.MIN_VALUE;
        for (int i = 0; i < processingTime.size(); i++) {
            for (int k = 0; k < 4; k++, j++) {
                minPossibleTime = Math.max(minPossibleTime, processingTime.get(i) + task.get(j));
            }
        }
        return minPossibleTime;

    }

}
