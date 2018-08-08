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

  transactionForm : FormGroup;
  transaction : Transaction;
  wallets: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
    public transactionService: TransactionService, private formBuilder : FormBuilder) {
        this.transactionForm = this.formBuilder.group({
          senderPublicKey: ['', Validators.required],
          recipientPublicKey: ['', Validators.required],
          amount: ['', Validators.required]
        })
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
    this.transaction = this.transactionForm.value;
    this.transactionService.createTransaction(this.transaction).subscribe(data => this.transaction = data as Transaction,
      err => {
        console.log(err);
      })
  }

}
