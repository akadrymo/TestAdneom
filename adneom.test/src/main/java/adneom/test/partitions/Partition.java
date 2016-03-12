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

import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Partition {
	
	//object for login
	private static final Logger logger = LoggerFactory.getLogger(Partition.class);
	
	
	/**
	 * doPartition
	 * 
	 * @param largeList
	 * @param targetSize
	 * @return
	 */
	
	

	public List<List<Integer>> doPartition(List largeList, Integer targetSize) {
	
		StringBuilder builder = new StringBuilder();
		builder.append("Input data : [targetSize= ");
		builder.append(targetSize);
		builder.append("] [largeList=");
		builder.append(largeList);
		builder.append("] ");
		

		List<List<Integer>> output = ListUtils.partition(largeList, targetSize);
		return output;
		
	}

}
