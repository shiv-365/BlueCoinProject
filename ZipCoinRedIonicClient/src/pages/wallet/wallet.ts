import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { TransactionService } from '../../providers/transaction-service';
import { Transaction } from '../../model/transaction';
import { FormGroup } from '@angular/forms';

/**
 * Generated class for the WalletPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-wallet',
  templateUrl: 'wallet.html',
})
export class WalletPage {

  transactionForm : FormGroup;
  transaction : Transaction;

  constructor(public navCtrl: NavController, public navParams: NavParams, public transactionService: TransactionService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad WalletPage');
  }

  createTransaction(){
    this.transactionService.createTransaction(this.transaction);
  }

}
