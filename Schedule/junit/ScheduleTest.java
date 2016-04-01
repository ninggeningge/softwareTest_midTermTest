import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class ScheduleTest {

	@Test
	public void test() {
		Schedule schedule = new Schedule();
		ArrayList<Work> works = new ArrayList<Work>();
		ArrayList<Double> result1 = new ArrayList<Double>();
		ArrayList<Double> result2 = new ArrayList<Double>();
		Work work1 = new Work("w1", 1, 1);
		Work work2 = new Work("w2", 2, 6);
		Work work3 = new Work("w3", 3, 2);
		works.add(work1);
		works.add(work2);
		works.add(work3);
		result1 = (ArrayList<Double>) schedule.FCFS(works);
		result2 = (ArrayList<Double>) schedule.SJF(works);
		assertEquals((double)14/3, result1.get(0).doubleValue());
		assertEquals((double)(1 + 6 + 3.5 ) /3, result1.get(1).doubleValue());
	}

}
