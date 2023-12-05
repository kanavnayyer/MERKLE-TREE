/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blockchain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kanav
 */
public class blockchain {

    private List<Block> blockchain;

    public blockchain() {
        this.blockchain = new LinkedList<>();
    }

    public void addBlock(Block block) {
        this.blockchain.add(block);
    }

    public List<Block> getBlockchain() {
        return this.blockchain;
    }

    public int getSize() {
        return this.blockchain.size();
    }

    @Override
    public String toString() {
        String s = "";
        for (Block block : this.blockchain) {
            s += block.toString() + "\n";
        }
        return s;
    }

}
