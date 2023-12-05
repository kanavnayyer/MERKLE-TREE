/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blockchain;

/**
 *
 * @author kanav
 */
public class App {

    public static void main(String[] args) {

        blockchain chain = new blockchain();
        Miner miner = new Miner();

        Block block0 = new Block(0, "", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, chain);
        Block block1 = new Block(1, "transaction1", chain.getBlockchain().get(chain.getSize() - 1).getHash());
        miner.mine(block1, chain);
        Block block2 = new Block(2, "transaction2", chain.getBlockchain().get(chain.getSize() - 1).getHash());
        miner.mine(block2, chain);
        Block block3 = new Block(3, "transaction3", chain.getBlockchain().get(chain.getSize() - 1).getHash());
        miner.mine(block3, chain);
        System.out.println("\n" + "BlockChain:" + chain);
        System.out.println("\n Miner reward " + miner.getReward());
    }

}
