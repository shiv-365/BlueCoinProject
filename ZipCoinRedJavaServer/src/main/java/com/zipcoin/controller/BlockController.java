package com.zipcoin.controller;

import com.zipcoin.model.Block;
import com.zipcoin.utilities.Miner;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zipcoin.repository.BlockRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class BlockController {

    @Autowired
    private BlockRepository blockRepository;

    @RequestMapping(value = "blocks", method = RequestMethod.POST)
    public Block create(@RequestBody Block block){
        return blockRepository.saveAndFlush(block);
    }

    @RequestMapping(value = "blocks/{id}", method = RequestMethod.GET)
    public Optional<Block> get(@PathVariable Long id){
        return blockRepository.findById(id);
    }

    @RequestMapping(value = "blocks", method = RequestMethod.GET)
    public List<Block> get(){
        return blockRepository.findAll();
    }

    @RequestMapping(value = "blocks/{id}", method = RequestMethod.DELETE)
    public Block delete(@PathVariable Long id){
        Block blockToDelete = blockRepository.findOne(id);
        blockRepository.delete(blockToDelete);
        return blockToDelete;
    }

    @RequestMapping(value = "blocks/{id}/mine", method = RequestMethod.GET)
    public Block mine(@PathVariable Long id){
        Block blockToMine = blockRepository.findOne(id);
        Miner miner = new Miner();
        Block minedBlock = miner.mine(blockToMine);
        return blockRepository.saveAndFlush(minedBlock);
    }
}
