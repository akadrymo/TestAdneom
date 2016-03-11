/**
 * 
 */

package adneom.test.partitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;



public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++)
			list.add(i);
		
		List<List<Integer>> output = doPartition(list, 1);
		System.out.println(output);

	}

	public static List<List<Integer>> doPartition(List largeList, Integer targetSize) {

		List<List<Integer>> output = ListUtils.partition(largeList, targetSize);
		return output;
		
	}

}
