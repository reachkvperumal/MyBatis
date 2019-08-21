package com.example.controller;

import com.example.dao.PlayerMapper;
import com.example.model.PlayerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    private PlayerMapper playerMapper;

    @RequestMapping(value = "/matchById/{id}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<PlayerInfo> bookByIsbn(@PathVariable("id") int id) {
        return playerMapper.findPlayersByMatchId(id);
    }
}
