import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { BlockService } from '../../providers/block-service'
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  private block : any = {};
  private id = 2;
  
  constructor(public navCtrl: NavController, public blockService: BlockService) {
      this.getBlock();
    }

  getBlock() {
    this.blockService.getBlock(this.id).subscribe(block => {
      this.block = block;
    })
  }

}
