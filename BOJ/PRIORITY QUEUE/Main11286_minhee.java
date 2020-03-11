package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		//1. ����� ���/ ������ ��츦 ���� priorityQueue
		PriorityQueue<Integer> pq_plus = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq_minus = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		//2-1. �Ѵ� ť�� ���������, 0 ���
		//2-2. plus�� ����ִ°��/ minus�� ����ִ� ��� ����ؼ� ���
		//2-3. �Ѵ� �� ��� �ִ� ���
		//2-3-1. ���� ������ ũ�Ⱑ ������, ���̳ʽ� ���� ��� & ����
		//2-3-2. �Ȱ��� ���
		//2-3-2-1. �� ���� ������ ������ ũ�⸦ ���ؼ�, minus�� �� ũ��, plusť���� �� �����ϰ� ���
		//2-3-2-2. �ݴ��� ������ �ۼ�.
		
		for (int i =0;i<n;i++) {
			int nextNum = sc.nextInt();
			
			if(nextNum==0) {
				if(pq_plus.isEmpty() && pq_minus.isEmpty()) {
					System.out.println(0);
				}else {
					if (pq_plus.isEmpty()) {
						System.out.println(pq_minus.poll());
					}else if(pq_minus.isEmpty()) {
						System.out.println(pq_plus.poll());
					}else {
						if(Math.abs(pq_plus.peek()) == Math.abs(pq_minus.peek())) {
							System.out.println(pq_minus.poll());
						}else{
							if(Math.abs(pq_plus.peek()) < Math.abs(pq_minus.peek())) {
								System.out.println(pq_plus.poll());
							}else {
								System.out.println(pq_minus.poll());
							}
						}
					}
				}
			}else {
				if (nextNum >0) {
					pq_plus.add(nextNum);
				}else if(nextNum <0) {
					pq_minus.add(nextNum);
				}
			}
		}
		
		
	}

}
