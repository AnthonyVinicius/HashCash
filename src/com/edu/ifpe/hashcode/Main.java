package com.edu.ifpe.hashcode;

public class Main {

	public static void main(String[] args) {
		HashTable<String, Integer> hashTable = new HashTable<>();
		hashTable.put("key1", 100);
		hashTable.put("key2", 200);
		System.out.println("Value for key1: " + hashTable.get("key1"));
		System.out.println("Value for key2: " + hashTable.get("key2"));

		LRUCache<String, Integer> lruCache = new LRUCache<>(5);
		lruCache.put("key1", 100);
		lruCache.displayCacheContents();
		lruCache.put("key2", 200);
		lruCache.displayCacheContents();
		lruCache.put("key3", 300);
		lruCache.displayCacheContents();
		lruCache.put("key4", 400);
		lruCache.displayCacheContents();
		lruCache.put("key5", 500);
		lruCache.displayCacheContents();
		lruCache.put("key6", 600);
		lruCache.displayCacheContents();
		lruCache.put("key7", 700);
		lruCache.displayCacheContents();
		lruCache.put("key8", 800);
		lruCache.displayCacheContents();
		lruCache.put("key9", 900);
		lruCache.displayCacheContents();
	}
}


