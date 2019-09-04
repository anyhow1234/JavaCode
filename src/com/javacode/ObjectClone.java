package com.javacode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author hans
 * @Date 2019/4/30 17:34
 * @Version 1.0
 */
public class ObjectClone {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        Integer i = 10;
        a.add(i);
        i = 2;
        a.add(i);
        i = 3;
        a.add(i);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
    }
//    public List<Integer> preorderTraversal(TreeNode root) {
////        List<TreeNode> nodeList = new ArrayList<>();
////        List<Integer> list = new ArrayList<>();
////        while(root != null){
////            list.add(root);
////            if(root.left != null){
////                root = root.left;
////                continue;
////            }
////            if(root.right != null){
////                root = root.right;
////                continue;
////            }
////            Boolean end = false;
////            for(int i = list.size() - 1;i >= 0 ; i--){
////                if(list.get(i).right != null && !list.contains(list.get(i).right)){
////                    root = list.get(i).right;
////                    break;
////                }
////                if(i == 0){
////                    end = true;
////                }
////            }
////            if(end){
////                break;
////            }
////        }
////        List<Integer> a = nodeList.steam()
//    }
//    public TreeNode buildNode(Integer[] is) {
//        if(is == null || is.length == 0){
//            return null;
//        }
//        TreeNode root = new TreeNode(is[0]);
//        for(int i = 0 ; i < is.length; i++){
//            TreeNode node = new TreeNode(is[i]);
////            node.left
//        }
//    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}