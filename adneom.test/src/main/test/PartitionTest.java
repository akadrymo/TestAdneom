package adneom.test.partitions;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	
	Partition list = null;
	
	@Before
	public void setUp() throws Exception {
		list = new Partition();
	}

	@Test(expected=IllegalArgumentException.class)
	public void test() {
		
		List largeList= new ArrayList();
		
		for(int i =0;i<10;i++)
			largeList.add(i);
		list.doPartition(largeList, -2)
		
		
	}

}
