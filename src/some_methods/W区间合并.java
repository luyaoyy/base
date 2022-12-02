package w一些方法;

import java.util.ArrayList;
import java.util.Scanner;



class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class W区间合并 {
	public static void main(String[] args) {
		ArrayList<Node> node=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			node.add(new Node(sc.nextInt(),sc.nextInt()));
		}
		for(int i=0;i<node.size()-1;i++) {
			if(node.get(i).y>=node.get(i+1).x) {
				node.set(i, new Node(node.get(i).x,node.get(i+1).y>node.get(i).y?node.get(i+1).y:node.get(i).y));
				node.remove(i+1);
			}
		}
		if(node.get(node.size()-2).y>=node.get(node.size()-1).x) {
			node.set(node.size()-2, new Node(node.get(node.size()-2).x,node.get(node.size()-1).y));
			node.remove(node.size()-1);
		}
	
		for(Node i:node)
			System.out.println(i.x+" "+i.y);
	}
}
