public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min heap based on node value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Step 1: Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy node to build result
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        // Step 2: Process heap
        while (!minHeap.isEmpty()) {
            // Get smallest node
            ListNode smallest = minHeap.poll();

            // Add it to result
            cur.next = smallest;
            cur = cur.next;

            // If there's a next node, push it into heap
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}