package in.ashwanik.pdp.behavioral.strategy;

public interface CacheService {

    CacheType save(String key,
                   String value,
                   CacheType cacheType);

    String get(String key,
               CacheType cacheType);
}
