package com.zipcoin.config;

import com.zipcoin.model.Block;
import com.zipcoin.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

    @Component
    public class BlockLoader implements ApplicationRunner {
        private BlockRepository block;

        @Autowired
        public BlockLoader(BlockRepository block) {
            this.block = block;
        }



        public void run(ApplicationArguments args) {

            Block[] blocks = new Block[]{
                    new Block(0, "0000aboivsnd9878"),
                    new Block(867, "SuperCrew"),
                    new Block(459, "LoA Team"),
                    new Block(123, "HF Team"),
                    new Block(55555, "Ω≈≈≈≈"),
                    new Block(97, "˙˙˙˙˙˙˙"),
            };

            for (Block x : blocks)
                this.block.save(x);

        }
    }
}
