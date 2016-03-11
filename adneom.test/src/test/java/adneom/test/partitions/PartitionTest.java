package adneom.test.partitions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {

	Partition p = new Partition();
	List list = null;

	@Before
	public void setUp() throws Exception {
		list = new ArrayList();
	}

	@Test(expected = IllegalArgumentException.class)
	public void tailleNegative() {
		for (int i = 0; i < 10; i++)
			list.add(i);

		p.doPartition(list, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void tailleZero() {
		for (int i = 0; i < 10; i++)
			list.add(i);

		p.doPartition(list, 0);
	}

	@Test
	public void tailleSuperieurTailleListe() {
		for (int i = 0; i < 10; i++)
			list.add(i);

		List<List<Integer>> expectedoutput = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			

			subList.add(i);

			
		}
		expectedoutput.add(subList);

		assertEquals(p.doPartition(list, 20), expectedoutput);
	}

	@Test
	public void tailleInferieurTailleListe() {
		for (int i = 0; i < 10; i++)
			list.add(i);

		List<List<Integer>> expectedoutput = new ArrayList<>();



		for (int i = 0; i < 10; i=i+2) {
			List<Integer> subList = new ArrayList<>();

			subList.add(i);
			subList.add(i+1);

			expectedoutput.add(subList);
		}

		assertEquals(p.doPartition(list, 2), expectedoutput);
	}

}
