package com.zipcoin.controller;

import com.zipcoin.model.Block;
import com.zipcoin.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static com.zipcoin.config.BlockApis.BASE_BLOCK_URL;
import static com.zipcoin.config.BlockApis.GET_MINED_BLOCK_BY_ID;

@RestController
@CrossOrigin(origins = {"http://localhost:8100"})
public class BlockController {

    private BlockService blockService;

    @Autowired
    public BlockController(BlockService blockService){
        this.blockService = blockService;
    }

    @PostMapping(path = BASE_BLOCK_URL)
    public Block createBlock(@RequestBody Block block){
        return blockService.createBlock(block);
    }

    @GetMapping(path = BASE_BLOCK_URL)
    public Collection<Block> getAllBlocks(){
        return blockService.getAllBlocks();
    }

    @GetMapping(path = GET_MINED_BLOCK_BY_ID)
    public Block getMinedBlockById(@PathVariable Long id){
        return blockService.getMinedBlockById(id);
    }
}
