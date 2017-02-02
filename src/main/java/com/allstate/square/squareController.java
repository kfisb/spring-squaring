package com.allstate.square;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class squareController {

    @RequestMapping(value = "/math/square/{x}", method = RequestMethod.GET)
    public Map<String, Integer> calculate(@PathVariable int x) {
        int result = Square.calculateSquare(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("square", result);
        return map;
    }
}
