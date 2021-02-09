package leetCode.addTwoNumberV3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currNodeL1 = l1;
        ListNode currNodeL2 = l2;
        int additionalTen = 0;
        ListNode currNodeSummaNumber = new ListNode();
        List nodesSummaNumberList = new ArrayList<Integer>();
        int i=0;
        do {
            int val1 = 0;
            int val2 = 0;
            if (currNodeL1 == null & currNodeL2 != null) {
                val1 = 0;
                val2 = currNodeL2.val;
            } else if (currNodeL2 == null & currNodeL1 != null) {
                val1 = currNodeL1.val;
                val2 = 0;
            } else {
                val1 = currNodeL1.val;
                val2 = currNodeL2.val;
            }
            int sum = val1+ val2 + additionalTen;
            currNodeSummaNumber.val = sum%10;
            System.out.println("!!!!!! "+currNodeSummaNumber.val);
            additionalTen = sum/10;
            nodesSummaNumberList.add(i, currNodeSummaNumber);
            i++;
            currNodeSummaNumber.next = new ListNode();
            currNodeSummaNumber = currNodeSummaNumber.next;
            try {
                currNodeL1 = currNodeL1.next;
            } catch (Exception e) {
                currNodeL1 = null;
            }
            try {
                currNodeL2 = currNodeL2.next;
            } catch (Exception e){
                currNodeL2 = null;
            }
        } while (currNodeL1 != null | currNodeL2 != null);
        if (additionalTen > 0) {
            currNodeSummaNumber= new ListNode(additionalTen);
            nodesSummaNumberList.add(currNodeSummaNumber);
        }
        nodesSummaNumberList.forEach(System.out::println);
        int[] arr = new int[nodesSummaNumberList.size()];
        for (int j = 0; j < nodesSummaNumberList.size(); j++) {
            ListNode node = (ListNode) nodesSummaNumberList.get(j);
            arr[j] = node.val;
        }
        return createListNodeViewOfNumber(arr, "listNode3");
    }

    public static ListNode createListNodeViewOfNumber (int[] num, String nameListNode) {
        Map<String,ListNode> map = new HashMap<>();
        for (int i=0; i<num.length; i++) {
            map.put(nameListNode + i, new ListNode(num[i]));
        }
        for (int i=0; i<num.length; i++) {
            map.get(nameListNode + i).next = map.get(nameListNode + (i+1));
        }
        return map.get(nameListNode + 0);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 class Main {
    public static void main(String[] args) {
        int num1[] = {5,6,4,8,9};
        int num2[] = {7,0,8,7};
        Solution sol = new Solution();
        ListNode l1 = sol.createListNodeViewOfNumber(num1, "listNode1");
        ListNode l2 = sol.createListNodeViewOfNumber(num2, "listNode2");
        System.out.println(l1.val + " " + l1.next.val + " " + l1.next.next.val);
        System.out.println(l2.val + " " + l2.next.val + " " + l2.next.next.val);
        ListNode l3 = sol.addTwoNumbers(l1,l2);
        System.out.println(l3.val + " " +
                l3.next.val + " " +
                l3.next.next.val + " " +
                l3.next.next.next.val + " " +
                l3.next.next.next.next.val);
    }
}