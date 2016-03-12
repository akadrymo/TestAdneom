/**
 * Partition - Manipulation d'une liste d'entier
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
	 * doPartition est un methode permettant de renvoyer une liste contenant des sous-liste
	 *             d'une liste d'entier passee en parametre selon un taille donne 
	 * 
	 * @param largeList liste d'entier à partitioner
	 * @param targetSize entier correspondant à la taille de la partition à créer
	 * @return
	 */
	
	

	public List<List<Integer>> doPartition(List largeList, Integer targetSize) {
	
		StringBuilder builder = new StringBuilder();
		builder.append("Input data : [targetSize= ");
		builder.append(targetSize);
		builder.append("] [largeList=");
		builder.append(largeList);
		builder.append("] ");
		logger.info (builder.toString());

		//Partitionnement de la liste passe en paramettre selon la taille passé en parametre
		List<List<Integer>> output = ListUtils.partition(largeList, targetSize);
		
		
		builder.append("Output data : [output");
		builder.append(output);
		builder.append("] ");
		logger.info (builder.toString());
		
		return output;
		
	}

}
