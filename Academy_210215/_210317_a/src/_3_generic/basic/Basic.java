package _3_generic.basic;

public class Basic<K, V> { //멀티제네릭

	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V get(K key) {
		return value;
	}

	@Override
	public String toString() { // in object class
		return "{" + key + ", " + value + "}";
	}
	
	
}
