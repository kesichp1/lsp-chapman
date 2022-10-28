package org.howard.edu.lsp.midterm.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * This class contains methods to implement a
 * simplified voting machine.
 * 
 * @author Kesi Chapman
 *
 */

public class VotingMachine {
	Map<String, Integer> candidates = new HashMap<String, Integer>();
	
		/**
		 * This method adds candidates to the HashMap and initializes the
		 * number of votes to 0.
		 * 
		 * @param name is a string that contains the name of the candidate
		 * to add to the HashMap.
		 */
		public void addCandidate(String name) {
			candidates.put(name, 0);
		} 

		/**
		 * This method casts votes to a candidate with the given name. 
		 *
		 * @param name is a string that contains the name of the candidate
		 * to vote for.
		 * @param votes is an integer that contains the value of
		 * the vote for the candidate.
		 */
		public void castVotes(String name, int votes) {
			if(candidates.containsKey(name)) {
				votes = candidates.get(name);
				votes++;
				candidates.put(name, votes);
			}
		}

		/**
		 * This method returns the number of votes for a given candidate.
		 * 
		 * @param names is a string that contains the name of the candidate.
		 * @return the number of votes for a given candidate.
		 * @throws UnknownCandidateException if name is not present.
		 */
		public int getVotes(String names)  throws UnknownCandidateException {
			if (!candidates.containsKey(names)) {
				throw new UnknownCandidateException("The name is not present.");
			}
		
			int value = candidates.get(names);
			
			return value;
		}

		/**
		 * The method gathers the sum of the votes for all candidates.
		 * 
		 * @return the total number of votes for all candidates.
		 */
		public int sum() {
			int sum = 0;
			for (String key : candidates.keySet()) {
				sum += candidates.get(key);
			}
			
			return sum;
		}
	}

