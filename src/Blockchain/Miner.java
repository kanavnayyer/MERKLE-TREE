/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blockchain;

/**
 *
 * @author kanav
 */

public class Miner {
	
	private double reward;
	
	public void mine(Block block, blockchain blockChain) {
		
		// it takes some time to find the valid hash
		// PoW
		while(!isGoldenHash(block)) {
			block.incrementNonce();
			block.generateHash();
		}
		
		System.out.println(block + " has just mined...");
		System.out.println("Hash is: " + block.getHash());
		
		blockChain.addBlock(block);
		reward += Constants.REWARD;
	}
	
	private boolean isGoldenHash(Block block) {
		String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
		return block.getHash().substring(0,Constants.DIFFICULTY).equals(leadingZeros);
	}

	public double getReward() {
		return this.reward;
	}
}
