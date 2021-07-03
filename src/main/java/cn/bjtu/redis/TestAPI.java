package cn.bjtu.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author chancey
 * @create 2020-07-21 17:10
 */
public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.227.136", 6379);

        jedis.set("k1", "v1");
        jedis.set("k2", "v2");
        jedis.set("k3", "v3");
//        System.out.println(jedis.get("k1"));

        //key
//        Set<String> keys = jedis.keys("*");
//        System.out.println(keys.size());
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        //String
//        jedis.append("s1", "str1");
//        System.out.println(jedis.get("s1"));
//        System.out.println("----------------------------------------");
//        jedis.mset("str1","v1","str2","v2","str3","v3");
//        System.out.println(jedis.mget("str1","str2","str3"));

        //list
//        jedis.lpush("mylist","v1","v2","v3","v4");
//        List<String> mylist = jedis.lrange("mylist", 0, -1);
//        for (String s : mylist) {
//            System.out.println(s);
//        }

        //set,剩下的看看笔记
    }
}
