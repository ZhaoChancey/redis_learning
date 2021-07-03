package cn.bjtu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author chancey
 * @create 2020-07-21 20:27
 */
public class TestPool {
    public static void main(String[] args) {
        JedisPool jedisPool = JedisPoolUtils.getJedisPoolInstance();
        Jedis jedis1 = null;
        Jedis jedis = null;
        try {
             jedis = jedisPool.getResource();
             jedis.set("aa","b");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JedisPoolUtils.release(jedisPool, jedis);
        }
        System.out.println("新建");
        System.out.println("更新");
    }
}
