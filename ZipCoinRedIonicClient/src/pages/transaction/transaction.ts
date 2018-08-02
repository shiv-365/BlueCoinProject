import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { BlockService } from '../../providers/block-service';


/**
 * Generated class for the TransactionPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-transaction',
  templateUrl: 'transaction.html',
})
export class TransactionPage {
  private block : any = {};
  private blocks : Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams, public blockService: BlockService) {
    this.getMinedBlock('block');
  
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad TransactionPage');
  }

  getBlock(id) {
    this.blockService.getBlock(id).subscribe(block => {
      this.block = block;
    })
  }

  getMinedBlock(id) {
    this.blockService.getMinedBlock(id).subscribe(minedBlock => {
      this.block = minedBlock;
  })
  }

}
