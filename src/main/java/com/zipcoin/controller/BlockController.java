package com.zipcoin.controller;

import com.zipcoin.model.Block;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zipcoin.repository.BlockRepository;

@RestController
@RequestMapping("api/v1/")
public class BlockController {

    @Autowired
    private BlockRepository blockRepository;

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

    //UPDATE
    @RequestMapping(value = "blocks/{id}", method = RequestMethod.PUT)
    public Block update(@PathVariable Long id, @RequestBody Block block){
        Block blockToUpdate = blockRepository.findOne(id);
        BeanUtils.copyProperties(block, blockToUpdate);
        return blockRepository.saveAndFlush(blockToUpdate);
    }

    //DELETE
    @RequestMapping(value = "blocks/{id}", method = RequestMethod.DELETE)
    public Block delete(@PathVariable Long id){
        Block blockToDelete = blockRepository.findOne(id);
        blockRepository.delete(blockToDelete);
        return blockToDelete;
    }

}
