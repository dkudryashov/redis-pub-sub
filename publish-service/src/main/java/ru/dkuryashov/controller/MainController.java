package ru.dkuryashov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.dkuryashov.service.MessagePublisher;

import java.util.stream.IntStream;

/**
 * Created by d.kudryashov on 02.02.2017.
 */
@RestController
public class MainController {


    @Autowired
    private MessagePublisher messagePublisher;

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void sendMessage(@RequestParam String message) {
        messagePublisher.publish(message);
    }

    @RequestMapping(value = "/many", method = RequestMethod.PUT)
    public void sendManyMessage() {
        IntStream.range(0, 100000).boxed().parallel()
                .map(String::valueOf)
                .forEach(messagePublisher::publish);
    }

}
