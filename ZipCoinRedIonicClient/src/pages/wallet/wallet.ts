import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { TransactionService } from '../../providers/transaction-service';
import { Transaction } from '../../model/transaction';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@IonicPage()
@Component({
  selector: 'page-wallet',
  templateUrl: 'wallet.html',
})
export class WalletPage {


  // transactionForm : FormGroup;
  
  // senderPublicKey: any;
  // recipientPublicKey: any;
  // amount: any;
  transaction: any;
  wallets: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
    public transactionService: TransactionService){
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad WalletPage');
    this.getAllWallets;
  }

  getAllWallets(){
    this.transactionService.getAllWallets().subscribe(wallets => {
      this.wallets = wallets;
    })
  }

  createTransaction(){
    this.transactionService.createTransaction(this.transaction).subscribe(data => this.transaction = data as Transaction,
      err => {
        console.log(err);
      })
  }

}
