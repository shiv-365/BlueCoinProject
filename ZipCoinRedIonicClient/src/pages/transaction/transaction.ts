import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
<<<<<<< HEAD
import { BlockService } from '../../providers/block-service';

=======
import { TransactionService } from '../../providers/transaction-service';
>>>>>>> 8b1e22a5a0caf7af0d9105c89403f7d2bcc4b254

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

<<<<<<< HEAD
  constructor(public navCtrl: NavController, public navParams: NavParams, public blockService: BlockService) {
    this.getMinedBlock('block');
  
=======
  private transactions : Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
  public transactionService: TransactionService){
    this.getAllTransactions();
<<<<<<< HEAD
=======
>>>>>>> 8b1e22a5a0caf7af0d9105c89403f7d2bcc4b254
>>>>>>> dev
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad TransactionPage');
  }

<<<<<<< HEAD
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

=======
  getAllTransactions() {
    this.transactionService.getAllTransactions().subscribe(transactions => {
      this.transactions = transactions;
    })
  }

>>>>>>> 8b1e22a5a0caf7af0d9105c89403f7d2bcc4b254
}
