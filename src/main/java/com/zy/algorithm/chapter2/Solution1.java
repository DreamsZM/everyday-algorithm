package com.zy.algorithm.chapter2;

import com.zy.algorithm.common.Node;

/**
 * 打印两个有序链表的公共部分
 * 时间复杂度O（n）
 * @author Min Zhao
 */
public class Solution1 {

    public void printCommonPart(Node head1, Node head2){
        while (head1 != null && head2 != null){
            if (head1.value < head2.value){
                head1 = head1.next;
            } else if (head1.value > head2.value){
                head2 = head2.next;
            } else {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}
