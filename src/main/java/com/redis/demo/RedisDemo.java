package com.redis.demo;

import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-20
 * Time: 15:35
 * Description:
 */
public class RedisDemo
{
    public static void main(String[] args)
    {
        //Connecting to Redis server on localhost
        /**
         * 6379是redis服务的默认端口
         */
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
        jedis.set("z","Google.com");
        String z = jedis.get("z");
        System.out.println(z);
        for (int i = 0; i < 100; i++)
        {
            jedis.append(""+i,i+"");
        }
        for (int i = 0; i < 100; i++)
        {
            System.out.println(jedis.get(""+i));
        }



//        String host = "10.10.14.95";
//        int port = 6379;
//        Jedis jedis1  = new Jedis(host,port);
//        jedis1.set("xxx","yyy");
//        System.out.println(jedis1.get("xxx"));
    }

}
