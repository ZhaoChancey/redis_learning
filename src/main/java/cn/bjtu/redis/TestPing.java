package cn.bjtu.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author chancey
 * @create 2020-07-21 16:26
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.227.136", 6379);
        System.out.println(jedis.ping());

    }
}
