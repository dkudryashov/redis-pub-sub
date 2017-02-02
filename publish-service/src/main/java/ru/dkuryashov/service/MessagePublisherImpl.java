package ru.dkuryashov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

/**
 * Created by d.kudryashov on 02.02.2017.
 */
@Service
public class MessagePublisherImpl implements MessagePublisher {

    @Autowired
    private ChannelTopic topic;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void publish(String message) {

        redisTemplate.convertAndSend(topic.getTopic(), message);
    }

}
