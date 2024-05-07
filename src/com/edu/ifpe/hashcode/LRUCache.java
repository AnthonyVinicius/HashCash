package com.edu.ifpe.hashcode;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> {
	private final int capacity;
	private final LinkedHashMap<K, V> cache;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				return size() > capacity;
			}
		};
	}

	public void put(K key, V value) {
		cache.put(key, value);
	}

	public V get(K key) {
		return cache.getOrDefault(key, null);
	}

	public void remove(K key) {
		cache.remove(key);
	}

	public void displayCacheContents() {
		System.out.println("Cache Contents:");
		for (Map.Entry<K, V> entry : cache.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
