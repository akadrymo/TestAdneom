package adneom.test.partitions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {

	Partition p;
	

	@Before
	public void setUp() throws Exception {
		p = new Partition();
	}
	
	private List<Integer> createListe()
	{
		List list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		
		return list;
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void tailleNegative() {
		
		p.doPartition(createListe(), -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void tailleZero() {
		
		p.doPartition(createListe(), 0);
	}

	@Test
	public void tailleSuperieurTailleListe() {
		
		List<List<Integer>> expectedoutput = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			

			subList.add(i);

			
		}
		expectedoutput.add(subList);

		assertEquals(p.doPartition(createListe(), 20), expectedoutput);
	}

	@Test
	public void tailleInferieurTailleListe() {
	

		List<List<Integer>> expectedoutput = new ArrayList<>();



		for (int i = 0; i < 10; i=i+2) {
			List<Integer> subList = new ArrayList<>();

			subList.add(i);
			subList.add(i+1);

			expectedoutput.add(subList);
		}

		assertEquals(p.doPartition(createListe(), 2), expectedoutput);
	}

}
