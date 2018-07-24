import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { BlockService } from '../../providers/block-service'
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  private block : any = {};
  private blocks : Array<any>;
  private id = 3;
  
  constructor(public navCtrl: NavController, public blockService: BlockService) {
      this.getAllBlocks();
    }

  getBlock() {
    this.blockService.getBlock(this.id).subscribe(block => {
      this.block = block;
    })
  }
  getAllBlocks() {
    this.blockService.getAllBlocks().subscribe(blocks => {
      this.blocks = blocks;
    })
  }
  btnClicked() {
    this.blockService.getMinedBlock(this.id).subscribe(minedBlock => {
      this.block = minedBlock;
  })
  }
}

//make payment
//block view
//2 pull down list of username and pay other user "blank zips"
// transaction are order by date
// pay tab how many coins``
// 4 tabs block,pay, 