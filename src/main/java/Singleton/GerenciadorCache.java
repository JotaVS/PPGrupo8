package Singleton;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorCache {

    private static GerenciadorCache instance;
    private Map<String, Object> cache;

    private GerenciadorCache() {
        cache = new HashMap<>();
    }

    public static synchronized GerenciadorCache getInstance() {
        if (instance == null) {
            instance = new GerenciadorCache();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public boolean contains(String key) {
        return cache.containsKey(key);
    }

    public void remove(String key) {
        cache.remove(key);
    }
}
