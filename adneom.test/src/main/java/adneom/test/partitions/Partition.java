/**
 * Partition - Manipulation de liste d'entier
 * 
 * @version 1.0
 * 
 * @author  Aminou KADRY
 * @copyright Aminou KADRY
 * @date 11/03/2016
 * 
 */

package adneom.test.partitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;



public class Partition {

	/**
	 * doPartition
	 * 
	 * @param largeList
	 * @param targetSize
	 * @return
	 */
	

	public List<List<Integer>> doPartition(List largeList, Integer targetSize) {

		List<List<Integer>> output = ListUtils.partition(largeList, targetSize);
		return output;
		
	}

}
