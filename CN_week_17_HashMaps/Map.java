package CN_week_17_HashMaps;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int size;
	int numBuckets; // no. of buckets in AL
	
	public Map() {
		numBuckets=5;
		buckets=new ArrayList<>();
		for(int i=0;i<5;i++) {
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {  //key ---> hashFunction//getBucketIndex ---> hashCode
			int hashcode=key.hashCode() ;	   			
			/*Every class is derived form Object class 
			 * so Object class me hashCode implemented he already*/

			return hashcode % numBuckets;
	}
	
	public void insert(K key,V value) {
		int bucketindex= getBucketIndex(key);
		MapNode<K,V>head=buckets.get(bucketindex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return ;
			}
			head=head.next;
		}
		head=buckets.get(bucketindex);
		MapNode<K,V>newElement = new MapNode<K,V>(key,value);
		size++;
		newElement.next=head;
		buckets.set(bucketindex, newElement);
		
		double loadFactor=(1.0*size)/numBuckets;
		if(loadFactor>0.7) {
			rehash();
		}
		
	}
	
	private void rehash() {
		System.out.println("Rehashing: bucketsize= "+ numBuckets+ " size= "+ size);
		
		//it will create a new bucket with double size and which is empty
		
		ArrayList<MapNode<K,V>>temp= buckets;
		buckets = new  ArrayList<>();
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		size=0;
		numBuckets = 2*numBuckets;
		
		//copying the previous head into new one 
		
		for(int i=0;i<temp.size();i++) {
			MapNode<K, V>head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V value=head.value;
				insert(key, value);
				head=head.next;
			}
		}
		
	}
	
	public int size() {
		return size;
	}
	
	public double loadFactor() {
		return (1.0*size)/numBuckets;
	}
	
	
	public V getvalue(K key) {
		int bucketindex= getBucketIndex(key);
		MapNode<K,V>head=buckets.get(bucketindex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		
		return null;
		
	}
	public V removeValue(K key) {
		int bucketindex= getBucketIndex(key);
		MapNode<K,V>head=buckets.get(bucketindex);
		MapNode<K,V>prev=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev==null) {
					buckets.set(bucketindex, head.next);
				}else {
				prev.next=head.next;
				return head.value;
			}
			}
			prev=head;
			head=head.next;
		}
		return null;
	}
	
	
}

















