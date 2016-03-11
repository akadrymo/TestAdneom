/**
 * 
 */

package adneom.test.partitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;



public class Partition {


	public List<List<Integer>> doPartition(List largeList, Integer targetSize) {

		List<List<Integer>> output = ListUtils.partition(largeList, targetSize);
		return output;
		
	}

}
