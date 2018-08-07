package com.zipcoin.service;

import com.zipcoin.model.Block;
import com.zipcoin.repository.BlockRepository;
import com.zipcoin.utilities.Miner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BlockService {

    private BlockRepository blockRepository;

    @Autowired
    public BlockService(BlockRepository blockRepository){
        this.blockRepository = blockRepository;
    }

    public Block createBlock(Block block) {
        return blockRepository.saveAndFlush(block);
    }

    public Collection<Block> getAllBlocks() {
        return blockRepository.findAll();
    }

    public Block getMinedBlockById(Long id) {
        Optional<Block> blockToMine = blockRepository.findById(id);
        if (blockToMine.isPresent()) {
            Miner miner = new Miner();
            Block minedBlock = miner.mine(blockToMine.get());
            return blockRepository.save(minedBlock);
        } else {
            return null;
        }
    }

}
