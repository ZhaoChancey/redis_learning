package cn.bjtu.redis;

import redis.clients.jedis.Jedis;

/**
 * @author chancey
 * @create 2020-07-21 20:00
 */
public class TestMS {
    public static void main(String[] args) {
        Jedis jedis_M = new Jedis("192.168.227.136", 6379);
        Jedis jedis_S = new Jedis("192.168.227.136", 6380);

        jedis_S.slaveof("192.168.227.136",6379);

        jedis_M.set("class","1111");

        String res = jedis_S.get("class");

        System.out.println(res);
    }
}
