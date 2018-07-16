package com.zipcoin.controllers;

import com.zipcoin.block.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zipcoin.repository.BlockRepository;

@RestController
public class BlockController {

    @Autowired
    BlockRepository blockRepository;

    //CREATE
    @RequestMapping(value = "blocks", method = RequestMethod.POST)
    public Block create(@RequestBody Block block){
        return blockRepository.saveAndFlush(block);
    }

    //READ
    @RequestMapping(value = "blocks/{id}", method = RequestMethod.GET)
    public Block get(@PathVariable Long id){
        return blockRepository.findOne(id);
    }

}
