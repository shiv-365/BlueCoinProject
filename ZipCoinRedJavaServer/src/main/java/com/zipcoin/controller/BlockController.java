package com.zipcoin.controller;

import com.zipcoin.model.Block;
import com.zipcoin.utilities.Miner;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zipcoin.repository.BlockRepository;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class BlockController {

    @Autowired
    private BlockRepository blockRepository;

    //CREATE
    @RequestMapping(value = "blocks", method = RequestMethod.POST)
    public Block create(@RequestBody Block block){
        return blockRepository.saveAndFlush(block);
    }

    //READ
    //Gets a single Block by ID
    @RequestMapping(value = "blocks/{id}", method = RequestMethod.GET)
    public Block get(@PathVariable Long id){
        return blockRepository.findOne(id);
    }

    //Gets all Blocks
    @RequestMapping(value = "blocks", method = RequestMethod.GET)
    public List<Block> get(){
        return blockRepository.findAll();
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

    //MINE
    @RequestMapping(value = "blocks/{id}/mine", method = RequestMethod.GET)
    public Block mine(@PathVariable Long id){
        Block blockToMine = blockRepository.findOne(id);
        Miner miner = new Miner();
        Block minedBlock = miner.mine(blockToMine);
        return blockRepository.saveAndFlush(minedBlock);
    }
}
