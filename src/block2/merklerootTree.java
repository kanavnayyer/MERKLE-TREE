/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanav
 */
public class merklerootTree {


	//we store the transactions in this list
	private List<String> transactions;
	
	public merklerootTree(List<String> transactions) {
		this.transactions = transactions;
	}
	
	//the root is in this list in the end
	public List<String> getMerkeRoot() {
		return construct(this.transactions);
	}
	
	//it is a recursive function that keeps merging the
	//neighboring hashes (index i and i+1)
	private List<String> construct(List<String> transactions) {
		
		//base case for recursive method calls
		if(transactions.size()==1) return transactions;
		
		//it contains fewer and fewer items in every iteration
		List<String> updatedList = new ArrayList<>();
		
		//merging the neighboring items
		for(int i=0;i<transactions.size()-1;i+=2)
			updatedList.add(mergeHash(transactions.get(i),transactions.get(i+1)));
		
		//if the number of transactions is odd: the last item is hashed with itself
		if(transactions.size()%2==1)
			updatedList.add(mergeHash(transactions.get(transactions.size()-1),transactions.get(transactions.size()-1)));
		
		//recursive method call
		return construct(updatedList);
	}
	
	//concatenate two strings and hash it with SHA256
	private String mergeHash(String hash1, String hash2) {
		String mergedHash = hash1+hash2;
		return CryptographyHelper.hash(mergedHash);
	}


}
