package ru.dkudryashov.controller;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by d.kudryashov on 02.02.2017.
 */
public class RedisMessageSubscriber implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println(message.toString());
    }
}
