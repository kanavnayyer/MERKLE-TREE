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
public class App {
    public static void main(String[] args) {
        List<String> transaction= new ArrayList<>();
        transaction.add("aa");
        transaction.add("bb");
        transaction.add("ab");
        merklerootTree tree= new merklerootTree(transaction);
        System.out.println(tree.getMerkeRoot());
    }
   
}
